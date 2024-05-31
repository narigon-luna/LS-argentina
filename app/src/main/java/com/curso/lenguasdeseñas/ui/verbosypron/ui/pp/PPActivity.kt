package com.curso.lenguasdeseñas.ui.verbosypron.ui.pp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityPpactivityBinding
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.pp.ProPerInfo
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.pp.ProPerModel
import com.curso.lenguasdeseñas.ui.verbosypron.ui.pp.adapter.ProPerAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PPActivity : AppCompatActivity() {
            private lateinit var binding:ActivityPpactivityBinding
            private val proPerViewModel: PronombrePrersonaleViewModel by viewModels ()
            private lateinit var proPerAdapter: ProPerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityPpactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }

    private fun initList() {
        proPerAdapter = ProPerAdapter(onItemSelecto = {
            when(it) {
                ProPerInfo.ElElla     ->ProPerModel.ElElla
                ProPerInfo.EllosEllas -> ProPerModel.EllosEllas
                ProPerInfo.Mio        -> ProPerModel.Mio
                ProPerInfo.Nosotros   -> ProPerModel.Nosotros
                ProPerInfo.Nuestro    -> ProPerModel.Nuestro
                ProPerInfo.Suyo       -> ProPerModel.Suyo
                ProPerInfo.Todos      -> ProPerModel.Todos
                ProPerInfo.Tu         -> ProPerModel.Tu
                ProPerInfo.Tuyo       -> ProPerModel.Tuyo
                ProPerInfo.Ustedes    -> ProPerModel.Ustedes
                ProPerInfo.Yo         -> ProPerModel.Yo
            }
        })
        binding.rvPP.apply {
            layoutManager= LinearLayoutManager(context)
            adapter = proPerAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                proPerViewModel.pp.collect {
                    proPerAdapter.updatelist(it)
                }
            }
        }
    }

}