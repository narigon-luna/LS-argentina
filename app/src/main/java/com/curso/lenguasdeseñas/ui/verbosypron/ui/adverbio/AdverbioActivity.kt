package com.curso.lenguasdeseñas.ui.verbosypron.ui.adverbio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Lifecycling
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityAdverbioBinding
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.adv.AdverbioInfo
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.adv.AdverbioModel
import com.curso.lenguasdeseñas.ui.verbosypron.ui.adverbio.adapter.AdverbioAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class AdverbioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdverbioBinding
    private val adverbioViewModel: AdverbioViewModel by viewModels ()
    private lateinit var adverbioAdapter: AdverbioAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding = ActivityAdverbioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }

    private fun initList() {
        adverbioAdapter = AdverbioAdapter(onItemSelecte = {
            when(it) {
                AdverbioInfo.Ahi -> AdverbioModel.Ahi
                AdverbioInfo.Alli -> AdverbioModel.Alli
                AdverbioInfo.Aqui -> AdverbioModel.Aqui
                AdverbioInfo.Bastante -> AdverbioModel.Bastante
                AdverbioInfo.Cerca -> AdverbioModel.Cerca
                AdverbioInfo.Demasiado -> AdverbioModel.Demasiado
                AdverbioInfo.Lejos -> AdverbioModel.Lejos
                AdverbioInfo.Mucho -> AdverbioModel.Mucho
                AdverbioInfo.Nada -> AdverbioModel.Nada
                AdverbioInfo.Poco -> AdverbioModel.Poco
            }
        })
        binding.rvAverbio.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adverbioAdapter
        }
    }

    private fun initUIState() {
      lifecycleScope.launch {
          repeatOnLifecycle(Lifecycle.State.STARTED){
              adverbioViewModel.adverbio.collect {
                  adverbioAdapter.updateList(it)
              }
          }
      }
    }


}
