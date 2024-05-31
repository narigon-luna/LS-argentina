package com.curso.lenguasdeseñas.ui.verbosypron.data

import com.curso.lenguasdeseñas.ui.verbosypron.dominio.pp.ProPerInfo
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.pp.ProPerInfo.*
import javax.inject.Inject

class ProPerProvaider @Inject constructor() {

    fun getprpPer(): List<ProPerInfo>{
        return  listOf(
            ElElla,
            EllosEllas,
            Mio,
            Nosotros,
            Nuestro,
            Suyo,
            Todos,
            Tu,
            Tuyo,
            Ustedes,
            Yo

        )
    }
}