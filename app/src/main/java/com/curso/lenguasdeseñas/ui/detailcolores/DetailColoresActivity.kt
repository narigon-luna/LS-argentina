package com.curso.lenguasdeseñas.ui.detailcolores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityDetailColoresBinding
import com.curso.lenguasdeseas.databinding.ActivityDetailDactiloBinding
import com.curso.lenguasdeseñas.dominio.model.model.modelcolores.ColoresInfo
import com.curso.lenguasdeseñas.dominio.model.model.modelcolores.ColoresModel
import com.curso.lenguasdeseñas.ui.detailcolores.coloresadapter.ColorAdapter
import com.curso.lenguasdeseñas.ui.detaildactilologico.dactilologicoadapter.DetailDactiViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
@AndroidEntryPoint
class DetailColoresActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailColoresBinding
    private val detailColoresViewModel: DetailColoresViewModel by viewModels ()
    private lateinit var colorAdapter: ColorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailColoresBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }

    private fun initUi() {
        initList()
        initUIState()
    }


    private fun initList() {
        colorAdapter = ColorAdapter (onItemSelecte = {
            when(it){
           ColoresInfo.Amarillo  -> ColoresModel.Amarillo
                ColoresInfo.Anaranjado -> ColoresModel.Anaranjado
                ColoresInfo.Azul -> ColoresModel.Azul
                ColoresInfo.Beige ->ColoresModel.Beige
                ColoresInfo.Blanco -> ColoresModel.Blanco
                ColoresInfo.Celeste ->ColoresModel.Celeste
                ColoresInfo.Claro -> ColoresModel.Claro
                ColoresInfo.Colores ->ColoresModel.Colores
                ColoresInfo.Dorado -> ColoresModel.Dorado
                ColoresInfo.Gris -> ColoresModel.Gris
                ColoresInfo.Marron -> ColoresModel.Marron
                ColoresInfo.Negro -> ColoresModel.Negro
                ColoresInfo.Opaco -> ColoresModel.Opaco
                ColoresInfo.Oscuro -> ColoresModel.Oscuro
                ColoresInfo.Plateado ->ColoresModel.Plateado
                ColoresInfo.Rojo -> ColoresModel.Rojo
                ColoresInfo.Rosa -> ColoresModel.Rosa
                ColoresInfo.Verde ->ColoresModel.Verde
                ColoresInfo.Violeta -> ColoresModel.Violeta
            }

        })
        binding.rvColores.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = colorAdapter
        }
    }
    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                detailColoresViewModel.colores.collect {
                    //Cambio de general
                    colorAdapter.updateList(it)
                }
            }
        }
    }
}