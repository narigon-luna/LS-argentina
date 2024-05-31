package com.curso.lenguasdeseñas.ui.ropayacc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityRopayAccMainBinding
import com.curso.lenguasdeseñas.dominio.model.model.ropayacc.RopaYAccModel
import com.curso.lenguasdeseñas.dominio.model.model.ropayacc.RopayAccInfo
import com.curso.lenguasdeseñas.ui.ropayacc.adapter.RopayAccAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RopayAccMainActivity : AppCompatActivity() {
            private lateinit var binding: ActivityRopayAccMainBinding

            private val ropauAccViewModel: RopayAccViewModel by viewModels ()

            private lateinit var ropayAccAdapter: RopayAccAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRopayAccMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }

    private fun initList() {
        ropayAccAdapter = RopayAccAdapter(onItemSelect = {
            when(it){
                RopayAccInfo.Ropa -> RopaYAccModel.Ropa
                RopayAccInfo.Anillo ->  RopaYAccModel.Anillo
                RopayAccInfo.Anteojos ->  RopaYAccModel.Anteojos
                RopayAccInfo.Aros ->  RopaYAccModel.Aros
                RopayAccInfo.Blusa -> RopaYAccModel.Blusa
                RopayAccInfo.Bufanda ->  RopaYAccModel.Bufanda
                RopayAccInfo.Buzo ->  RopaYAccModel.Buzo
                RopayAccInfo.Cadena ->  RopaYAccModel.Cadena
                RopayAccInfo.Camisa ->  RopaYAccModel.Camisa
                RopayAccInfo.Campera -> RopaYAccModel.Campera
                RopayAccInfo.Cartera -> RopaYAccModel.Cartera
                RopayAccInfo.Cinto ->  RopaYAccModel.Cinto
                RopayAccInfo.Gorro ->  RopaYAccModel.Gorro
                RopayAccInfo.Guardapolvo ->  RopaYAccModel.Guardapolvo
                RopayAccInfo.Jeans ->  RopaYAccModel.Jeans
                RopayAccInfo.Ojotas -> RopaYAccModel.Ojotas
                RopayAccInfo.Pantalon ->  RopaYAccModel.Pantalon
                RopayAccInfo.Pantunflas ->  RopaYAccModel.Pantunflas
                RopayAccInfo.Pañuelo -> RopaYAccModel.Pañuelo
                RopayAccInfo.Pijama ->  RopaYAccModel.Pijama
                RopayAccInfo.Pollera -> RopaYAccModel.Pollera
                RopayAccInfo.Pulsera -> RopaYAccModel.Pulsera
                RopayAccInfo.Reloj ->  RopaYAccModel.Reloj
                RopayAccInfo.Remera ->  RopaYAccModel.Remera
                RopayAccInfo.Ropainteriordemujer ->  RopaYAccModel.Ropainteriordemujer
                RopayAccInfo.Saco ->  RopaYAccModel.Saco
                RopayAccInfo.Tapado ->  RopaYAccModel.Tapado
                RopayAccInfo.Vestido -> RopaYAccModel.Vestido
                RopayAccInfo.Zapatillas ->  RopaYAccModel.Zapatillas
                RopayAccInfo.Zapatos ->  RopaYAccModel.Zapatos
            }
        })
        binding.rvRopyAcc.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ropayAccAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                ropauAccViewModel.ropayacc.collect{
                    ropayAccAdapter.updatelist(it)
                }
            }
        }
    }
}