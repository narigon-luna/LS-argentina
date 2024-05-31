package com.curso.lenguasdeseñas.ui.familia

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.CarPerProvider
import com.curso.lenguasdeseñas.data.provider.provider.provider.FamiliaProvider
import com.curso.lenguasdeseñas.dominio.model.model.familia.FamiliaInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class FamiliaViewModel @Inject constructor(familiaProvider: FamiliaProvider) : ViewModel(){
    private var _familia = MutableStateFlow<List<FamiliaInfo>>(emptyList())
    val familia: StateFlow<List<FamiliaInfo>> = _familia
    init {
        _familia.value = familiaProvider.getFamilia()
    }
}