package com.curso.lenguasdeseñas.ui.partdelhog

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.PerDelHogProvider
import com.curso.lenguasdeseñas.dominio.model.model.pertdelhog.ParteDelHogInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class PartedelHogarViewModel @Inject constructor(partDelHogProvider: PerDelHogProvider): ViewModel () {
    private var _partdhor = MutableStateFlow<List<ParteDelHogInfo>>(emptyList())
            val partdhor: StateFlow<List<ParteDelHogInfo>> = _partdhor
    init {
        _partdhor.value = partDelHogProvider.getPartHog()
    }
}