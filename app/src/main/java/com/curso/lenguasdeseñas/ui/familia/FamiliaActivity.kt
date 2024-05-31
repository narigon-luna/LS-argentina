package com.curso.lenguasdeseñas.ui.familia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityCarPerBinding
import com.curso.lenguasdeseas.databinding.ActivityFamiliaBinding
import com.curso.lenguasdeseñas.dominio.model.model.familia.FamiliaInfo
import com.curso.lenguasdeseñas.dominio.model.model.familia.FamiliaModel
import com.curso.lenguasdeseñas.ui.familia.familiaadapter.FamialiaAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FamiliaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFamiliaBinding
    private val familiaViewModel: FamiliaViewModel by viewModels()
    private lateinit var familiaAdapter: FamialiaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFamiliaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }


    private fun initList() {
      familiaAdapter = FamialiaAdapter(onItemSelecte = {

          when(it){
              FamiliaInfo.Abueloa -> FamiliaModel.Abueloa
              FamiliaInfo.Ahijado -> FamiliaModel.Ahijado
              FamiliaInfo.Cuñado -> FamiliaModel.Cuñado
              FamiliaInfo.Esposoa -> FamiliaModel.Esposoa
              FamiliaInfo.Familias -> FamiliaModel.Familias
              FamiliaInfo.Gemeloa -> FamiliaModel.Gemeloa
              FamiliaInfo.Generaciones -> FamiliaModel.Generaciones
              FamiliaInfo.Hermanoa -> FamiliaModel.Hermanoa
              FamiliaInfo.Hijoa -> FamiliaModel.Hijoa
              FamiliaInfo.Madrastra -> FamiliaModel.Madrastra
              FamiliaInfo.Mama -> FamiliaModel.Mama
              FamiliaInfo.Mellizosa -> FamiliaModel.Mellizosa
              FamiliaInfo.Nietoa -> FamiliaModel.Nietoa
              FamiliaInfo.Nuera -> FamiliaModel.Nuera
              FamiliaInfo.Padrastro -> FamiliaModel.Padrastro
              FamiliaInfo.Papa -> FamiliaModel.Papa
              FamiliaInfo.Primoa -> FamiliaModel.Primoa
              FamiliaInfo.Sobrinoa -> FamiliaModel.Sobrinoa
              FamiliaInfo.Tia -> FamiliaModel.Tia
              FamiliaInfo.Tio -> FamiliaModel.Tio
              FamiliaInfo.Yerno -> FamiliaModel.Yerno
          }
      })
        binding.rvFamilia.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = familiaAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                familiaViewModel.familia.collect {
                    familiaAdapter.updateList(it)
                }
            }
        }
    }
}