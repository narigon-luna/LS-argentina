package com.curso.lenguasdeseñas.ui.ropayacc

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.RopayAccProvider
import com.curso.lenguasdeseñas.dominio.model.model.ropayacc.RopayAccInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class RopayAccViewModel  @Inject constructor (ropayAccProvider: RopayAccProvider): ViewModel() {
    private var _ropayacc = MutableStateFlow<List<RopayAccInfo>>(emptyList())
    val ropayacc: StateFlow<List<RopayAccInfo>> = _ropayacc
    init {
        _ropayacc.value = ropayAccProvider.getropyAcc()
    }
}