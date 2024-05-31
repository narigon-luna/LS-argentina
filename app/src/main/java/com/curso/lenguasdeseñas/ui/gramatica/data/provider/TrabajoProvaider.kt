package com.curso.lenguasdeseñas.ui.gramatica.data.provider

import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.trabajo.TrabajoInfo
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.trabajo.TrabajoInfo.*
import javax.inject.Inject

class TrabajoProvaider @Inject constructor() {
    fun gettrabajo(): List<TrabajoInfo>{
        return listOf(
            Bar,
            Buscar,
            Cobrar,
            Comunicar,
            Cordinadora,
            Despedie,
            Dueño,
            Empleadoa,
            Empresa,
            Encontrar,
            Fabrica,
            Instructora,
            Jefe,
            Jubiladoa,
            NegocioComercio,
            Oficina,
            Pensionadoa,
            Preparar,
            Profesional,
            Renunciar,
            Secretarioa,
            Sueldo,
            Supervisor,
            Suspender,
            Tesorero,
            Trabajar
        )
    }
}