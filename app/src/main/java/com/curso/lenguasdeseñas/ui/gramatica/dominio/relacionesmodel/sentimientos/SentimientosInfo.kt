package com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.sentimientos

import com.curso.lenguasdeseas.R

sealed class SentimientosInfo(val img: Int, val img2: Int, val name: Int, val descripcion: Int) {
    data object Contento : SentimientosInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.contento,R.string.cont)
    data object Triete : SentimientosInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.triste,R.string.tris)
    data object Aburrido : SentimientosInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.aburrido,R.string.aburri)
    data object Cansado : SentimientosInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.cansado,R.string.cansa)
    data object Feliz : SentimientosInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.feliz,R.string.feli)
    data object Sorprendido : SentimientosInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.sorprendido,R.string.sorpren)
    data object Confundido : SentimientosInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.confundido,R.string.confu)
    data object Enamorado : SentimientosInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.enamorado,R.string.enamor)
    data object Tranquilo : SentimientosInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.tranquilo,R.string.tranqui)
    data object Nervioso : SentimientosInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.nervioso,R.string.nervio)
    data object Enojado : SentimientosInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.enojado,R.string.enoj)



}