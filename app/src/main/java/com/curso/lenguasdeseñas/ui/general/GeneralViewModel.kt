package com.curso.lenguasdeseñas.ui.general

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.GeneralProvider
import com.curso.lenguasdeseñas.dominio.model.model.generalmodel.GeneralInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject


@HiltViewModel
class GeneralViewModel @Inject constructor(generalProvider: GeneralProvider):ViewModel() {

    private var _general = MutableStateFlow<List<GeneralInfo>>(emptyList())
    val general: StateFlow<List<GeneralInfo>> = _general

    init {
        _general.value = generalProvider.getGenerales()
    }
}