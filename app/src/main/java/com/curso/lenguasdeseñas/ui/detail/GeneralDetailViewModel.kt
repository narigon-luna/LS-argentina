package com.curso.lenguasdeseñas.ui.detail

import androidx.lifecycle.ViewModel
import com.curso.lenguasdeseñas.data.provider.provider.provider.CpProvider
import com.curso.lenguasdeseñas.dominio.model.model.modelcp.CpInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

/**@HiltViewModel
class GeneralDetailViewModel @Inject constructor(cpProvider: CpProvider):ViewModel() {

    private var _cp = MutableStateFlow<List<CpInfo>>(emptyList())
    val cp: StateFlow<List<CpInfo>> = _cp

    init {
        _cp.value = cpProvider.getCp()
    }
}*/

@HiltViewModel
class GeneralDetailViewModel @Inject constructor(cpProvider: CpProvider) : ViewModel() {
    private var _cp = MutableStateFlow<List<CpInfo>>(emptyList())
    val cp: StateFlow<List<CpInfo>> = _cp

    init {
        _cp.value = cpProvider.getCp()
    }
   /**  private var _state = MutableStateFlow<GeneralDetailState>(GeneralDetailState.Loading)
    val state: StateFlow<GeneralDetailState> = _state

    //lateinit var general: GeneralModel
    lateinit var general: CpModel

    fun getGeneral(seña:  CpModel) {
        general = seña

        viewModelScope.launch {
            _state.value = GeneralDetailState.Loading
          //  val result = withContext(Dispatchers.IO) {getSeñaUseCase(seña.name)}
              val result = withContext(Dispatchers.IO) {(seña.name)}
           if (result!=null){
               _state.value = GeneralDetailState.Succes(seña.name, general)


        }else{
            _state.value = GeneralDetailState.Error("Error")
            }
        }
    }*/

}