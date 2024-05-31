package com.curso.lenguasdeseñas.ui.fcortesia

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.FCortesiaProvider
import com.curso.lenguasdeseñas.dominio.model.model.fcortesia.FcortesiaInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class FcortesiaviewModel @Inject constructor(fCortesiaProvider: FCortesiaProvider) : ViewModel() {

    private var _fcortesia = MutableStateFlow<List<FcortesiaInfo>>(emptyList())
       val fcortesia: StateFlow<List<FcortesiaInfo>> = _fcortesia
    init {
        _fcortesia.value = fCortesiaProvider.getfcortesia()
    }
}