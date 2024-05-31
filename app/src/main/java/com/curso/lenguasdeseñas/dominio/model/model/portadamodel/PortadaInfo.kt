package com.curso.lenguasdeseñas.dominio.model.model.portadamodel

import com.curso.lenguasdeseas.R

sealed class PortadaInfo(val intro: Int, val expli: Int, val video : String) {
    data object Introduccion: PortadaInfo (R.string.lorem_ipsum, R.string.explicacion,"android.resource://" + "/" + R.raw.ic_altura )
    data object Explicacion: PortadaInfo (R.string.lorem_ipsum,R.string.explicacion, "android.resource://" + "/" + R.raw.ic_altura)
}