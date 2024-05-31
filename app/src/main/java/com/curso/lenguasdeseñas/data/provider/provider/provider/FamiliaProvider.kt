package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.familia.FamiliaInfo
import com.curso.lenguasdeseñas.dominio.model.model.familia.FamiliaInfo.*
import javax.inject.Inject

class FamiliaProvider @Inject constructor() {
    fun getFamilia(): List<FamiliaInfo> {
        return listOf(
            Ahijado,
            Cuñado,
            Esposoa,
            Abueloa,
            Familias,
            Gemeloa,
            Generaciones,
            Hermanoa,
            Hijoa,
            Mama,
            Madrastra,
            Mellizosa,
            Nietoa,
            Nuera,
            Padrastro,
            Papa,
            Primoa,
            Sobrinoa,
            Tia,
            Tio,
            Yerno
        )
    }
}