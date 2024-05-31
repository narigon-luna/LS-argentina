package com.curso.lenguasdeseñas.ui.verbosypron.ui.interrogacion

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.ui.verbosypron.data.InterrogacioProvaider
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.interr.InterrogacionInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class InterrogacionViewModel @Inject constructor(interrogacioProvaider: InterrogacioProvaider): ViewModel() {
    private var _interrogacion = MutableStateFlow<List<InterrogacionInfo>>(emptyList())
    val interrogacion: StateFlow<List<InterrogacionInfo>> = _interrogacion
    init {
        _interrogacion.value= interrogacioProvaider.getinterrog()
    }
}