package com.curso.lenguasdeseñas.dominio.model.model.generalmodel

import com.curso.lenguasdeseas.R


sealed class GeneralInfo(val img:Int, val name:Int ) {

    data object Numeros: GeneralInfo(R.drawable.detail_mujer, R.string.numeros)
    data object Dias: GeneralInfo(R.drawable.detail_mujer, R.string.calendario)
    data object Colores: GeneralInfo(R.drawable.detail_mujer, R.string.colores)
    data object EstacionesDelAño: GeneralInfo(R.drawable.detail_mujer, R.string.estacionesdelaño)
    data object Clima: GeneralInfo(R.drawable.detail_mujer,R.string.clima)
    data object  RopayAccesorios: GeneralInfo(R.drawable.detail_mujer, R.string.ropayacc)
    data object  Partesdelhogar: GeneralInfo(R.drawable.detail_mujer, R.string.partesdelhogar)
    data object  Escuelayeducacion: GeneralInfo(R.drawable.detail_mujer, R.string.escuelayeduca)

    /**data object CaracteristicasPersonales: GeneralInfo(R.drawable.detail_mujer, R.string.caracteristicaspersonales )

    data object Dactilologico: GeneralInfo(R.drawable.detail_mujer, R.string.dactilologico)

    data object Colores: GeneralInfo(R.drawable.detail_mujer, R.string.colores)

    data object AccionCotidiana: GeneralInfo(R.drawable.detail_mujer, R.string.accioncotidiana)

    data object DatosPersonales: GeneralInfo(R.drawable.detail_mujer, R.string.datospersonales)

    data object EstadoCivil: GeneralInfo(R.drawable.detail_mujer, R.string.estadocivil)

    data object Familia: GeneralInfo(R.drawable.detail_mujer, R.string.familia)

    data object Hogar: GeneralInfo(R.drawable.detail_mujer, R.string.hogar)

    data object Relaciones: GeneralInfo(R.drawable.detail_mujer, R.string.relaciones)

    data object Ropa: GeneralInfo(R.drawable.detail_mujer, R.string.ropa)*/

}
/**sealed class GeneralInfo(val cpModel: CpModel, val cpInfo: CpInfo) {
    data object Alto: GeneralInfo(CpModel.Alto, CpInfo.Alto)
    data object Bajo: GeneralInfo(CpModel.Bajo, CpInfo.Bajo)
    data object Gordo: GeneralInfo(CpModel.Gordo, CpInfo.Gordo)
    data object Rubio: GeneralInfo(CpModel.Rubio, CpInfo.Rubio)
    data object Morocho: GeneralInfo(CpModel.Morocho, CpInfo.Morocho)


}*/