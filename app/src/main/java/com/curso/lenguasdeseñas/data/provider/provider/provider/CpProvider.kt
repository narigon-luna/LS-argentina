package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.modelcp.CpInfo
import com.curso.lenguasdeseñas.dominio.model.model.modelcp.CpInfo.*
import javax.inject.Inject

class CpProvider @Inject constructor() {
    fun getCp(): List<CpInfo> {
        return listOf(
            Uno,
            Dos,
            Tres,
            Cuatro,
            Cinco,
            Seis,
            Siete,
            Ocho,
            Nueve,
            Diez,
            Once,
            Doce,
            Trece,
            Catorce,
            Quince,
            Dieciseis,
            Diecisiete,
            Dieciocho,
            Diecinueve,
            Veinte
        )
    }
}