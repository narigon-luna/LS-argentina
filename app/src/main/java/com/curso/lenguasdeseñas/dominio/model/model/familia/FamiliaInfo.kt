package com.curso.lenguasdeseñas.dominio.model.model.familia

import com.curso.lenguasdeseas.R

sealed class FamiliaInfo (val imgfami: Int, val img1fami: Int, val namefami: Int, val descrpfami: Int) {
    data object Familias: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.familia, R.string.fa)
    data object Generaciones: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.generaciones, R.string.general)
    data object Papa: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.papa, R.string.pa)
    data object Mama: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.mama, R.string.mam)
    data object Hijoa: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.hijoa, R.string.hij)
    data object Hermanoa: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.hermanoa, R.string.herm)
    data object Mellizosa: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.mellizosa, R.string.mell)
    data object Gemeloa: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.gemeloa, R.string.geme)
    data object Abueloa: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.abueloa, R.string.abu)
    data object Primoa: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.primoa, R.string.primis)
    data object Nietoa: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.nietoa, R.string.niet)
    data object Tio: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.tio, R.string.tiis)
    data object Tia: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.tia, R.string.tiia)
    data object Sobrinoa: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.sobrinoa, R.string.sobri)
    data object Yerno: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.yerno, R.string.yer)
    data object Nuera: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.nuera, R.string.nue)
    data object Cuñado: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.cuñado, R.string.cuñex)
    data object Madrastra: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.madrastra, R.string.madras)
    data object Padrastro: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.padrastro, R.string.padras)
    data object Esposoa: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.esposoa, R.string.espo)
    data object Ahijado: FamiliaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.ahijado, R.string.ahij)
}




