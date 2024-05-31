package com.curso.lenguasdeseñas.dominio.model.model.modelcolores

import com.curso.lenguasdeseas.R

sealed class ColoresInfo/*calendario*/ (val photo: Int, val photo1: Int, val nameColor: Int,val descripcionCol: Int){
    data object Colores : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.colores, R.string.colo)
    data object Amarillo : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.amarillo, R.string.amari)
    data object Anaranjado : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.anaranjado, R.string.anaran)
    data object Celeste : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.celeste, R.string.cele)
    data object Marron : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.marron, R.string.marr)
    data object Beige : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.beige, R.string.beig)
    data object Rosa : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.rosa, R.string.ros)
    data object Violeta : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.violeta, R.string.viole)
    data object Gris : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.gris, R.string.gri)
    data object Plateado : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.plateado, R.string.platea)
    data object Dorado : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.dorado, R.string.dorad)
    data object Claro : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.claro, R.string.clar)
    data object Oscuro : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.oscuro, R.string.oscu)
    data object Opaco : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.opaco, R.string.opa)
    data object Blanco : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.blanco, R.string.blac)
    data object Negro : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.negro, R.string.negr)
    data object Rojo : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.rojo, R.string.roj)
    data object Azul : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.azul, R.string.az)
    data object Verde : ColoresInfo(R.drawable.len_4, R.drawable.len_4,R.string.verde, R.string.verd)

}