package com.curso.lenguasdeseñas.ui.portada

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
import com.curso.lenguasdeseas.databinding.FragmentPortadaBinding
import com.curso.lenguasdeseñas.dominio.model.model.portadamodel.PortadaInfo
import com.curso.lenguasdeseñas.dominio.model.model.portadamodel.PortadaModel
import com.curso.lenguasdeseñas.ui.portada.portadaadapter.PortadaAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PortadaFragment : Fragment() {

    private val portadaViewModel by viewModels<PortadaViewModel> ()
    private lateinit var portadaAdapter: PortadaAdapter
    private var _binding: FragmentPortadaBinding? = null
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
        portadaAdapter = PortadaAdapter(onItemSelecte = {
            when(it) {
                PortadaInfo.Introduccion -> PortadaModel.Introduccion
                PortadaInfo.Explicacion -> PortadaModel.Explicacion
            }
        })
        binding.rvPortada.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = portadaAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                portadaViewModel.portada.collect {
                    portadaAdapter.updateList(it)
                }
            }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentPortadaBinding.inflate(layoutInflater, container , false)
        return binding.root
    }


}