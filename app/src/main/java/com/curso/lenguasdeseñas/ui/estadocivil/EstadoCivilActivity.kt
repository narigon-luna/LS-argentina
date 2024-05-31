package com.curso.lenguasdeseñas.ui.estadocivil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityEstadoCivilBinding
import com.curso.lenguasdeseñas.dominio.model.model.estadocivilmodel.EstadoCivilInfo
import com.curso.lenguasdeseñas.dominio.model.model.estadocivilmodel.EstadoCivilModel
import com.curso.lenguasdeseñas.ui.estadocivil.estciviladapter.EstadoCivilAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class EstadoCivilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEstadoCivilBinding

    private val estadoCicilViewModel: EstadoCicilViewModel by viewModels ()

    private lateinit var estadoCivilAdapter: EstadoCivilAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEstadoCivilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }

    private fun initList() {
        estadoCivilAdapter = EstadoCivilAdapter(onItemSelecte = {
            when(it){
                EstadoCivilInfo.Casado -> EstadoCivilModel.Casado
                EstadoCivilInfo.Concubino -> EstadoCivilModel.Concubino
                EstadoCivilInfo.Divorciado -> EstadoCivilModel.Divorciado
                EstadoCivilInfo.Separado -> EstadoCivilModel.Separado
                EstadoCivilInfo.Soltero -> EstadoCivilModel.Soltero
                EstadoCivilInfo.Viudo -> EstadoCivilModel.Viudo
            }
        })

        binding.rvEstCivil.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = estadoCivilAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                estadoCicilViewModel.estaciv.collect {
                    //Cambio de general
                    estadoCivilAdapter.updateList(it)
                }
            }
        }
    }
}