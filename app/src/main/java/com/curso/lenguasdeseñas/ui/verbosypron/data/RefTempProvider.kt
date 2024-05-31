package com.curso.lenguasdeseñas.ui.verbosypron.data

import com.curso.lenguasdeseñas.ui.verbosypron.dominio.reftemp.RefTempInfo
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.reftemp.RefTempInfo.*
import javax.inject.Inject

class RefTempProvider  @Inject constructor()  {
    fun getRefTemp(): List<RefTempInfo>{
        return listOf(
            Alamadrugada,
            Alamañana,
            Alanoche,
            Antes,
            Alatarde,
            Almediodia,
            Antesdeayer,
            Ayer,
            Dia,
            Diafestivo,
            Futuro,
            Hasta,
            Hoy,
            Mañana,
            Nunca,
            Parasiempre,
            Pasado,
            Pasdomañana,
            Primereravez,
            Proximo,
            Siempre,
            Tardar,
            Tarde,
            Temprano,
            Todoeldia,
            Todoslaodias
        )
    }
}