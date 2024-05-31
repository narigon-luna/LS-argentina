package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo.CaracteristicasPersonales
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo.DatosPersonales
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo.EstadoCivil
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo.Familia
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo.FormulasDeCortesia
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo.OcioYViaja
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo.Relaciones
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo.Sentimientos
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo.Trabajo
import com.curso.lenguasdeseñas.dominio.model.model.modelcolores.ColoresInfo
import javax.inject.Inject

class GramaticaProvaider  @Inject constructor(){
    fun getGramatica(): List<GramaticaInfo> {
        return listOf(
            CaracteristicasPersonales,
            DatosPersonales,
            EstadoCivil,
            Familia,
            FormulasDeCortesia,
            OcioYViaja,
            Relaciones,
            Sentimientos,
            Trabajo
        )
    }
}