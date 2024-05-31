package com.curso.lenguasdeseñas.ui.verbosypron.dominio.vdd

import com.curso.lenguasdeseas.R

sealed class VerboDedespInfo (val  img:Int, val img1:Int, val name:Int, val descrip:Int) {
    data object Hacerlatarea : VerboDedespInfo(R.drawable.len_4, R.drawable.len_4,R.string.hacerlatare,R.string.ht)
    data object Irsalir : VerboDedespInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.ir,R.string.irsali)
    data object Quedarse : VerboDedespInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.quedarse,R.string.queda)
    data object Venir : VerboDedespInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.venir,R.string.ven)
    data object Entrar : VerboDedespInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.entrar,R.string.entr)
    data object Subir : VerboDedespInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.subir,R.string.subi)
    data object Bajar : VerboDedespInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.bajar,R.string.baj)
    data object Caminar : VerboDedespInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.caminar,R.string.cam)
    data object Llegar : VerboDedespInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.llegar,R.string.lleg)
    data object Esperar : VerboDedespInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.esperar,R.string.esper)
    data object Correr : VerboDedespInfo(R.drawable.detail_mujer, R.drawable.detail_mujer,R.string.correr,R.string.corr)

}