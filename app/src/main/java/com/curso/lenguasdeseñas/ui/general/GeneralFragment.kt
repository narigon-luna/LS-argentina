package com.curso.lenguasdeseñas.ui.general


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.databinding.FragmentGenaralBinding
import com.curso.lenguasdeseñas.dominio.model.model.generalmodel.GeneralInfo
import com.curso.lenguasdeseñas.dominio.model.model.generalmodel.GeneralModel
import com.curso.lenguasdeseñas.ui.general.adapter.GenaralAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class GeneralFragment : Fragment() {

    private val generalViewModel by viewModels<GeneralViewModel>()
    private lateinit var generalAdapter: GenaralAdapter

    private var _binding: FragmentGenaralBinding? = null

    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initList()
        initUIState()
    }

    private fun initList() {
        generalAdapter = GenaralAdapter(onItemSelecte = {
             when (it) {
                 GeneralInfo.Numeros -> GeneralModel.Numeros
                 GeneralInfo.Dias -> GeneralModel.Dias
                 GeneralInfo.Colores -> GeneralModel.Colores
                 GeneralInfo.EstacionesDelAño -> GeneralModel.EstacionesDelAño
                 GeneralInfo.Clima -> GeneralModel.Clima
                 GeneralInfo.RopayAccesorios -> GeneralModel.RopayAccesorios
                 GeneralInfo.Partesdelhogar -> GeneralModel.Partesdelhogar
                 GeneralInfo.Escuelayeducacion  -> GeneralModel.Escuelayeducacion


                 /**GeneralInfo. -> GeneralModel.AccionCotidiana
                GeneralInfo.CaracteristicasPersonales -> GeneralModel.Caracteristicaspersonales
                GeneralInfo.Colores -> GeneralModel.Colores
                GeneralInfo.Dactilologico -> GeneralModel.Dactilologico
                GeneralInfo.DatosPersonales -> GeneralModel.DatosPersonales
                GeneralInfo.EstadoCivil -> GeneralModel.EstadoCivil
                GeneralInfo.Familia -> GeneralModel.Familia
                GeneralInfo.Hogar -> GeneralModel.Hogar
                GeneralInfo.Relaciones -> GeneralModel.Relaciones
                GeneralInfo.Ropa -> GeneralModel.Ropa*/

             }
        })
            /**val type = when (it) {
                GeneralInfo.AccionCotidiana -> GeneralModel.AccionCotidiana
                GeneralInfo.CaracteristicasPersonales -> GeneralModel.Caracteristicaspersonales
                GeneralInfo.Colores -> GeneralModel.Colores
                GeneralInfo.Dactilologico -> GeneralModel.Dactilologico
                GeneralInfo.DatosPersonales -> GeneralModel.DatosPersonales
                GeneralInfo.EstadoCivil -> GeneralModel.EstadoCivil
                GeneralInfo.Familia -> GeneralModel.Familia
                GeneralInfo.Hogar -> GeneralModel.Hogar
                GeneralInfo.Relaciones -> GeneralModel.Relaciones
                GeneralInfo.Ropa -> GeneralModel.Ropa
            }*/

           // findNavController().navigate(
             //   GeneralFragmentDirections.actionGeneralFragmentToGeneralDetailActivity(type)
            //)

        binding.rvGeneral.apply {
            //layoutManager = GridLayoutManager(context, 2)
             layoutManager = LinearLayoutManager(context)
            adapter = generalAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                generalViewModel.general.collect {
                    //Cambio de general
                    generalAdapter.updateList(it)
                }
            }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGenaralBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}
