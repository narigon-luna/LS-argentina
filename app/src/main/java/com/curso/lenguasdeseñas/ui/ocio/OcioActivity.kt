package com.curso.lenguasdeseñas.ui.ocio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityOcioBinding
import com.curso.lenguasdeseñas.dominio.model.model.ocio.OcioInfo
import com.curso.lenguasdeseñas.dominio.model.model.ocio.OcioModel
import com.curso.lenguasdeseñas.ui.ocio.ocioadapter.OcioAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class OcioActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOcioBinding
    private val ocioViewModel: OcioViewModel by viewModels()
    private lateinit var ocioAdapter: OcioAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOcioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }


    private fun initList() {
        ocioAdapter = OcioAdapter(onItemSelecte = {
            when(it){
                OcioInfo.Avion -> OcioModel.Avion
                OcioInfo.Auto -> OcioModel.Auto
                OcioInfo.Barco -> OcioModel.Barco
                OcioInfo.Bicicleta -> OcioModel.Bicicleta
                OcioInfo.Camion -> OcioModel.Camion
                OcioInfo.CampingCarpa -> OcioModel.CampingCarpa
                OcioInfo.Cine -> OcioModel.Cine
                OcioInfo.Colectivo -> OcioModel.Colectivo
                OcioInfo.Deportes -> OcioModel.Deportes
                OcioInfo.FelizCumpleaños -> OcioModel.FelizCumpleaños
                OcioInfo.Fiesta -> OcioModel.Fiesta
                OcioInfo.Fotografia -> OcioModel.Fotografia
                OcioInfo.Helicoptero -> OcioModel.Helicoptero
                OcioInfo.Hotel -> OcioModel.Hotel
                OcioInfo.Maar -> OcioModel.Maar
                OcioInfo.Microomnibus -> OcioModel.Microomnibus
                OcioInfo.Montaña -> OcioModel.Montaña
                OcioInfo.Moto -> OcioModel.Moto
                OcioInfo.Musica -> OcioModel.Musica
                OcioInfo.Navidad -> OcioModel.Navidad
                OcioInfo.Parque -> OcioModel.Parque
                OcioInfo.Peliculas -> OcioModel.Peliculas
                OcioInfo.Regalo -> OcioModel.Regalo
                OcioInfo.Rio -> OcioModel.Rio
                OcioInfo.SemanaSanta -> OcioModel.SemanaSanta
                OcioInfo.Subte -> OcioModel.Subte
                OcioInfo.Taxi -> OcioModel.Taxi
                OcioInfo.Teatro -> OcioModel.Teatro
                OcioInfo.Tren -> OcioModel.Tren
                OcioInfo.Turismo -> OcioModel.Turismo
                OcioInfo.Vacaciones -> OcioModel.Vacaciones
                OcioInfo.Viajar ->OcioModel.Viajar
            }
        })
        binding.rvOcio.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ocioAdapter
        }
    }
    private fun initUIState() {
      lifecycleScope.launch {
          repeatOnLifecycle(Lifecycle.State.STARTED){
              ocioViewModel.ocio.collect{
                  ocioAdapter.updateList(it)
              }
          }
      }
    }
}