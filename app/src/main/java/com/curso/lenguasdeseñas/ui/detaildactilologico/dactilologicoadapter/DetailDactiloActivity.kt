package com.curso.lenguasdeseñas.ui.detaildactilologico.dactilologicoadapter

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.databinding.ActivityDetailDactiloBinding
import com.curso.lenguasdeseñas.dominio.model.model.dactilomodel.DactilologicoInfo
import com.curso.lenguasdeseñas.dominio.model.model.dactilomodel.DactilologicoModel
import com.curso.lenguasdeseñas.ui.detaildactilologico.dactilologicoadapter.dactiadapter.DactiAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DetailDactiloActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailDactiloBinding

    private val detailDactiViewModel: DetailDactiViewModel by viewModels ()

    private lateinit var dactiAdapter: DactiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityDetailDactiloBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }

    private fun initUi() {
        initList()
        initUIState()
    }

    private fun initList() {
       dactiAdapter = DactiAdapter (onItemSelecte = {
           when(it){
               DactilologicoInfo.A -> DactilologicoModel.A
               DactilologicoInfo.B -> DactilologicoModel.B
               DactilologicoInfo.C -> DactilologicoModel.C
               DactilologicoInfo.D -> DactilologicoModel.D
               DactilologicoInfo.E -> DactilologicoModel.E
               DactilologicoInfo.F -> DactilologicoModel.F
               DactilologicoInfo.G ->  DactilologicoModel.G
               DactilologicoInfo.H ->  DactilologicoModel.H
               DactilologicoInfo.I -> DactilologicoModel.I
               DactilologicoInfo.J ->  DactilologicoModel.J
               DactilologicoInfo.K -> DactilologicoModel.K
               DactilologicoInfo.L ->  DactilologicoModel.L
               DactilologicoInfo.LL ->  DactilologicoModel.LL
               DactilologicoInfo.M ->  DactilologicoModel.M
               DactilologicoInfo.N ->  DactilologicoModel.N
               DactilologicoInfo.Ñ ->  DactilologicoModel.Ñ
               DactilologicoInfo.O ->  DactilologicoModel.O
               DactilologicoInfo.P ->  DactilologicoModel.P
               DactilologicoInfo.Q ->  DactilologicoModel.Q
               DactilologicoInfo.R ->  DactilologicoModel.R
               DactilologicoInfo.RR ->  DactilologicoModel.RR
               DactilologicoInfo.S ->  DactilologicoModel.S
               DactilologicoInfo.T ->  DactilologicoModel.T
               DactilologicoInfo.U ->  DactilologicoModel.U
               DactilologicoInfo.V ->  DactilologicoModel.V
               DactilologicoInfo.W ->  DactilologicoModel.W
               DactilologicoInfo.X -> DactilologicoModel.X
               DactilologicoInfo.Y ->  DactilologicoModel.Y
               DactilologicoInfo.Z ->  DactilologicoModel.Z
           }
       })
        binding.rvDetailDactilo.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = dactiAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
                repeatOnLifecycle(Lifecycle.State.STARTED) {
                    detailDactiViewModel.dactilologico.collect {
                        //Cambio de general
                       dactiAdapter.updateList(it)
                    }
                }
            }
        }
    }



