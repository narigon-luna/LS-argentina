package com.curso.lenguasdeseñas.dominio.model.model.car.permodel

import com.curso.lenguasdeseas.R


sealed class CarPerInfo (val imgcarper: Int, val ims1carper:Int, val namecarper: Int, val descripcarper: Int){
    data object Sordo: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.sordo, R.string.sor)
    data object Hipoacusico: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.hipoacusico, R.string.hipo)
    data object Oyente: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.oyente, R.string.oy)
    data object Alto: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.alto, R.string.alt)
    data object Bajo: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.bajo, R.string.baj)
    data object Gordo: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.gordo, R.string.gor)
    data object Flaco: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.flaco, R.string.fla)
    data object TezMorocha: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.tezMorocha, R.string.tezmo)
    data object  TezBlanca: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.tezBlanca, R.string.tezbla)
    data object Hombre: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.hombre, R.string.ho)
    data object  Mujer: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.mujer, R.string.mu)
    data object  Bebe: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.bebe, R.string.be)
    data object   Niño: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.niño,R.string.ni)
    data object  Joven: CarPerInfo(R.drawable.sonia, R.drawable.sonia, R.string.joven,R.string.jov)
    data object Adulto: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.adulto,R.string.ad)
    data object  Rubio: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.rubio,R.string.rubi)
    data object  Castaño: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.castaño,R.string.ca)
    data object Pelirrojo: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.pelirrojo, R.string.peli)
    data object Canoso: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.trabajo, R.string.per)
    data object Teñido: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.teñido, R.string.teñ)
    data object Natural: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.natural, R.string.nat)
    data object Lacio: CarPerInfo(R.drawable.sonia, R.drawable.sonia, R.string.lacio, R.string.laci)
    data object Rizado: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.rizado, R.string.riza)
    data object PeloCorto: CarPerInfo(R.drawable.sonia, R.drawable.sonia, R.string.peloCorto, R.string.pelco)
    data object PeloLargo: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.peloLargo, R.string.pellar)
    data object  Calvo: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.calvo, R.string.calv)
    data object Barba: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.barba, R.string.bar)
    data object  Caracter: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.caracter, R.string.carac)
    data object  Serio: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.serio, R.string.ser)
    data object Hermoso: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.hermoso, R.string.her)
    data object Lindo: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.lindo, R.string.lin)
    data object Feo: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.feo, R.string.fe)
    data object Bueno: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.bueno, R.string.bun)
    data object  Simpatico: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.simpatico, R.string.sim)
    data object  Malo: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.malo, R.string.maled)
    data object MalEducado: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.maleducado, R.string.maled)
    data object Antipatico: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.antipatico, R.string.antip)
    data object Divertido: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.divertido, R.string.diver)
    data object  Timido: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.timido, R.string.timi)
    data object  Alegre: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.alegre, R.string.ale)
    data object Cariñoso : CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.cariñoso, R.string.cariñ)
    data object Envidioso: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.envidioso, R.string.envid)
    data object  Chusma: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.chusma, R.string.chus)
    data object Celoso: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.celoso, R.string.celo)
    data object Educado: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.educado, R.string.educ)
    data object Ignorante: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.ignorante, R.string.igno)
    data object Inteligente: CarPerInfo(R.drawable.sonia, R.drawable.sonia,R.string.inteligente, R.string.intel)
}






