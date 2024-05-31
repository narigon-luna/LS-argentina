package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.pertdelhog.ParteDelHogInfo
import com.curso.lenguasdeseñas.dominio.model.model.pertdelhog.ParteDelHogInfo.*
import javax.inject.Inject

class PerDelHogProvider  @Inject constructor() {
    fun getPartHog(): List<ParteDelHogInfo>{
        return listOf(
            Ascensor,
            Baño,
            Cocina,
            Comedor,
            Dormitorio,
            Edificio,
            Fondo,
            GarajeCochera,
            Jardin,
            Living,
            Terraza,
            Vivienda
        )
    }
}