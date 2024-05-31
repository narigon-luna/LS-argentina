package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.modelcolores.ColoresInfo
import com.curso.lenguasdeseñas.dominio.model.model.modeldias.DiasInfo
import com.curso.lenguasdeseñas.dominio.model.model.modeldias.DiasInfo.*
import javax.inject.Inject

class DiasProvider  @Inject constructor() {
    fun getDias(): List<DiasInfo> {
        return listOf(
            Lunes,
            Martes,
            Miercoles,
            Jueves,
            Viernes,
            Sabado,
            Domingo,
            FinDeSemana,
            Semana,
            Meses,
            Enero,
            Febrero,
            Marzo,
            Abril,
            Mayo,
            Junio,
            Julio,
            Agosto,
            Setiembre,
            Octubre,
            Noviembre,
            Diceimbre,
            Año,
            Hora,
            Minutos,
            Segundos,
            Mediahora,
            Menos,
            Tardar

        )
    }
}