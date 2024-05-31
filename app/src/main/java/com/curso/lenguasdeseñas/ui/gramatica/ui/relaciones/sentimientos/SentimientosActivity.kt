package com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.sentimientos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivitySentimientosBinding
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.sentimientos.SentimientosInfo
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.sentimientos.SentimientosModel
import com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.sentimientos.sentimientosadapter.SentimientosAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SentimientosActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySentimientosBinding
     private val sentimientosViewModel: SentimientosViewModel by viewModels()
    private lateinit var sentimientosAdapter: SentimientosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySentimientosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }



    private fun initList() {
      sentimientosAdapter = SentimientosAdapter(onItemSelecte = {

          when(it){
              SentimientosInfo.Aburrido -> SentimientosModel.Aburrido
              SentimientosInfo.Cansado ->  SentimientosModel.Cansado
              SentimientosInfo.Confundido ->  SentimientosModel.Confundido
              SentimientosInfo.Contento ->  SentimientosModel.Contento
              SentimientosInfo.Enamorado ->  SentimientosModel.Enamorado
              SentimientosInfo.Enojado ->  SentimientosModel.Enojado
              SentimientosInfo.Feliz ->  SentimientosModel.Feliz
              SentimientosInfo.Nervioso ->  SentimientosModel.Nervioso
              SentimientosInfo.Sorprendido ->  SentimientosModel.Sorprendido
              SentimientosInfo.Tranquilo ->  SentimientosModel.Tranquilo
              SentimientosInfo.Triete ->  SentimientosModel.Triete
          }
      })
        binding.rvSentimientos.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = sentimientosAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                sentimientosViewModel.semtimientos.collect{
                    sentimientosAdapter.updateList(it)
                }
            }
        }
    }
}