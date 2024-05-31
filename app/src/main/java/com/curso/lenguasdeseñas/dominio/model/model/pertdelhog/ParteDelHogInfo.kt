package com.curso.lenguasdeseñas.dominio.model.model.pertdelhog

import com.curso.lenguasdeseas.R

sealed class ParteDelHogInfo (val img: Int,val img1: Int,val name: Int,val descrip: Int){
    data object Edificio : ParteDelHogInfo(R.drawable.len_4, R.drawable.len_4,R.string.edificio,R.string.edif)
    data object Vivienda : ParteDelHogInfo(R.drawable.len_4, R.drawable.len_4,R.string.vivienda,R.string.vivien)
    data object Ascensor : ParteDelHogInfo(R.drawable.len_4, R.drawable.len_4,R.string.ascensor,R.string.ascen)
    data object Comedor : ParteDelHogInfo (R.drawable.len_4, R.drawable.len_4,R.string.comedor,R.string.comed)
    data object Dormitorio : ParteDelHogInfo(R.drawable.len_4, R.drawable.len_4,R.string.dormitorio,R.string.dormit)
    data object Baño : ParteDelHogInfo  (R.drawable.len_4, R.drawable.len_4,R.string.baño,R.string.bañ)
    data object Living : ParteDelHogInfo(R.drawable.len_4, R.drawable.len_4,R.string.living,R.string.liv)
    data object Cocina : ParteDelHogInfo(R.drawable.len_4, R.drawable.len_4,R.string.cocina,R.string.cocin)
    data object GarajeCochera : ParteDelHogInfo(R.drawable.len_4, R.drawable.len_4,R.string.garajecoch,R.string.grajcoch)
    data object Terraza : ParteDelHogInfo(R.drawable.len_4, R.drawable.len_4,R.string.terraza,R.string.teraz)
    data object Jardin : ParteDelHogInfo (R.drawable.len_4, R.drawable.len_4,R.string.jardin,R.string.jard)
    data object Fondo : ParteDelHogInfo  (R.drawable.len_4, R.drawable.len_4,R.string.fondo,R.string.fond)

}