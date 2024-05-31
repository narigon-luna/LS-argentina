package com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel

import com.curso.lenguasdeseas.R

sealed class GramaticaInfo(val imggramatica: Int, val namegramatica: Int, val descripgramatica: Int) {
   data object CaracteristicasPersonales: GramaticaInfo(R.drawable.detail_mujer, R.string.caracteristicasPersonales,R.string.cp)
   data object DatosPersonales: GramaticaInfo(R.drawable.sonia, R.string.datosPersonales,R.string.dp)
   data object EstadoCivil: GramaticaInfo(R.drawable.sonia, R.string.estadoCivil,R.string.ec)
   data object Familia: GramaticaInfo(R.drawable.sonia, R.string.familia,R.string.fa)
   data object FormulasDeCortesia: GramaticaInfo(R.drawable.sonia, R.string.formulasDeCortesia,R.string.fc)
   data object OcioYViaja: GramaticaInfo(R.drawable.sonia, R.string.ocioYViaja,R.string.ov)
   data object Relaciones: GramaticaInfo(R.drawable.sonia, R.string.relaciones,R.string.rela)
   data object Sentimientos: GramaticaInfo(R.drawable.sonia, R.string.sentimientos,R.string.se)
   data object Trabajo: GramaticaInfo(R.drawable.sonia, R.string.trabajo,R.string.tra)


}