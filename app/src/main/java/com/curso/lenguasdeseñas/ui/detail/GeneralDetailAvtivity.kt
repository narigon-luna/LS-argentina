package com.curso.lenguasdeseñas.ui.detail

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.databinding.ActivityGeneralDetailBinding
import com.curso.lenguasdeseñas.dominio.model.model.modelcp.CpInfo
import com.curso.lenguasdeseñas.dominio.model.model.modelcp.CpModel
import com.curso.lenguasdeseñas.ui.detail.cpadapter.CpAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class GeneralDetailAvtivity: AppCompatActivity() {


   /** override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_detail)
    }*/
    private lateinit var binding: ActivityGeneralDetailBinding

    private val generalDetailViewModel: GeneralDetailViewModel by viewModels()

    private lateinit var cpAdapter: CpAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGeneralDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()

    }

    private fun initUI() {
        initList()
        initUIState()
    }


     // Inicializamos recyclervio del adapter
    private fun initList() {
       cpAdapter = CpAdapter(onItemSelecte = {
            when(it){
                CpInfo.Uno -> CpModel.Uno
                CpInfo.Dos -> CpModel.Dos
                CpInfo.Tres -> CpModel.Tres
                CpInfo.Cuatro -> CpModel.Cuatro
                CpInfo.Cinco -> CpModel.Cinco
                CpInfo.Seis -> CpModel.Seis
                CpInfo.Siete -> CpModel.Siete
                CpInfo.Ocho -> CpModel.Ocho
                CpInfo.Nueve -> CpModel.Nueve
                CpInfo.Diez -> CpModel.Diez
                CpInfo.Once -> CpModel.Once
                CpInfo.Doce -> CpModel.Doce
                CpInfo.Trece  -> CpModel.Trece
                CpInfo.Catorce  -> CpModel.Catorce
                CpInfo.Quince  -> CpModel.Quince
                CpInfo.Dieciseis -> CpModel.Dieciseis
                CpInfo.Diecisiete -> CpModel.Diecisiete
                CpInfo.Dieciocho -> CpModel.Dieciocho
                CpInfo.Diecinueve -> CpModel.Diecinueve
                CpInfo.Veinte  -> CpModel.Veinte



                /** CpInfo.Alto -> CpModel.Alto
                CpInfo.Bajo -> CpModel.Bajo
                CpInfo.Gordo -> CpModel.Gordo
                CpInfo.Morocho -> CpModel.Morocho
                CpInfo.Rubio -> CpModel.Rubio*/
            }
        })
        binding.rvCp.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = cpAdapter
        }
      // cpAdapter = CpAdapter()
       // binding.rvCp.layoutManager = LinearLayoutManager(context)
        //binding.rvCp.adapter = cpAdapter
    }
    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                generalDetailViewModel.cp.collect {
                    //Cambio de general
                    cpAdapter.updateList(it)
                }
            }
        }
    }
}


    /**  private lateinit var binding: ActivityGeneralDetailBinding
    private val generalDetailViewModel: GeneralDetailViewModel by viewModels()

  // private val args: GeneralDetailAvtivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGeneralDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
      // generalDetailViewModel.getGeneral(args.type)
        //generalDetailViewModel.getGeneral(CpModel.Alto)

    }
    private fun initUI() {
        initUIState()
    }



    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                generalDetailViewModel.state.collect {
                    when (it) {
                        GeneralDetailState.Loading -> loadingState()
                        is GeneralDetailState.Error -> errorState()
                        is GeneralDetailState.Succes -> successState(it)
                      //  is GeneralDetailState.CarPer -> carperState(it)
                    }
                }
            }
        }
    }

    private fun errorState() {
    binding.pb.isVisible = true
    }

    private fun loadingState() {
        binding.pb.isVisible = false
    }

    private fun successState(state: GeneralDetailState.Succes) {
         binding.pb.isVisible = false
        binding.tvTitle.text = state.seña
        //inding.tvBody.text = state.seña

        val image = when (state.cpModel) {
            CpModel.Alto -> R.drawable.detail_libra
            CpModel.Gordo -> R.drawable.detail_mujer
            CpModel.Bajo -> R.drawable.detail_manos
            CpModel.Morocho -> R.drawable.detail_mujer
            CpModel.Rubio -> R.drawable.detail_libra

            /**GeneralModel.Caracteristicaspersonales -> R.drawable.detail_mujer
            GeneralModel.Colores -> R.drawable.detail_manos
            GeneralModel.AccionCotidiana -> R.drawable.detail_libra
            GeneralModel.DatosPersonales -> R.drawable.detail_mujer
            GeneralModel.EstadoCivil -> R.drawable.detail_mujer
            GeneralModel.Familia -> R.drawable.detail_mujer
            GeneralModel.Hogar -> R.drawable.detail_mujer
            GeneralModel.Relaciones -> R.drawable.detail_mujer
            GeneralModel.Ropa -> R.drawable.detail_mujer
            GeneralModel.Dactilologico -> R.drawable.detail_mujer*/
           /** GeneralModel.Gordo -> R.drawable.detail_mujer
            GeneralModel.Morocho -> R.drawable.detail_manos
            GeneralModel.Rubio -> R.drawable.detail_libra
            GeneralModel.Bajo -> R.drawable.detail_mujer
            GeneralModel.Alto -> R.drawable.detail_mujer*/
        }
        binding.ivDetail.setImageResource(image)
     }
   /** private fun carperState(state: GeneralDetailState.CarPer) {
        binding.pb.isVisible = false
        binding.tvTitle.text = state.cp
        //inding.tvBody.text = state.seña

        val image = when (state.cpModel) {

            CpModel.Rubio -> R.drawable.detail_mujer
            CpModel.Morocho -> R.drawable.detail_manos
            CpModel.Gordo -> R.drawable.detail_libra
            CpModel.Bajo -> R.drawable.detail_mujer
            CpModel.Alto -> R.drawable.detail_mujer
        }
        binding.ivDetail.setImageResource(image)
    }*/


}*/