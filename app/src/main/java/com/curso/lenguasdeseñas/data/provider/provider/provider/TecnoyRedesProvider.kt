package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.tecnoyredes.TecnotRedesInfo
import com.curso.lenguasdeseñas.dominio.model.model.tecnoyredes.TecnotRedesInfo.*
import javax.inject.Inject

class TecnoyRedesProvider  @Inject constructor() {
    fun getTecnoyRedes(): List<TecnotRedesInfo> {
        return listOf(
            Arroba,
            Celular,
            Claro,
            Computadora,
            Correoelectronico,
            Facebook,
            Instagram,
            Interner,
            Movistar,
            Personal,
            Telefono,
            Television,
            Twitter,
            Videollamada,
            Whatsapp,
            Wifi
        )
    }
}