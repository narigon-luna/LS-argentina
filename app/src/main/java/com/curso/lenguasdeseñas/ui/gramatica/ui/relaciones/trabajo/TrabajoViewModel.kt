package com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.trabajo

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.ui.gramatica.data.provider.SentimientosProvaider
import com.curso.lenguasdeseñas.ui.gramatica.data.provider.TrabajoProvaider
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.trabajo.TrabajoInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class TrabajoViewModel @Inject constructor(trabajoProvaider: TrabajoProvaider) : ViewModel()  {

    private var _trabajo = MutableStateFlow<List<TrabajoInfo>>(emptyList())
    val trabajo: StateFlow<List<TrabajoInfo>> = _trabajo

    init {
        _trabajo.value = trabajoProvaider.gettrabajo()
    }

}