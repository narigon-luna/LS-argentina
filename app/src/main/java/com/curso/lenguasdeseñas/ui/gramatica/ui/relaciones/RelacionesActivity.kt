package com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityRelacionesBinding
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.RelacionesInfo
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.RelacionesModel
import com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.adapter.RelacionAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RelacionesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRelacionesBinding

    private val relacionesViewModel: RelacionesViewModel by viewModels()

    private lateinit var relacionAdapter: RelacionAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityRelacionesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }



    private fun initList() {
        relacionAdapter = RelacionAdapter(onItemSelecte = {
            when(it){
                RelacionesInfo.Amante -> RelacionesModel.Amante
                RelacionesInfo.Ahijadoa -> RelacionesModel.Ahijadoa
                RelacionesInfo.Amigoa -> RelacionesModel.Amigoa
                RelacionesInfo.Compañeroa -> RelacionesModel.Compañeroa
                RelacionesInfo.Madrina -> RelacionesModel.Madrina
                RelacionesInfo.Novioa -> RelacionesModel.Novioa
                RelacionesInfo.Padrino -> RelacionesModel.Padrino
                RelacionesInfo.Pareja -> RelacionesModel.Pareja
                RelacionesInfo.Señor -> RelacionesModel.Señor
                RelacionesInfo.Señora ->RelacionesModel.Señora
            }
        })
        binding.rvRelaciones.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = relacionAdapter
        }
    }
    private fun initUIState() {
       lifecycleScope.launch {
           repeatOnLifecycle(Lifecycle.State.STARTED){
               relacionesViewModel.relacion.collect{
                   relacionAdapter.updateList(it)
               }
           }
       }
    }
}