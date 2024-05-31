package com.curso.lenguasdeseñas.ui.detail

import com.curso.lenguasdeseñas.dominio.model.model.modelcp.CpModel

sealed class GeneralDetailState {

    /* data object Loading:GeneralDetailState()

     data class Error(val error:String):GeneralDetailState()

     data class Succes(val seña: String, val generalModel: GeneralModel):GeneralDetailState()*/

     data object Loading:GeneralDetailState()

     data class Error(val error:String):GeneralDetailState()

     data class Succes(val seña: String, val cpModel: CpModel ):GeneralDetailState()
   // data class Succes(val seña:String, val generalModel: GeneralModel): GeneralDetailState()

     //data class CarPer(val cpAdapter: CpAdapter): GeneralDetailState()
}