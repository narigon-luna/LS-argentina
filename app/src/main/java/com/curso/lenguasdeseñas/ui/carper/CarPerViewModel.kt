package com.curso.lenguasdeseñas.ui.carper

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.CarPerProvider
import com.curso.lenguasdeseñas.data.provider.provider.provider.DiasProvider
import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class CarPerViewModel @Inject constructor(carPerProvider: CarPerProvider) : ViewModel() {
    private var _carper = MutableStateFlow<List<CarPerInfo>>(emptyList())
            val carper: StateFlow<List<CarPerInfo>> = _carper
    init {
        _carper.value = carPerProvider.getCarPer()
    }
}