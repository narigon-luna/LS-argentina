package com.curso.lenguasdeseñas.ui.detaildias

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.ColoresProvaider
import com.curso.lenguasdeseñas.data.provider.provider.provider.DiasProvider
import com.curso.lenguasdeseñas.dominio.model.model.modelcolores.ColoresInfo
import com.curso.lenguasdeseñas.dominio.model.model.modeldias.DiasInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class DetaiDiasViewModel @Inject constructor(diasProvider: DiasProvider) : ViewModel()  {
    private var _dias = MutableStateFlow<List<DiasInfo>>(emptyList())
    val dias: StateFlow<List<DiasInfo>> = _dias
    init {
        _dias.value = diasProvider.getDias()
    }
}