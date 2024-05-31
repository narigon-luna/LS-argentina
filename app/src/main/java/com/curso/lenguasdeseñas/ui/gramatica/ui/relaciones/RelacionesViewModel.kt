package com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.FamiliaProvider
import com.curso.lenguasdeseñas.ui.gramatica.data.provider.RelacionesProvaider
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.RelacionesInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class RelacionesViewModel @Inject constructor(relacionesProvaider: RelacionesProvaider) : ViewModel() {
   private var _relacion = MutableStateFlow<List<RelacionesInfo>>(emptyList())
    val relacion: StateFlow<List<RelacionesInfo>> = _relacion

    init {
        _relacion.value = relacionesProvaider.getrelacion()
    }
}