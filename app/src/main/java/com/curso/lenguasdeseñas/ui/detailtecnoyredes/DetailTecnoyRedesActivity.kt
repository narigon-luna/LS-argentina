package com.curso.lenguasdeseñas.ui.detailtecnoyredes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityDetailDiasBinding
import com.curso.lenguasdeseas.databinding.ActivityDetailTecnoyRedesBinding
import com.curso.lenguasdeseñas.dominio.model.model.tecnoyredes.TecnotRedesInfo
import com.curso.lenguasdeseñas.dominio.model.model.tecnoyredes.TecnoyReddesModel
import com.curso.lenguasdeseñas.ui.detaildias.DetaiDiasViewModel
import com.curso.lenguasdeseñas.ui.detailtecnoyredes.tecnoyredesadapter.TecnoyRedesAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DetailTecnoyRedesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailTecnoyRedesBinding
    private val detailTecnoyRedesViewModel: DetailTecnoyRedesViewModel by viewModels ()
    private lateinit var tecnoyRedesAdapter: TecnoyRedesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTecnoyRedesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }

    private fun initUi() {
        initList()
        initUIState()
    }

    private fun initList() {
       tecnoyRedesAdapter = TecnoyRedesAdapter(onItemSelecte = {
           when(it) {
               TecnotRedesInfo.Arroba -> TecnoyReddesModel.Arroba
               TecnotRedesInfo.Celular ->TecnoyReddesModel.Celular
               TecnotRedesInfo.Claro -> TecnoyReddesModel.Claro
               TecnotRedesInfo.Computadora -> TecnoyReddesModel.Computadora
               TecnotRedesInfo.Correoelectronico -> TecnoyReddesModel.Correoelectronico
               TecnotRedesInfo.Facebook -> TecnoyReddesModel.Facebook
               TecnotRedesInfo.Instagram -> TecnoyReddesModel.Instagram
               TecnotRedesInfo.Interner -> TecnoyReddesModel.Interner
               TecnotRedesInfo.Movistar -> TecnoyReddesModel.Movistar
               TecnotRedesInfo.Personal -> TecnoyReddesModel.Personal
               TecnotRedesInfo.Telefono -> TecnoyReddesModel.Telefono
               TecnotRedesInfo.Television -> TecnoyReddesModel.Television
               TecnotRedesInfo.Twitter -> TecnoyReddesModel.Twitter
               TecnotRedesInfo.Videollamada -> TecnoyReddesModel.Videollamada
               TecnotRedesInfo.Whatsapp -> TecnoyReddesModel.Whatsapp
               TecnotRedesInfo.Wifi -> TecnoyReddesModel.Wifi
           }
       })
        binding.rvTecnoyRedes.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = tecnoyRedesAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                detailTecnoyRedesViewModel.tecnoyredes.collect {
                    //Cambio de general
                    tecnoyRedesAdapter.updateList(it)
                }
            }
        }
    }


}