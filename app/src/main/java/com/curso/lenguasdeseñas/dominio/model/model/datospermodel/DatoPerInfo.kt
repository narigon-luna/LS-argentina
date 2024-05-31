package com.curso.lenguasdeseñas.dominio.model.model.datospermodel

import com.curso.lenguasdeseas.R

sealed class DatoPerInfo (val photo: Int, val photo1: Int,val photo2: Int, val photo3: Int, val namedatoper: Int, val descripdatoper: Int) {

   data object Presentarme: DatoPerInfo (R.drawable.len_4, R.drawable.len_4, R.drawable.len_4,R.drawable.len_4,R.string.presentarme,R.string.presen)
   data object Nombre: DatoPerInfo (R.drawable.len_4, R.drawable.len_4, R.drawable.len_4,R.drawable.len_4,R.string.nombre,R.string.nom)
   data object Apellido: DatoPerInfo (R.drawable.sonia, R.drawable.sonia, R.drawable.sonia,R.drawable.sonia,R.string.apellido,R.string.apell)
   data object Señapersonales: DatoPerInfo (R.drawable.sonia, R.drawable.sonia, R.drawable.sonia,R.drawable.sonia,R.string.señapersonales,R.string.señper)
   data object Edad: DatoPerInfo (R.drawable.sonia, R.drawable.sonia, R.drawable.sonia,R.drawable.sonia,R.string.edad,R.string.ed)
   data object Dni: DatoPerInfo (R.drawable.sonia, R.drawable.sonia, R.drawable.sonia,R.drawable.sonia,R.string.dni,R.string.deene)
   data object Fechadenacimiento: DatoPerInfo (R.drawable.sonia, R.drawable.sonia, R.drawable.sonia,R.drawable.sonia,R.string.fechadenacimiento,R.string.fech)
   data object Direccion: DatoPerInfo (R.drawable.sonia, R.drawable.sonia, R.drawable.sonia,R.drawable.sonia,R.string.direccion,R.string.dire)
   data object NumeroCelular: DatoPerInfo (R.drawable.sonia, R.drawable.sonia, R.drawable.sonia,R.drawable.sonia,R.string.numeroCelular,R.string.nu)
   data object Cuil: DatoPerInfo (R.drawable.sonia, R.drawable.sonia, R.drawable.sonia,R.drawable.sonia,R.string.cuil,R.string.cu)



}



