package com.curso.lenguasdeseñas.ui.verbosypron

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.FragmentVYPBinding
import com.curso.lenguasdeseñas.dominio.model.model.vypmodel.VyPInfo
import com.curso.lenguasdeseñas.dominio.model.model.vypmodel.VyPModel
import com.curso.lenguasdeseñas.ui.verbosypron.vypadapter.VyPAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class VyPFragment : Fragment() {
    private val vyPViewModel by viewModels<VyPViewModel>()
    private lateinit var vyPAdapter: VyPAdapter

    private var _binding: FragmentVYPBinding? = null

    private val binding get() = _binding!!

    override fun onViewCreated(view: View,savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initList()
        initUIState()
    }


    private fun initList() {
       vyPAdapter = VyPAdapter( onItemSelecte = {
           when(it) {
               VyPInfo.Adverbios -> VyPModel.Adverbios
               VyPInfo.Interrogaciones ->VyPModel.Interrogaciones
               VyPInfo.PronombresPersonales -> VyPModel.PronombresPersonales
               VyPInfo.ReferenciasTemporales -> VyPModel.ReferenciasTemporales
               VyPInfo.VerbosDeDesplazamiento -> VyPModel.VerbosDeDesplazamiento
           }
       })
        binding.rvVyp.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = vyPAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                vyPViewModel.vyp.collect {
                    //Cambio de general
                    vyPAdapter.updateList(it)
                }
            }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
      _binding = FragmentVYPBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}