package com.curso.lenguasdeseñas.ui.verbosypron.ui.reftemp

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.ui.verbosypron.data.RefTempProvider
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.reftemp.RefTempInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class RefTempViewModel @Inject constructor(refTempProvider: RefTempProvider): ViewModel() {
    private var _reftemp = MutableStateFlow<List<RefTempInfo>>(emptyList())
    val refper: StateFlow<List<RefTempInfo>> = _reftemp
    init {
        _reftemp.value = refTempProvider.getRefTemp()
    }
}