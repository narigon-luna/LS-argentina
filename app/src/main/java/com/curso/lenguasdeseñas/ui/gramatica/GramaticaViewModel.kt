package com.curso.lenguasdeseñas.ui.gramatica

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.GramaticaProvaider
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class GramaticaViewModel  @Inject constructor(gramaticaProvaider: GramaticaProvaider): ViewModel()  {
    private var _gramatica = MutableStateFlow<List<GramaticaInfo>>(emptyList())
    val gramatica: StateFlow<List<GramaticaInfo>> = _gramatica

    init {
        _gramatica.value = gramaticaProvaider.getGramatica()
    }
}