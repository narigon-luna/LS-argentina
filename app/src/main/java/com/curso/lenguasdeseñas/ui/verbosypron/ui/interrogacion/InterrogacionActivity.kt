package com.curso.lenguasdeseñas.ui.verbosypron.ui.interrogacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityInterrogacionBinding
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.interr.InterrogacionInfo
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.interr.InterrogacionModel
import com.curso.lenguasdeseñas.ui.verbosypron.ui.interrogacion.adapter.InterrogacionAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class InterrogacionActivity : AppCompatActivity() {

           private lateinit var binding: ActivityInterrogacionBinding
           private val interrogacionViewModel: InterrogacionViewModel by viewModels()
           private lateinit var interrogacionAdapter: InterrogacionAdapter

           override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityInterrogacionBinding.inflate(layoutInflater)
               setContentView(binding.root)
               initUi()
    }

    private fun initUi() {
        initList()
        initUIState()
    }

    private fun initList() {
        interrogacionAdapter = InterrogacionAdapter(onItemSelect = {
            when(it) {
                InterrogacionInfo.Cuando -> InterrogacionModel.Cuando
                InterrogacionInfo.Como -> InterrogacionModel.Como
                InterrogacionInfo.Cual -> InterrogacionModel.Cual
                InterrogacionInfo.Cuantos -> InterrogacionModel.Cuantos
                InterrogacionInfo.Donde -> InterrogacionModel.Donde
                InterrogacionInfo.Paraque -> InterrogacionModel.Paraque
                InterrogacionInfo.Porque -> InterrogacionModel.Porque
                InterrogacionInfo.Pregunta -> InterrogacionModel.Pregunta
                InterrogacionInfo.Que -> InterrogacionModel.Que
                InterrogacionInfo.Quien -> InterrogacionModel.Quien
            }
        })
        binding.rvInterrogacion.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = interrogacionAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                interrogacionViewModel.interrogacion.collect {
                    interrogacionAdapter.nuevaList(it)
                }
            }
        }

    }
}