package com.curso.lenguasdeseñas.ui.partdelhog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityPartDelHogMainBinding
import com.curso.lenguasdeseas.databinding.ActivityPpactivityBinding
import com.curso.lenguasdeseñas.dominio.model.model.pertdelhog.PartdelHoModel
import com.curso.lenguasdeseñas.dominio.model.model.pertdelhog.ParteDelHogInfo
import com.curso.lenguasdeseñas.ui.partdelhog.adapter.PartDelHogarAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PartDelHogMainActivity : AppCompatActivity() {

            private lateinit var binding: ActivityPartDelHogMainBinding
            private val parDelHogarViewModel: PartedelHogarViewModel by viewModels()
            private lateinit var partDelHogarAdapter: PartDelHogarAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityPartDelHogMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }

    private fun initList() {
        partDelHogarAdapter = PartDelHogarAdapter(onItemSelect = {
            when(it){
                ParteDelHogInfo.Ascensor -> PartdelHoModel.Ascensor
                ParteDelHogInfo.Baño -> PartdelHoModel.Baño
                ParteDelHogInfo.Cocina -> PartdelHoModel.Cocina
                ParteDelHogInfo.Comedor -> PartdelHoModel.Comedor
                ParteDelHogInfo.Dormitorio -> PartdelHoModel.Dormitorio
                ParteDelHogInfo.Edificio ->PartdelHoModel.Edificio
                ParteDelHogInfo.Fondo -> PartdelHoModel.Fondo
                ParteDelHogInfo.GarajeCochera -> PartdelHoModel.GarajeCochera
                ParteDelHogInfo.Jardin -> PartdelHoModel.Jardin
                ParteDelHogInfo.Living -> PartdelHoModel.Living
                ParteDelHogInfo.Terraza -> PartdelHoModel.Terraza
                ParteDelHogInfo.Vivienda ->PartdelHoModel.Vivienda
            }
        })
        binding.rvPH.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = partDelHogarAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                parDelHogarViewModel.partdhor.collect{
                    partDelHogarAdapter.updatelist(it)
                }
            }
        }
    }
}