package com.curso.lenguasdeseñas.ui.gramatica.data.provider

import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.RelacionesInfo
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.RelacionesInfo.*
import javax.inject.Inject

class RelacionesProvaider @Inject constructor()  {
    fun getrelacion(): List<RelacionesInfo>{
        return listOf(
            Ahijadoa,
            Amante,
            Amigoa,
            Compañeroa,
            Madrina,
            Novioa,
            Padrino,
            Pareja,
            Señor,
            Señora
        )
    }
}