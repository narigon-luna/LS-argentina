package com.curso.lenguasdeseñas.dominio.model.model.vypmodel

import com.curso.lenguasdeseas.R

sealed class VyPInfo (val img:Int, val namevp: Int, val descrip: Int) {
    data object VerbosDeDesplazamiento : VyPInfo(R.drawable.detail_mujer,R.string.verbosedesplazamiento,R.string.vdd)
    data object PronombresPersonales : VyPInfo(R.drawable.detail_mujer,R.string.pronombrespersonales,R.string.ppe)
    data object Interrogaciones : VyPInfo(R.drawable.detail_mujer,R.string.interrogaciones,R.string.interr)
    data object ReferenciasTemporales : VyPInfo(R.drawable.detail_mujer,R.string.referenciastemporales,R.string.re)
    data object Adverbios : VyPInfo(R.drawable.detail_mujer,R.string.adverbios,R.string.adv)
}
