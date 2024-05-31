package com.curso.lenguasdeseñas.dominio.model.model.modelcp

import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.R.drawable.detail_manos

sealed class CpInfo(val imgcp:Int, val namecp:Int) {
     data object Uno: CpInfo(R.drawable.sonia, R.string.uno)
     data object Dos: CpInfo(R.drawable.sonia, R.string.dos)
     data object Tres: CpInfo(R.drawable.sonia, R.string.tres)
     data object Cuatro: CpInfo(R.drawable.sonia, R.string.cuatros)
     data object Cinco: CpInfo(R.drawable.sonia, R.string.cinco)
     data object Seis: CpInfo(R.drawable.sonia, R.string.sei)
     data object Siete: CpInfo(R.drawable.sonia, R.string.siete)
     data object Ocho: CpInfo(R.drawable.sonia, R.string.ocho)
     data object Nueve: CpInfo(R.drawable.sonia, R.string.nueve)
     data object Diez: CpInfo(R.drawable.sonia, R.string.diez)
     data object Once: CpInfo(R.drawable.sonia, R.string.once)
     data object Doce: CpInfo(R.drawable.sonia, R.string.doce)
     data object Trece: CpInfo(R.drawable.sonia, R.string.trece)
     data object Catorce: CpInfo(R.drawable.sonia, R.string.catorce)
     data object Quince: CpInfo(R.drawable.sonia, R.string.quince)
     data object Dieciseis: CpInfo(R.drawable.sonia, R.string.dieciseis)
     data object Diecisiete: CpInfo(R.drawable.sonia, R.string.diecisiete)
     data object Dieciocho: CpInfo(R.drawable.sonia, R.string.dieciocho)
     data object Diecinueve: CpInfo(R.drawable.sonia, R.string.diecinueve)
     data object Veinte: CpInfo(R.drawable.sonia, R.string.veinte)
    /** data object Alto: CpInfo(R.drawable.detail_mujer, R.string.alto)
     data object Bajo: CpInfo(R.drawable.sonia, R.string.bajo)
     data object Gordo: CpInfo(R.drawable.yo, R.string.gordo )
     data object Rubio: CpInfo(R.drawable.sonia, R.string.rubio)
     data object Morocho: CpInfo(R.drawable.sonia, R.string.morocho )*/

}