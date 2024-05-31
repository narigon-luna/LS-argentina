package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.modelcolores.ColoresInfo
import com.curso.lenguasdeseñas.dominio.model.model.modelcolores.ColoresInfo.*
import javax.inject.Inject

class ColoresProvaider @Inject constructor() {
    fun getColores(): List<ColoresInfo> {
        return listOf(
                    Colores,
                    Amarillo,
                    Anaranjado,
                    Azul,
                    Beige,
                    Blanco,
                    Celeste,
                    Claro,
                    Dorado,
                    Gris,
                    Marron,
                    Negro,
                    Opaco,
                    Oscuro,
                    Plateado,
                    Rojo,
                    Rosa,
                    Verde,
                    Violeta,
        )
    }
}