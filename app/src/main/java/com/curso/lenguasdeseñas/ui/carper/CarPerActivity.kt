package com.curso.lenguasdeseñas.ui.carper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityCarPerBinding
import com.curso.lenguasdeseas.databinding.ActivityDetailDiasBinding
import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerInfo
import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerModel
import com.curso.lenguasdeseñas.ui.carper.carperadapter.CarPerAdapter
import com.curso.lenguasdeseñas.ui.detaildias.DetaiDiasViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CarPerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCarPerBinding
    private val carperViewModel: CarPerViewModel by viewModels ()
    private lateinit var carPerAdapter: CarPerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarPerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }

    private fun initUi() {
        initList()
        initUIState()
    }



    private fun initList() {
       carPerAdapter = CarPerAdapter(onItemSelecte = {

           when(it) {
               CarPerInfo.Adulto -> CarPerModel.Adulto
               CarPerInfo.Alegre -> CarPerModel.Alegre
               CarPerInfo.Alto -> CarPerModel.Alto
               CarPerInfo.Antipatico -> CarPerModel.Antipatico
               CarPerInfo.Bajo -> CarPerModel.Bajo
               CarPerInfo.Barba -> CarPerModel.Barba
               CarPerInfo.Bebe -> CarPerModel.Bebe
               CarPerInfo.Bueno -> CarPerModel.Bueno
               CarPerInfo.Calvo -> CarPerModel.Calvo
               CarPerInfo.Canoso -> CarPerModel.Canoso
               CarPerInfo.Caracter -> CarPerModel.Caracter
               CarPerInfo.Cariñoso -> CarPerModel.Cariñoso
               CarPerInfo.Castaño -> CarPerModel.Castaño
               CarPerInfo.Celoso -> CarPerModel.Celoso
               CarPerInfo.Chusma -> CarPerModel.Chusma
               CarPerInfo.Divertido -> CarPerModel.Divertido
               CarPerInfo.Educado -> CarPerModel.Educado
               CarPerInfo.Envidioso -> CarPerModel.Envidioso
               CarPerInfo.Feo -> CarPerModel.Feo
               CarPerInfo.Flaco -> CarPerModel.Flaco
               CarPerInfo.Gordo -> CarPerModel.Gordo
               CarPerInfo.Hermoso -> CarPerModel.Hermoso
               CarPerInfo.Hipoacusico -> CarPerModel.Hipoacusico
               CarPerInfo.Hombre -> CarPerModel.Hombre
               CarPerInfo.Ignorante -> CarPerModel.Ignorante
               CarPerInfo.Inteligente -> CarPerModel.Inteligente
               CarPerInfo.Joven -> CarPerModel.Joven
               CarPerInfo.Lacio -> CarPerModel.Lacio
               CarPerInfo.Lindo -> CarPerModel.Lindo
               CarPerInfo.MalEducado -> CarPerModel.MalEducado
               CarPerInfo.Malo -> CarPerModel.Malo
               CarPerInfo.Mujer -> CarPerModel.Mujer
               CarPerInfo.Natural -> CarPerModel.Natural
               CarPerInfo.Niño -> CarPerModel.Niño
               CarPerInfo.Oyente -> CarPerModel.Oyente
               CarPerInfo.Pelirrojo -> CarPerModel.Pelirrojo
               CarPerInfo.PeloCorto -> CarPerModel.PeloCorto
               CarPerInfo.PeloLargo -> CarPerModel.PeloLargo
               CarPerInfo.Rizado -> CarPerModel.Rizado
               CarPerInfo.Rubio -> CarPerModel.Rubio
               CarPerInfo.Serio -> CarPerModel.Serio
               CarPerInfo.Simpatico -> CarPerModel.Simpatico
               CarPerInfo.Sordo -> CarPerModel.Sordo
               CarPerInfo.TezBlanca -> CarPerModel.TezBlanca
               CarPerInfo.TezMorocha -> CarPerModel.TezMorocha
               CarPerInfo.Teñido -> CarPerModel.Teñido
               CarPerInfo.Timido -> CarPerModel.Timido
           }

       })
        binding.rvCarPer.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = carPerAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                carperViewModel.carper.collect {
                    //Cambio de general
                    carPerAdapter.updateList(it)
                }
            }
        }
    }
}
