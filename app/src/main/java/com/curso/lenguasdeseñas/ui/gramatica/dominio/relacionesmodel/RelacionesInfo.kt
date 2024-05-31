package com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel

import com.curso.lenguasdeseas.R

sealed class RelacionesInfo(val imgrela: Int,val imgrela1: Int,val namerela: Int,val descrirela: Int) {
    data object Compañeroa : RelacionesInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.compañeroa,R.string.cumpa)
    data object Amigoa : RelacionesInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.amigo,R.string.amix)
    data object Pareja : RelacionesInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.pareja,R.string.parej)
    data object Novioa : RelacionesInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.novioa,R.string.novi)
    data object Amante : RelacionesInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.amante,R.string.amant)
    data object Madrina : RelacionesInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.madrina,R.string.madri)
    data object Padrino : RelacionesInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.padrino,R.string.padri)
    data object Ahijadoa : RelacionesInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.ahijadoa,R.string.ahij)
    data object Señora : RelacionesInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.señora,R.string.ñora)
    data object Señor : RelacionesInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.señor,R.string.ñor)
}
