package com.curso.lenguasdeseñas.ui.datoper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityCarPerBinding
import com.curso.lenguasdeseas.databinding.ActivityDatoPerBinding
import com.curso.lenguasdeseñas.dominio.model.model.datospermodel.DatoPerInfo
import com.curso.lenguasdeseñas.dominio.model.model.datospermodel.DatoPerModel
import com.curso.lenguasdeseñas.ui.carper.CarPerViewModel
import com.curso.lenguasdeseñas.ui.datoper.datoperadalpter.DatoPerAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DatoPerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDatoPerBinding
    private val datoPerViewModel: DatoPerViewModel by viewModels ()
    private lateinit var datoPerAdapter: DatoPerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDatoPerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }


    private fun initList() {
        datoPerAdapter = DatoPerAdapter(onItemSelecte = {
            when(it){
                DatoPerInfo.Presentarme -> DatoPerModel.Presentarme
                DatoPerInfo.Nombre -> DatoPerModel.Nombre
                DatoPerInfo.Apellido -> DatoPerModel.Apellido
                DatoPerInfo.Cuil -> DatoPerModel.Cuil
                DatoPerInfo.Direccion -> DatoPerModel.Direccion
                DatoPerInfo.Dni -> DatoPerModel.Dni
                DatoPerInfo.Edad -> DatoPerModel.Edad
                DatoPerInfo.Fechadenacimiento -> DatoPerModel.Fechadenacimiento
                DatoPerInfo.NumeroCelular -> DatoPerModel.NumeroCelular
                DatoPerInfo.Señapersonales -> DatoPerModel.Señapersonales
            }
        })
        binding.rvDatoPer.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = datoPerAdapter
        }
    }


    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                datoPerViewModel.datper.collect {
                    //Cambio de general
                   datoPerAdapter.updateList(it)
                }
            }
        }
    }
}