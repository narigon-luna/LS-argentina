package com.curso.lenguasdeseñas.ui.escuela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ActivityEscuelaBinding
import com.curso.lenguasdeseñas.dominio.model.model.escuelamodel.EscuelaInfo
import com.curso.lenguasdeseñas.dominio.model.model.escuelamodel.EscuelaModel
import com.curso.lenguasdeseñas.ui.escuela.adapter.EscuelaApdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class EscuelaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEscuelaBinding
    private val escuelaViewModel: EscuelaViewModel by viewModels ()
    private lateinit var escuelaAdapter: EscuelaApdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEscuelaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    private fun initUi() {
        initList()
        initUIState()
    }

    private fun initList() {
        escuelaAdapter = EscuelaApdapter(onItemselect = {
           when(it){
               EscuelaInfo.Escuela -> EscuelaModel.Escuela
               EscuelaInfo.Acto ->  EscuelaModel.Acto
               EscuelaInfo.Aprender -> EscuelaModel.Aprender
               EscuelaInfo.Aprobar ->  EscuelaModel.Aprobar
               EscuelaInfo.Atento ->  EscuelaModel.Atento
               EscuelaInfo.Ausente ->  EscuelaModel.Ausente
               EscuelaInfo.Carpeta ->  EscuelaModel.Carpeta
               EscuelaInfo.Comenzar -> EscuelaModel.Comenzar
               EscuelaInfo.Completo -> EscuelaModel.Completo
               EscuelaInfo.Contar ->  EscuelaModel.Contar
               EscuelaInfo.Corregir -> EscuelaModel.Corregir
               EscuelaInfo.Curso ->  EscuelaModel.Curso
               EscuelaInfo.Desatento ->  EscuelaModel.Desatento
               EscuelaInfo.Desprobar ->  EscuelaModel.Desprobar
               EscuelaInfo.Diccionario -> EscuelaModel. Diccionario
               EscuelaInfo.Diplomadoa ->  EscuelaModel.Diplomadoa
               EscuelaInfo.DirectorA ->  EscuelaModel.DirectorA
               EscuelaInfo.Distraido ->  EscuelaModel.Distraido
               EscuelaInfo.Educacion ->  EscuelaModel.Educacion
               EscuelaInfo.Enseñar ->  EscuelaModel.Enseñar
               EscuelaInfo.Escribir ->  EscuelaModel.Escribir
               EscuelaInfo.Escuelaprimaria ->  EscuelaModel.Escuelaprimaria
               EscuelaInfo.EstudianteAlumnoA ->  EscuelaModel.EstudianteAlumnoA
               EscuelaInfo.Estudiar ->  EscuelaModel.Estudiar
               EscuelaInfo.ExamenRendir ->  EscuelaModel.ExamenRendir
               EscuelaInfo.Explicar ->  EscuelaModel.Explicar
               EscuelaInfo.Facultad ->  EscuelaModel.Facultad
               EscuelaInfo.Fallar ->  EscuelaModel.Fallar
               EscuelaInfo.Fotocopia -> EscuelaModel.Fotocopia
               EscuelaInfo.Goma ->  EscuelaModel.Goma
               EscuelaInfo.Informar ->  EscuelaModel.Informar
               EscuelaInfo.Instituto -> EscuelaModel.Instituto
               EscuelaInfo.Interesadoa ->  EscuelaModel.Interesadoa
               EscuelaInfo.Jardindeinfantes ->  EscuelaModel.Jardindeinfantes
               EscuelaInfo.Jugar ->  EscuelaModel.Jugar
               EscuelaInfo.Lapicera ->  EscuelaModel.Lapicera
               EscuelaInfo.Lapiz -> EscuelaModel.Lapiz
               EscuelaInfo.Leer ->  EscuelaModel.Leer
               EscuelaInfo.Libro -> EscuelaModel.Libro
               EscuelaInfo.MaestroA ->  EscuelaModel.MaestroA
               EscuelaInfo.Memorizar -> EscuelaModel.Memorizar
               EscuelaInfo.Nerviosoa -> EscuelaModel.Nerviosoa
               EscuelaInfo.Norecortar ->  EscuelaModel.Norecortar
               EscuelaInfo.Nosaber ->  EscuelaModel.Nosaber
               EscuelaInfo.Olvidar ->  EscuelaModel.Olvidar
               EscuelaInfo.Papelhoja -> EscuelaModel.Papelhoja
               EscuelaInfo.Pensar ->  EscuelaModel.Pensar
               EscuelaInfo.Pizarron ->  EscuelaModel.Pizarron
               EscuelaInfo.Practicar -> EscuelaModel.Practicar
               EscuelaInfo.Presente ->  EscuelaModel.Presente
               EscuelaInfo.Privado ->  EscuelaModel.Privado
               EscuelaInfo.ProfesorA ->  EscuelaModel.ProfesorA
               EscuelaInfo.Publico ->  EscuelaModel.Publico
               EscuelaInfo.Puntual ->  EscuelaModel.Puntual
               EscuelaInfo.Recortar -> EscuelaModel.Recortar
               EscuelaInfo.Recreo ->  EscuelaModel.Recreo
               EscuelaInfo.Responder ->  EscuelaModel.Responder
               EscuelaInfo.Responsable -> EscuelaModel.Responsable
               EscuelaInfo.Saber ->  EscuelaModel.Saber
               EscuelaInfo.Secundaria ->  EscuelaModel.Secundaria
               EscuelaInfo.Signar ->  EscuelaModel.Signar
               EscuelaInfo.Tema ->  EscuelaModel.Tema
               EscuelaInfo.Terminar ->  EscuelaModel.Terminar
               EscuelaInfo.Terviaria -> EscuelaModel.Terviaria
               EscuelaInfo.Universidad ->  EscuelaModel.Universidad
               EscuelaInfo.Vagoa ->  EscuelaModel.Vagoa
               EscuelaInfo.VicedirectorA ->  EscuelaModel.VicedirectorA
           }
        })
        binding.rvEscuela.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = escuelaAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                escuelaViewModel.escuela.collect {
                    escuelaAdapter.nuevalis(it)
                }
            }
        }
    }
}