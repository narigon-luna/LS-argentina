package com.curso.lenguasdeseñas.ui.verbosypron.ui.adverbio

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.ui.verbosypron.data.AdverbioProvider
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.adv.AdverbioInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
@HiltViewModel
class AdverbioViewModel @Inject constructor(adverbioProvider: AdverbioProvider): ViewModel () {
    private var _adeverbio = MutableStateFlow<List<AdverbioInfo>>(emptyList())
    val adverbio: StateFlow<List<AdverbioInfo>> = _adeverbio
    init {
        _adeverbio.value = adverbioProvider.getAdverbio()
    }
}