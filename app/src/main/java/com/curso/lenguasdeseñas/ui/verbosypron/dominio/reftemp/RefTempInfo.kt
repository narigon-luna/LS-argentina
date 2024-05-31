package com.curso.lenguasdeseñas.ui.verbosypron.dominio.reftemp

import com.curso.lenguasdeseas.R

sealed class RefTempInfo(val  img:Int, val img1:Int, val name:Int, val descrip:Int) {
    data object Ayer : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.ayer, R.string.aye)
    data object Antesdeayer : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.antesdeayer, R.string.aday)
    data object Hoy : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.hoy, R.string.hoi)
    data object Mañana : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.mañana, R.string.mañ)
    data object Pasdomañana : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.pasadomañana, R.string.pasadom)
    data object Antes : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.antes, R.string.ant)
    data object Pasado : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.pasado, R.string.pasad)
    data object Futuro : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.futuro, R.string.futu)
    data object Alamañana : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.alamañana, R.string.alamañ)
    data object Alatarde : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.alatarde, R.string.alatar)
    data object Almediodia : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.almediodia, R.string.almediod)
    data object Alanoche : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.alanoche, R.string.alanoch)
    data object Alamadrugada : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.alamadrugada, R.string.alamadru)
    data object Todoslaodias : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.todoslosdia, R.string.todoslosd)
    data object Todoeldia : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.todoeldia, R.string.todeel)
    data object Siempre : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.siempre, R.string.siemp)
    data object Parasiempre : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.parasiempre, R.string.parasiem)
    data object Nunca : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.nunca, R.string.nunc)
    data object Primereravez : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.primeravez, R.string.pvz)
    data object Proximo : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.proximo, R.string.proxi)
    data object Hasta : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.hasta, R.string.hast)
    data object Temprano : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.temprano, R.string.tempra)
    data object Tardar : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.tardar, R.string.tarda)
    data object Tarde : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.tarde, R.string.tard)
    data object Dia : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.dia, R.string.di)
    data object Diafestivo : RefTempInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.diafestivo, R.string.df)

}