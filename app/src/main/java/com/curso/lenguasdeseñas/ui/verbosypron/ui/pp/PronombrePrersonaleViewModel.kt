package com.curso.lenguasdeseñas.ui.verbosypron.ui.pp

import android.view.View
import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.ui.verbosypron.data.ProPerProvaider
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.pp.ProPerInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class PronombrePrersonaleViewModel @Inject constructor (proPerProvaider: ProPerProvaider): ViewModel() {
    private var _pp = MutableStateFlow<List<ProPerInfo>>(emptyList())
    val pp: StateFlow<List<ProPerInfo>> = _pp
    init {
        _pp.value = proPerProvaider.getprpPer()
    }
}