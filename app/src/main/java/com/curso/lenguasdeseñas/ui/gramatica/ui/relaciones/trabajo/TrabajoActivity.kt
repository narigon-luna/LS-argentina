package com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.trabajo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivitySentimientosBinding
import com.curso.lenguasdeseas.databinding.ActivityTrabajoBinding
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.trabajo.TrabajoInfo
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.trabajo.TrbajoModel
import com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.sentimientos.SentimientosViewModel
import com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.sentimientos.sentimientosadapter.SentimientosAdapter
import com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.trabajo.trabajoadapter.TrabajoAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TrabajoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTrabajoBinding
    private val trabajoViewModel: TrabajoViewModel by viewModels()
    private lateinit var trabajoAdapter: TrabajoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrabajoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }


    private fun initList() {
       trabajoAdapter = TrabajoAdapter(onItemSelecte = {
           when(it){
               TrabajoInfo.Bar -> TrbajoModel.Bar
               TrabajoInfo.Buscar -> TrbajoModel.Buscar
               TrabajoInfo.Cobrar -> TrbajoModel.Cobrar
               TrabajoInfo.Comunicar -> TrbajoModel.Comunicar
               TrabajoInfo.Cordinadora -> TrbajoModel.Cordinadora
               TrabajoInfo.Despedie -> TrbajoModel.Despedie
               TrabajoInfo.Dueño -> TrbajoModel.Dueño
               TrabajoInfo.Empleadoa -> TrbajoModel.Empleadoa
               TrabajoInfo.Empresa -> TrbajoModel.Empresa
               TrabajoInfo.Encontrar -> TrbajoModel.Encontrar
               TrabajoInfo.Fabrica -> TrbajoModel.Fabrica
               TrabajoInfo.Instructora -> TrbajoModel.Instructora
               TrabajoInfo.Jefe -> TrbajoModel.Jefe
               TrabajoInfo.Jubiladoa -> TrbajoModel.Jubiladoa
               TrabajoInfo.NegocioComercio -> TrbajoModel.NegocioComercio
               TrabajoInfo.Oficina -> TrbajoModel.Oficina
               TrabajoInfo.Pensionadoa -> TrbajoModel.Pensionadoa
               TrabajoInfo.Preparar -> TrbajoModel.Preparar
               TrabajoInfo.Profesional -> TrbajoModel.Profesional
               TrabajoInfo.Renunciar -> TrbajoModel.Renunciar
               TrabajoInfo.Secretarioa -> TrbajoModel.Secretarioa
               TrabajoInfo.Sueldo -> TrbajoModel.Sueldo
               TrabajoInfo.Supervisor -> TrbajoModel.Supervisor
               TrabajoInfo.Suspender -> TrbajoModel.Suspender
               TrabajoInfo.Tesorero -> TrbajoModel.Tesorero
               TrabajoInfo.Trabajar -> TrbajoModel.Trabajar
           }
       })
        binding.rvTrabajo.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = trabajoAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                trabajoViewModel.trabajo.collect{
                    trabajoAdapter.updateList(it)
                }
            }
        }
    }
}