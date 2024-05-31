package com.curso.lenguasdeseñas.ui.verbosypron.ui.vdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityVddactivityBinding
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.vdd.VerDDesplModel
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.vdd.VerboDedespInfo
import com.curso.lenguasdeseñas.ui.verbosypron.ui.vdd.adapter.VDDAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class VDDActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVddactivityBinding
    private val verbosDDViewModel: VerbosDDViewModel by viewModels ()
    private lateinit var vddAdapter: VDDAdapter

       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityVddactivityBinding.inflate(layoutInflater)
           setContentView(binding.root)
           initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }

    private fun initList() {
        vddAdapter = VDDAdapter(onItemSelected = {
          when(it) {
              VerboDedespInfo.Bajar   -> VerDDesplModel.Bajar
              VerboDedespInfo.Caminar -> VerDDesplModel.Caminar
              VerboDedespInfo.Correr -> VerDDesplModel.Correr
              VerboDedespInfo.Entrar -> VerDDesplModel.Entrar
              VerboDedespInfo.Esperar ->VerDDesplModel.Esperar
              VerboDedespInfo.Hacerlatarea -> VerDDesplModel.Hacerlatarea
              VerboDedespInfo.Irsalir -> VerDDesplModel.Irsalir
              VerboDedespInfo.Llegar -> VerDDesplModel.Llegar
              VerboDedespInfo.Quedarse -> VerDDesplModel.Quedarse
              VerboDedespInfo.Subir -> VerDDesplModel.Subir
              VerboDedespInfo.Venir -> VerDDesplModel.Venir
          }
        })
        binding.rvVdd.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = vddAdapter
        }
    }

       private fun initUIState() {
            lifecycleScope.launch {
                repeatOnLifecycle(Lifecycle.State.STARTED) {
                    verbosDDViewModel.vdd.collect {
                        vddAdapter.updatelist(it)
                    }
                }
            }
        }
    }
