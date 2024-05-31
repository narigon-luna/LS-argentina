package com.curso.lenguasdeseñas.ui.verbosypron.data

import com.curso.lenguasdeseñas.ui.verbosypron.dominio.adv.AdverbioInfo
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.adv.AdverbioInfo.*
import javax.inject.Inject

class AdverbioProvider @Inject constructor() {
    fun getAdverbio(): List<AdverbioInfo> {
        return listOf(
            Ahi,
            Alli,
            Aqui,
            Bastante,
            Cerca,
            Demasiado,
            Lejos,
            Mucho,
            Nada,
            Poco,
            )
    }
}