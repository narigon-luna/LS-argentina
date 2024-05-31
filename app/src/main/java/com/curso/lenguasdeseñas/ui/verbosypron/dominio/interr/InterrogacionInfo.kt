package com.curso.lenguasdeseñas.ui.verbosypron.dominio.interr

import com.curso.lenguasdeseas.R

sealed class InterrogacionInfo(val img:Int, val img1:Int, val name:Int, val descrip:Int) {
    data object Pregunta : InterrogacionInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.pregunta, R.string.pregun)
    data object Que : InterrogacionInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.que, R.string.qu)
    data object Quien : InterrogacionInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.quien, R.string.qi)
    data object Donde : InterrogacionInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.donde, R.string.don)
    data object Cual : InterrogacionInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.cual, R.string.cua)
    data object Como : InterrogacionInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.como, R.string.com)
    data object Cuando : InterrogacionInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.cuando, R.string.cuand)
    data object Cuantos : InterrogacionInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.cuantos, R.string.cto)
    data object Paraque : InterrogacionInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.paraque, R.string.pq)
    data object Porque : InterrogacionInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.porque, R.string.poq)
}