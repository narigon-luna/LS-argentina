package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.estycli.EstyClimInfo
import com.curso.lenguasdeseñas.dominio.model.model.estycli.EstyClimInfo.*
import javax.inject.Inject

class EstyClimProvider  @Inject constructor() {
    fun getEstyCli(): List<EstyClimInfo> {
        return listOf(
            Primavera,
            Verano,
           Otoño,
           /** Invierno,
            Sol,
            Nublado,
            Llovizna,
            Rayos,
            Relampago,
            Granizo,
            Nieve,
            Mojado,
            Seco,
            Frio,
            Calor*/
        )
    }
}
