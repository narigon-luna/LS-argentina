package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.ocio.OcioInfo
import com.curso.lenguasdeseñas.dominio.model.model.ocio.OcioInfo.*
import javax.inject.Inject

class OcioProvider @Inject constructor() {
    fun getocio(): List<OcioInfo> {
        return listOf(
            Auto,
            Avion,
            Barco,
            Bicicleta,
            Camion,
            CampingCarpa,
            Cine,
            Colectivo,
            Deportes,
            FelizCumpleaños,
            Fiesta,
            Fotografia,
            Helicoptero,
            Hotel,
            Maar,
            Microomnibus,
            Montaña,
            Moto,
            Musica,
            Navidad,
            Parque,
            Peliculas,
            Regalo,
            Rio,
            SemanaSanta,
            Subte,
            Vacaciones,
            Vacaciones,
            Taxi,
            Teatro,
            Tren,
            Turismo,
            )
    }
}