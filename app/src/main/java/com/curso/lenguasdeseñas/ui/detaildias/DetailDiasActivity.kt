package com.curso.lenguasdeseñas.ui.detaildias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityDetailColoresBinding
import com.curso.lenguasdeseas.databinding.ActivityDetailDiasBinding
import com.curso.lenguasdeseñas.dominio.model.model.modeldias.DiasInfo
import com.curso.lenguasdeseñas.dominio.model.model.modeldias.DiasModel
import com.curso.lenguasdeseñas.ui.detailcolores.DetailColoresViewModel
import com.curso.lenguasdeseñas.ui.detailcolores.coloresadapter.ColorAdapter
import com.curso.lenguasdeseñas.ui.detaildias.diasadapter.Diasadapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DetailDiasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailDiasBinding
    private val detaiDiasViewModel: DetaiDiasViewModel by viewModels ()
    private lateinit var diasAdapter: Diasadapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailDiasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }

    private fun initUi() {
        initList()
        initUIState()
    }

    private fun initList() {
        diasAdapter = Diasadapter(onItemSelecte = {
            when(it){
                DiasInfo.Lunes -> DiasModel.Lunes
                DiasInfo.Martes -> DiasModel.Martes
                DiasInfo.Miercoles ->  DiasModel.Miercoles
                DiasInfo.Jueves -> DiasModel.Jueves
                DiasInfo.Viernes -> DiasModel.Viernes
                DiasInfo.Sabado -> DiasModel.Sabado
                DiasInfo.Domingo -> DiasModel.Domingo
                DiasInfo.FinDeSemana -> DiasModel.FinDeSemana
                DiasInfo.Semana -> DiasModel.Semana
                DiasInfo.Meses -> DiasModel.Meses
                DiasInfo.Enero ->  DiasModel.Enero
                DiasInfo.Febrero ->  DiasModel.Febrero
                DiasInfo.Marzo ->  DiasModel.Marzo
                DiasInfo.Abril ->  DiasModel.Abril
                DiasInfo.Mayo ->  DiasModel.Mayo
                DiasInfo.Junio ->  DiasModel.Junio
                DiasInfo.Julio ->  DiasModel.Julio
                DiasInfo.Agosto ->  DiasModel.Agosto
                DiasInfo.Setiembre ->  DiasModel.Setiembre
                DiasInfo.Octubre -> DiasModel.Octubre
                DiasInfo.Noviembre ->  DiasModel.Nobiembre
                DiasInfo.Diceimbre ->  DiasModel.Diciembre
                DiasInfo.Año -> DiasModel.Año
                    DiasInfo.Hora -> DiasModel.Hora
                DiasInfo.Mediahora ->DiasModel.Mediahora
                DiasInfo.Menos -> DiasModel.Menos
                DiasInfo.Minutos ->DiasModel.Minutos
                DiasInfo.Segundos -> DiasModel.Segundos
                DiasInfo.Tardar -> DiasModel.Tardar
            }
        })
        binding.rvDias.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = diasAdapter
        }
    }


    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                detaiDiasViewModel.dias.collect {
                    //Cambio de general
                    diasAdapter.updateList(it)
                }
            }
        }
    }
}