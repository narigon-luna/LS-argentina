package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.generalmodel.GeneralInfo
import com.curso.lenguasdeseñas.dominio.model.model.generalmodel.GeneralInfo.*
import com.curso.lenguasdeseñas.dominio.model.model.modelcolores.ColoresInfo
import javax.inject.Inject

class GeneralProvider @Inject constructor() {
    fun getGenerales(): List<GeneralInfo> {
        return listOf(
            Numeros,
            Dias,
            Colores,
            EstacionesDelAño,
            Clima,
            RopayAccesorios,
            Partesdelhogar,
            Escuelayeducacion
            /**Alto,
            Bajo,
            Gordo,
            Rubio,
            Morocho*/
        )
    }
}