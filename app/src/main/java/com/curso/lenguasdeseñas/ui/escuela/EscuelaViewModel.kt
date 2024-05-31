package com.curso.lenguasdeseñas.ui.escuela

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.EscuelaProvaider
import com.curso.lenguasdeseñas.dominio.model.model.escuelamodel.EscuelaInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class EscuelaViewModel  @Inject constructor (escuelaProvaider: EscuelaProvaider): ViewModel (){
    private val _escuela = MutableStateFlow<List<EscuelaInfo>>(emptyList())
    var escuela : StateFlow<List<EscuelaInfo>> = _escuela
    init {
        _escuela.value = escuelaProvaider.getescuela()
    }
}