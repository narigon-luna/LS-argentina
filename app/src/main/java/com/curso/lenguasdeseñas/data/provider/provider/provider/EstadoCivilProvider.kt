package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.estadocivilmodel.EstadoCivilInfo
import com.curso.lenguasdeseñas.dominio.model.model.estadocivilmodel.EstadoCivilInfo.*
import com.curso.lenguasdeseñas.dominio.model.model.modelcp.CpInfo
import javax.inject.Inject

class EstadoCivilProvider @Inject constructor() {
    fun getEstadocivil(): List<EstadoCivilInfo>{
     return listOf(
         Casado,
         Concubino,
         Divorciado,
         Separado,
         Soltero,
         Viudo
     )
    }
}