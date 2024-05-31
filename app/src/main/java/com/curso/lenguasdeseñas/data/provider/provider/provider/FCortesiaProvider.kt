package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.fcortesia.FcortesiaInfo
import com.curso.lenguasdeseñas.dominio.model.model.fcortesia.FcortesiaInfo.*
import javax.inject.Inject

class FCortesiaProvider @Inject constructor() {

    fun getfcortesia(): List<FcortesiaInfo> {
        return listOf(
            NosVemos,
            Bien,
            Bienvenido,
            BuenDia,
            BuenasTardes,
            BuenasNoches,
            Chau,
            ComoEstas,
            DeNada,
            Entender,
            Gracias,
            Hola,
            Mal,
            MasoMenos,
            NoEntender,
            OtraVez,
            ParFavor,
            Perdon,
            Permiso,
            TodoBien

        )
    }
}