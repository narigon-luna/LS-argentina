package com.curso.lenguasdeseñas.ui.estadocivil

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.CarPerProvider
import com.curso.lenguasdeseñas.data.provider.provider.provider.EstadoCivilProvider
import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerInfo
import com.curso.lenguasdeseñas.dominio.model.model.estadocivilmodel.EstadoCivilInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class EstadoCicilViewModel  @Inject constructor(estadoCivilProvider: EstadoCivilProvider) : ViewModel() {

    private var _estadciv = MutableStateFlow<List<EstadoCivilInfo>>(emptyList())
    val estaciv: StateFlow<List<EstadoCivilInfo>> = _estadciv
    init {
        _estadciv.value = estadoCivilProvider.getEstadocivil()
    }
}