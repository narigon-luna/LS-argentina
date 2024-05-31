package com.curso.lenguasdeseñas.data.provider.provider.provider


import com.curso.lenguasdeseñas.dominio.model.model.portadamodel.PortadaInfo
import com.curso.lenguasdeseñas.dominio.model.model.portadamodel.PortadaInfo.*
import javax.inject.Inject

class PortadaProvaider  @Inject constructor() {
    fun getPortada(): List<PortadaInfo> {
        return listOf(
            Introduccion,
            Explicacion
        )
    }
}

