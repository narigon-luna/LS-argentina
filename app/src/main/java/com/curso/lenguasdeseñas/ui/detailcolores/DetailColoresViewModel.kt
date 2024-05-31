package com.curso.lenguasdeseñas.ui.detailcolores

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.ColoresProvaider
import com.curso.lenguasdeseñas.data.provider.provider.provider.DactilologicoProvider
import com.curso.lenguasdeseñas.dominio.model.model.modelcolores.ColoresInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
@HiltViewModel
class DetailColoresViewModel @Inject constructor(coloresProvaider: ColoresProvaider) : ViewModel()  {
          private var _colores = MutableStateFlow<List<ColoresInfo>>(emptyList())
           val colores:StateFlow<List<ColoresInfo>> = _colores
    init {
        _colores.value = coloresProvaider.getColores()
    }
}