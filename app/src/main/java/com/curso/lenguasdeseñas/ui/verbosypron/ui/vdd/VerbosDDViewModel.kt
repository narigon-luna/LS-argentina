package com.curso.lenguasdeseñas.ui.verbosypron.ui.vdd

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.ui.verbosypron.data.VddProvaider
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.vdd.VerboDedespInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
@HiltViewModel
class VerbosDDViewModel  @Inject constructor (vddProvaider: VddProvaider): ViewModel(){
    private var _vdd = MutableStateFlow <List<VerboDedespInfo>>(emptyList())
    val vdd: StateFlow<List<VerboDedespInfo>> = _vdd
    init {
        _vdd.value = vddProvaider.getvdd()
    }
}