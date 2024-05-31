package com.curso.lenguasdeseñas.ui.dactilologico

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.DactilologicoProvider
import com.curso.lenguasdeseñas.data.provider.provider.provider.GeneralProvider
import com.curso.lenguasdeseñas.dominio.model.model.dactilomodel.DactilologicoInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject


@HiltViewModel
class DactilologicoViewModel @Inject constructor(dactilologicoProvider: DactilologicoProvider): ViewModel() {
    private var _dactilologico = MutableStateFlow<List<DactilologicoInfo>>(emptyList())
    val dactilologico: StateFlow<List<DactilologicoInfo>> = _dactilologico

    init {
        _dactilologico.value = dactilologicoProvider.getDactilo()
    }
}