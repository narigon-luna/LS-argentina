package com.curso.lenguasdeseñas.dominio.model.model.tecnoyredes

import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.modeldias.DiasInfo

sealed class TecnotRedesInfo(val imgtr: Int, val img2tr: Int, val nametr: Int, val descricciontr: Int) {
    data object Television: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.television, R.string.telev)
    data object Telefono: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.telefono, R.string.t)
    data object Celular: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.celular, R.string.celu)
    data object Computadora: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.computadora, R.string.com)
    data object Interner: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.interner, R.string.`in`)
    data object  Wifi: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.wifi, R.string.w)
    data object  Correoelectronico: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.correoelectronico, R.string.coel)
    data object  Arroba: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.arroba, R.string.arro)
    data object  Videollamada: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.videollamada, R.string.vll)
    data object  Facebook: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.facebook, R.string.fac)
    data object  Whatsapp: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.whatsapp, R.string.w)
    data object  Instagram: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.instagram, R.string.ins)
    data object  Twitter: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.twitter, R.string.tw)
    data object  Personal: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.personal, R.string.per)
    data object  Claro: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.claro, R.string.cla)
    data object  Movistar: TecnotRedesInfo(R.drawable.len_4,R.drawable.len_4, R.string.movistar, R.string.mo)

}