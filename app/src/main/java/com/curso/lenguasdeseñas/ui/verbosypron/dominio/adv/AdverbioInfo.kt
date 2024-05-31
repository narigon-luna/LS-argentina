package com.curso.lenguasdeseñas.ui.verbosypron.dominio.adv

import com.curso.lenguasdeseas.R

sealed class AdverbioInfo(val img:Int,val img1:Int,val name:Int,val descrip:Int) {
    data object Aqui : AdverbioInfo(R.drawable.len_4, R.drawable.len_4,R.string.aqui,R.string.aq)
    data object Ahi : AdverbioInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.ahi,R.string.ah)
    data object Alli : AdverbioInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.alli,R.string.all)
    data object Cerca : AdverbioInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.cerca,R.string.cerc)
    data object Lejos : AdverbioInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.lejos,R.string.lej)
    data object Mucho : AdverbioInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.mucho,R.string.much)
    data object Poco : AdverbioInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.poco,R.string.pco)
    data object Nada : AdverbioInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.nada,R.string.adv)
    data object Demasiado : AdverbioInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.demasiado,R.string.dema)
    data object Bastante : AdverbioInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.bastante,R.string.bastan)
 }
