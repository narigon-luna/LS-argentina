package com.curso.lenguasdeseñas.dominio.model.model.carrusel

import com.curso.lenguasdeseas.R

sealed class CarruselInfo (val img: Int,val img1: Int,val img2: Int){
    data object Foto: CarruselInfo(R.drawable.sonia,R.drawable.sonia,R.drawable.sonia)
    data object Foto1: CarruselInfo(R.drawable.sonia,R.drawable.sonia,R.drawable.sonia)
    data object Foto2: CarruselInfo(R.drawable.sonia,R.drawable.sonia,R.drawable.sonia)
}