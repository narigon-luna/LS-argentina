package com.curso.lenguasdeseñas.ui.detailtecnoyredes

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.ColoresProvaider
import com.curso.lenguasdeseñas.data.provider.provider.provider.TecnoyRedesProvider
import com.curso.lenguasdeseñas.dominio.model.model.modelcolores.ColoresInfo
import com.curso.lenguasdeseñas.dominio.model.model.tecnoyredes.TecnotRedesInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class DetailTecnoyRedesViewModel @Inject constructor(tecnoyRedesProvider: TecnoyRedesProvider) : ViewModel()  {
    private var _tecnoyredes = MutableStateFlow<List<TecnotRedesInfo>>(emptyList())
    val tecnoyredes: StateFlow<List<TecnotRedesInfo>> = _tecnoyredes
    init {
        _tecnoyredes.value = tecnoyRedesProvider.getTecnoyRedes()
    }
}