package com.curso.lenguasdeseñas.ui.verbosypron.dominio.pp

import com.curso.lenguasdeseas.R

sealed class ProPerInfo(val  img:Int, val img1:Int, val name:Int, val descrip:Int) {

     data object Yo : ProPerInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.yo,R.string.io)
     data object Tu : ProPerInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.tu,R.string.tuu)
     data object ElElla : ProPerInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.elElla,R.string.ee)
     data object Nosotros : ProPerInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.nosotros,R.string.noso)
     data object Ustedes : ProPerInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.ustedes,R.string.usted)
     data object EllosEllas : ProPerInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.ees,R.string.ees)
     data object Mio : ProPerInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.mio,R.string.miio)
     data object Tuyo : ProPerInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.tuyo,R.string.tuy)
     data object Suyo : ProPerInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.suyo,R.string.suy)
     data object Nuestro : ProPerInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.nuestro,R.string.nue)
     data object Todos : ProPerInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.todos,R.string.todes)

 }