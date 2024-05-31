package com.curso.lenguasdeseñas.ui.verbosypron.data

import com.curso.lenguasdeseñas.ui.verbosypron.dominio.vdd.VerboDedespInfo
import javax.inject.Inject

class VddProvaider  @Inject constructor()  {
    fun getvdd(): List<VerboDedespInfo> {
        return listOf(
            VerboDedespInfo.Bajar,
            VerboDedespInfo.Caminar,
            VerboDedespInfo.Correr,
            VerboDedespInfo.Entrar,
            VerboDedespInfo.Esperar,
            VerboDedespInfo.Hacerlatarea,
            VerboDedespInfo.Irsalir,
            VerboDedespInfo.Llegar,
            VerboDedespInfo.Quedarse,
            VerboDedespInfo.Subir,
            VerboDedespInfo.Venir
        )
    }
}