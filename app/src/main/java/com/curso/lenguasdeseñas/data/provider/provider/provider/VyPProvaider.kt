package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.vypmodel.VyPInfo
import com.curso.lenguasdeseñas.dominio.model.model.vypmodel.VyPInfo.*
import javax.inject.Inject

class VyPProvaider  @Inject constructor() {
    fun getVyP(): List<VyPInfo> {
        return listOf(
            Adverbios,
            Interrogaciones,
            PronombresPersonales,
            ReferenciasTemporales,
            VerbosDeDesplazamiento
        )
    }
}