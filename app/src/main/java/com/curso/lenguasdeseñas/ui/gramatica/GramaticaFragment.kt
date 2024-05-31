package com.curso.lenguasdeseñas.ui.gramatica

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
import com.curso.lenguasdeseas.databinding.FragmentGramaticaBinding
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaModel
import com.curso.lenguasdeseñas.ui.gramatica.gramaticaadalter.GramaticaAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class GramaticaFragment : Fragment() {

    private val gramaticaViewModel by  viewModels<GramaticaViewModel>()
    private lateinit var gramaticaAdapter: GramaticaAdapter

       private var _binding: FragmentGramaticaBinding? = null

       private val binding get() = _binding!!

    override fun onViewCreated(view: View,savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initList()
        initUIState()
    }

    private fun initUIState() {
        gramaticaAdapter = GramaticaAdapter(onItemSelecte = {
            when(it) {
                GramaticaInfo.CaracteristicasPersonales -> GramaticaModel.CaracteristicasPersonales
                GramaticaInfo.DatosPersonales -> GramaticaModel.DatosPersonales
                GramaticaInfo.EstadoCivil -> GramaticaModel.EstadoCivil
                GramaticaInfo.Familia -> GramaticaModel.Familia
                GramaticaInfo.FormulasDeCortesia -> GramaticaModel.FormulasDeCortesia
                GramaticaInfo.OcioYViaja -> GramaticaModel.OcioYViaja
                GramaticaInfo.Relaciones -> GramaticaModel.Relaciones
                GramaticaInfo.Sentimientos -> GramaticaModel.Sentimientos
                GramaticaInfo.Trabajo -> GramaticaModel.Trabajo
            }
        })
        binding.rvGramatica.apply {
           //layoutManager = GridLayoutManager(context, 2)
           layoutManager = LinearLayoutManager(context)
            adapter = gramaticaAdapter
        }
    }

    private fun initList() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                gramaticaViewModel.gramatica.collect {
                    //Cambio de general
                 gramaticaAdapter.updateList(it)
                }
            }
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGramaticaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}



