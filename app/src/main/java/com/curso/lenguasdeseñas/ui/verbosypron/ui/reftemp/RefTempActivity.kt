package com.curso.lenguasdeseñas.ui.verbosypron.ui.reftemp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityRefTempBinding
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.reftemp.RefTempInfo
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.reftemp.RefTempModel
import com.curso.lenguasdeseñas.ui.verbosypron.ui.reftemp.adapter.RefTempAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RefTempActivity : AppCompatActivity() {
            private lateinit var binding: ActivityRefTempBinding
            private val refTempViewModel: RefTempViewModel by viewModels ()
            private lateinit var refTempAdapter: RefTempAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRefTempBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }

    private fun initList() {
       refTempAdapter = RefTempAdapter(onItemSelect = {
           when(it) {
               RefTempInfo.Ayer         -> RefTempModel.Ayer
               RefTempInfo.Alamadrugada -> RefTempModel.Alamadrugada
               RefTempInfo.Alamañana    -> RefTempModel.Alamañana
               RefTempInfo.Alanoche -> RefTempModel.Alanoche
               RefTempInfo.Alatarde -> RefTempModel.Alatarde
               RefTempInfo.Almediodia -> RefTempModel.Almediodia
               RefTempInfo.Antes -> RefTempModel.Antes
               RefTempInfo.Antesdeayer -> RefTempModel.Antesdeayer
               RefTempInfo.Dia -> RefTempModel.Dia
               RefTempInfo.Diafestivo -> RefTempModel.Diafestivo
               RefTempInfo.Futuro ->RefTempModel.Futuro
               RefTempInfo.Hasta -> RefTempModel.Hasta
               RefTempInfo.Hoy ->RefTempModel.Hoy
               RefTempInfo.Mañana ->RefTempModel.Mañana
               RefTempInfo.Nunca -> RefTempModel.Nunca
               RefTempInfo.Parasiempre -> RefTempModel.Parasiempre
               RefTempInfo.Pasado -> RefTempModel.Pasado
               RefTempInfo.Pasdomañana -> RefTempModel.Pasdomañana
               RefTempInfo.Primereravez -> RefTempModel.Primereravez
               RefTempInfo.Proximo ->RefTempModel.Proximo
               RefTempInfo.Siempre ->RefTempModel.Siempre
               RefTempInfo.Tardar -> RefTempModel.Tardar
               RefTempInfo.Tarde -> RefTempModel.Tarde
               RefTempInfo.Temprano -> RefTempModel.Temprano
               RefTempInfo.Todoeldia ->RefTempModel.Todoeldia
               RefTempInfo.Todoslaodias -> RefTempModel.Todoslaodias
           }
       })
        binding.rvRefTemp.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = refTempAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                refTempViewModel.refper.collect {
                    refTempAdapter.updatelist(it)
                }
            }
        }
    }


}