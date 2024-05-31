package com.curso.lenguasdeseñas.ui.gramatica.data.provider

import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.sentimientos.SentimientosInfo
import javax.inject.Inject

class SentimientosProvaider @Inject constructor() {
    fun getsentimientos(): List<SentimientosInfo> {
        return listOf(
            SentimientosInfo.Aburrido,
            SentimientosInfo.Confundido,
            SentimientosInfo.Cansado,
            SentimientosInfo.Contento,
            SentimientosInfo.Enamorado,
            SentimientosInfo.Enojado,
            SentimientosInfo.Feliz,
            SentimientosInfo.Nervioso,
            SentimientosInfo.Sorprendido,
            SentimientosInfo.Tranquilo,
            SentimientosInfo.Triete
        )
    }
}