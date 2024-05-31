package com.curso.lenguasdeseñas.ui.verbosypron

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.VyPProvaider
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo
import com.curso.lenguasdeseñas.dominio.model.model.vypmodel.VyPInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class VyPViewModel  @Inject constructor(vyPProvaider: VyPProvaider): ViewModel() {
    private var _vyp = MutableStateFlow<List<VyPInfo>>(emptyList())
    val vyp: StateFlow<List<VyPInfo>> = _vyp
    init {
        _vyp.value = vyPProvaider.getVyP()
    }
}