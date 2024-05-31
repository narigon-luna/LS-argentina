package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerInfo
import com.curso.lenguasdeseñas.dominio.model.model.datospermodel.DatoPerInfo
import com.curso.lenguasdeseñas.dominio.model.model.datospermodel.DatoPerInfo.*
import javax.inject.Inject

class DatoPerProvider @Inject constructor()  {
    fun getDatoPer(): List<DatoPerInfo> {
        return listOf(
            Apellido,
            Nombre,
            Presentarme,
            Señapersonales,
            Edad,
            Dni,
            Fechadenacimiento,
            Direccion,
            NumeroCelular,
            Cuil
        )
    }
}