package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.ropayacc.RopayAccInfo
import com.curso.lenguasdeseñas.dominio.model.model.ropayacc.RopayAccInfo.*
import javax.inject.Inject

class RopayAccProvider @Inject constructor()  {
    fun getropyAcc(): List<RopayAccInfo>{
        return listOf(
            Ropa,
            Anillo,
            Anteojos,
            Anillo,
            Aros,
            Blusa,
            Bufanda,
            Blusa,
            Cadena,
            Camisa,
            Campera,
            Cartera,
            Cinto,
            Gorro,
            Guardapolvo,
            Jeans,
            Ojotas,
            Pantalon,
            Pantunflas,
            Pañuelo,
            Pijama,
            Pollera,
            Pulsera,
            Reloj,
            Remera,
            Ropainteriordemujer,
            Saco,
            Tapado,
            Vestido,
            Zapatillas,
            Zapatos
        )
    }
}