package com.curso.lenguasdeseñas.ui.verbosypron.data

import com.curso.lenguasdeseñas.ui.verbosypron.dominio.interr.InterrogacionInfo
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.interr.InterrogacionInfo.*
import javax.inject.Inject

class InterrogacioProvaider @Inject constructor() {
    fun getinterrog(): List<InterrogacionInfo> {
        return listOf(
            Como,
            Cual,
            Cuando,
            Cuantos,
            Donde,
            Paraque,
            Porque,
            Pregunta,
            Que,
            Quien
        )
    }
}