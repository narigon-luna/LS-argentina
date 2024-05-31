package com.curso.lenguasdeseñas.ui.portada

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.PortadaProvaider
import com.curso.lenguasdeseñas.dominio.model.model.portadamodel.PortadaInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class PortadaViewModel  @Inject constructor(portadaProvaider: PortadaProvaider): ViewModel () {
    private var _portada = MutableStateFlow<List<PortadaInfo>>(emptyList())
    val portada: StateFlow<List<PortadaInfo>> = _portada

    init {
        _portada.value = portadaProvaider.getPortada()
    }
}