package com.curso.lenguasdeseñas.dominio.model.model.estadocivilmodel

import com.curso.lenguasdeseas.R

sealed class EstadoCivilInfo (val imgestciv:Int, val img2estci:Int, val nameestci:Int, val descripestci:Int) {
      data object Soltero: EstadoCivilInfo(R.drawable.sonia,R.drawable.sonia,R.string.soltero,R.string.solte)
      data object Casado: EstadoCivilInfo(R.drawable.sonia,R.drawable.sonia,R.string.casado,R.string.casa)
      data object  Concubino: EstadoCivilInfo(R.drawable.sonia,R.drawable.sonia,R.string.concubino,R.string.concu)
      data object Separado: EstadoCivilInfo(R.drawable.sonia,R.drawable.sonia,R.string.separado,R.string.separ)
      data object Divorciado: EstadoCivilInfo(R.drawable.sonia,R.drawable.sonia,R.string.divorciado,R.string.divor)
      data object Viudo: EstadoCivilInfo(R.drawable.sonia,R.drawable.sonia,R.string.viudo,R.string.viu)

}