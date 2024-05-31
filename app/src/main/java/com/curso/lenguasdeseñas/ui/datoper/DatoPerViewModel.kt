package com.curso.lenguasdeseñas.ui.datoper

import androidx.lifecycle.ViewModel

import com.curso.lenguasdeseñas.data.provider.provider.provider.DatoPerProvider
import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerInfo
import com.curso.lenguasdeseñas.dominio.model.model.datospermodel.DatoPerInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class DatoPerViewModel  @Inject constructor(datoPerProvider: DatoPerProvider) : ViewModel() {
    private var _datper = MutableStateFlow<List<DatoPerInfo>>(emptyList())
    val datper: StateFlow<List<DatoPerInfo>> = _datper
    init {
        _datper.value = datoPerProvider.getDatoPer()
    }
}