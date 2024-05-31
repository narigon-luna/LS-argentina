package com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.sentimientos

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.ui.gramatica.data.provider.RelacionesProvaider
import com.curso.lenguasdeseñas.ui.gramatica.data.provider.SentimientosProvaider
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.sentimientos.SentimientosInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class SentimientosViewModel @Inject constructor(sentimientosProvaider: SentimientosProvaider) : ViewModel() {
   private var _sentimientos = MutableStateFlow<List<SentimientosInfo>>(emptyList())
    val semtimientos: StateFlow<List<SentimientosInfo>> = _sentimientos
    init {
        _sentimientos.value = sentimientosProvaider.getsentimientos()
    }

}