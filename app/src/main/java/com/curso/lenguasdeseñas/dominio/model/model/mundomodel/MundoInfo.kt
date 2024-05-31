package com.curso.lenguasdeseñas.dominio.model.model.mundomodel

import com.curso.lenguasdeseas.R

sealed class MundoInfo (val img1: Int ,val img2:Int,val name: Int ,val descripcion: Int ) {
    data object B : MundoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.b,R.string.b)
    data object Apellido : MundoInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.apellido,R.string.apell)
    data object Edad : MundoInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.edad,R.string.ed)
    data object Casado : MundoInfo(R.drawable.detail_mujer,R.drawable.detail_mujer,R.string.casado,R.string.casa)

}