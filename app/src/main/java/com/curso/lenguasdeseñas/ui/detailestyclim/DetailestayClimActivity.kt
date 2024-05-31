package com.curso.lenguasdeseñas.ui.detailestyclim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.viewModels
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityDetailDiasBinding
import com.curso.lenguasdeseas.databinding.ActivityDetailestayClimBinding
import com.curso.lenguasdeseñas.dominio.model.model.estycli.EstyClimInfo
import com.curso.lenguasdeseñas.dominio.model.model.estycli.EstyClimModel
import com.curso.lenguasdeseñas.ui.detailcolores.coloresadapter.ColorAdapter
import com.curso.lenguasdeseñas.ui.detailestyclim.estyclimadapter.EstyClimAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DetailestayClimActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailestayClimBinding
    private val detailestayclimViewModel: DetailestyclimViewModel by viewModels ()
    private lateinit var videoView: VideoView
    private lateinit var estayclimAdapter: EstyClimAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailestayClimBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUi()
    }

    private fun initUi() {
        initList()
        initUIState()
    }


    private fun initList() {
      estayclimAdapter = EstyClimAdapter( onItemSelecte = {
          when(it){
              /**EstyClimInfo.Calor -> EstyClimModel.Calor
              EstyClimInfo.Frio -> EstyClimModel.Frio
              EstyClimInfo.Granizo -> EstyClimModel.Granizo
              EstyClimInfo.Invierno -> EstyClimModel.Invierno
              EstyClimInfo.Llovizna -> EstyClimModel.Llovizna
              EstyClimInfo.Mojado -> EstyClimModel.Mojado
              EstyClimInfo.Nieve ->  EstyClimModel.Nieve
              EstyClimInfo.Nublado ->  EstyClimModel.Nublado*/
              EstyClimInfo.Otoño ->   EstyClimModel.Otoño
              EstyClimInfo.Primavera ->  EstyClimModel.Primavera
              EstyClimInfo.Verano ->  EstyClimModel.Verano
             /** EstyClimInfo.Rayos ->  EstyClimModel.Rayos
              EstyClimInfo.Relampago ->  EstyClimModel.Relampago
              EstyClimInfo.Seco ->  EstyClimModel.Seco
              EstyClimInfo.Sol ->  EstyClimModel.Sol
              EstyClimInfo.Verano ->  EstyClimModel.Verano*/
          }
      })
        binding.rvEstayClim.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = estayclimAdapter

        }
    }

    private fun initUIState() {


        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {

               detailestayclimViewModel.estyclim.collect {
                    //Cambio de general
                    estayclimAdapter.updateList(it)

                }
            }
        }

    }
}