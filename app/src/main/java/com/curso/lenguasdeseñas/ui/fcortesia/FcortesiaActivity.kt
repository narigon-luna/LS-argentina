package com.curso.lenguasdeseñas.ui.fcortesia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityFcortesiaBinding
import com.curso.lenguasdeseñas.dominio.model.model.fcortesia.FcortesiaInfo
import com.curso.lenguasdeseñas.dominio.model.model.fcortesia.FcortesiaModel
import com.curso.lenguasdeseñas.ui.fcortesia.fcortesiaadapter.FcortesiaAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FcortesiaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFcortesiaBinding
    private val fcortesiaViewHolder: FcortesiaviewModel by viewModels ()
    private lateinit var fcortesiaAdapter: FcortesiaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFcortesiaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }



    private fun initList() {
      fcortesiaAdapter = FcortesiaAdapter(onItemSelecte = {
          when(it){

              FcortesiaInfo.Bien -> FcortesiaModel.Bien
              FcortesiaInfo.Bienvenido -> FcortesiaModel.Bienvenido
              FcortesiaInfo.BuenDia -> FcortesiaModel.BuenDia
              FcortesiaInfo.BuenasNoches -> FcortesiaModel.BuenasNoches
              FcortesiaInfo.BuenasTardes -> FcortesiaModel.BuenasTardes
              FcortesiaInfo.Chau -> FcortesiaModel.Chau
              FcortesiaInfo.ComoEstas -> FcortesiaModel.ComoEstas
              FcortesiaInfo.DeNada -> FcortesiaModel.DeNada
              FcortesiaInfo.Entender -> FcortesiaModel.Entender
              FcortesiaInfo.Gracias -> FcortesiaModel.Gracias
              FcortesiaInfo.Hola -> FcortesiaModel.Hola
              FcortesiaInfo.Mal -> FcortesiaModel.Mal
              FcortesiaInfo.MasoMenos -> FcortesiaModel.MasoMenos
              FcortesiaInfo.NoEntender -> FcortesiaModel.NoEntender
              FcortesiaInfo.NosVemos -> FcortesiaModel.NosVemos
              FcortesiaInfo.OtraVez -> FcortesiaModel.OtraVez
              FcortesiaInfo.ParFavor -> FcortesiaModel.ParFavor
              FcortesiaInfo.Perdon -> FcortesiaModel.Perdon
              FcortesiaInfo.Permiso -> FcortesiaModel.Permiso
              FcortesiaInfo.TodoBien -> FcortesiaModel.TodoBien
          }
      })
        binding.rvFCort.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = fcortesiaAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                fcortesiaViewHolder.fcortesia.collect {
                    fcortesiaAdapter.updateList(it)
                }
            }
        }
    }
}