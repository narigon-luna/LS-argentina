package com.curso.lenguasdeseñas.ui.detailestyclim

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.EstyClimProvider
import com.curso.lenguasdeseñas.dominio.model.model.estycli.EstyClimInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class DetailestyclimViewModel  @Inject constructor(estiClimProvider: EstyClimProvider) : ViewModel()  {

    private var _estyclim = MutableStateFlow<List<EstyClimInfo>>(emptyList())
    val estyclim: StateFlow<List<EstyClimInfo>> = _estyclim
    init {
        _estyclim.value = estiClimProvider.getEstyCli()
    }

}