package com.curso.lenguasdeseñas.dominio.model.model.fcortesia

import com.curso.lenguasdeseas.R

sealed class FcortesiaInfo(val imgfc:Int,val imfc1:Int,val namefc:Int ,val descrfc:Int) {
    data object Hola: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.holas, R.string.ho)
    data object Bienvenido: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.bienvenido, R.string.bi)
    data object BuenDia: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.buendia, R.string.bn)
    data object BuenasTardes: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.buenastardes, R.string.bt)
    data object BuenasNoches: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.buenasnoches, R.string.bn)
    data object ComoEstas: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.comoestas, R.string.com)
    data object Bien: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.bien, R.string.bn)
    data object MasoMenos: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.masomenos, R.string.mom)
    data object Mal: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.mal, R.string.ml)
    data object Permiso: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.permiso, R.string.per)
    data object Gracias: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.gracias, R.string.grax)
    data object ParFavor: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.porfa, R.string.porfa)
    data object DeNada: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.denada, R.string.dn)
    data object Perdon: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.perdon, R.string.pdn)
    data object TodoBien: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.todobien, R.string.tb)
    data object OtraVez: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.otravez, R.string.ov)
    data object Entender: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.entender, R.string.ent)
    data object NoEntender: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.noentender, R.string.noent)
    data object Chau : FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.chau, R.string.ch)
    data object NosVemos: FcortesiaInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.nosvemos, R.string.nv
    )

}



