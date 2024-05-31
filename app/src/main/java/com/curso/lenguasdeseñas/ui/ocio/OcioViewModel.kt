package com.curso.lenguasdeseñas.ui.ocio

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.FCortesiaProvider
import com.curso.lenguasdeseñas.data.provider.provider.provider.OcioProvider
import com.curso.lenguasdeseñas.dominio.model.model.ocio.OcioInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class OcioViewModel @Inject constructor(ocioProvider: OcioProvider) : ViewModel(){
    private var _ocio = MutableStateFlow<List<OcioInfo>>(emptyList())
     val ocio: StateFlow<List<OcioInfo>> = _ocio
    init {
        _ocio.value = ocioProvider.getocio()
    }
}