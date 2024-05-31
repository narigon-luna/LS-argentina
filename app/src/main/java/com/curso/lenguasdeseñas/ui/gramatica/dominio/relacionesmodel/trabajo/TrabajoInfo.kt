package com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.trabajo

import com.curso.lenguasdeseas.R

sealed class TrabajoInfo(val img:Int,val img1:Int,val name:Int,val descripcion:Int) {
    data object Empresa : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.empresa, R.string.empres)
    data object Fabrica : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.fabrica, R.string.fabric)
    data object Jefe : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.jefe, R.string.jef)
    data object Oficina : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.oficina, R.string.ofici)
    data object NegocioComercio : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.negocioComercio, R.string.negcom)
    data object Bar : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.barr, R.string.ba)
    data object Dueño : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.dueño, R.string.dueñ)
    data object Supervisor : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.supervisor, R.string.superviso)
    data object Tesorero : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.tesorero, R.string.tesorer)
    data object Cordinadora : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.cordinadora, R.string.cooorrrd)
    data object Instructora : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.instructora, R.string.instrct)
    data object Secretarioa : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.secretarioa, R.string.secret)
    data object Empleadoa : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.empleado, R.string.emplead)
    data object Jubiladoa : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.jubiladoa, R.string.jubila)
    data object Profesional : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.profesional, R.string.profff)
    data object Pensionadoa : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.pensionadoa, R.string.pensionad)
    data object Trabajar : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.trabajar, R.string.trabaj)
    data object Buscar : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.buscar, R.string.busca)
    data object Comunicar : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.comunicar, R.string.comunic)
    data object Preparar : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.preparar, R.string.prerar)
    data object Despedie : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.despedir, R.string.despe)
    data object Suspender : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.suspender, R.string.suspen)
    data object Renunciar : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.renunciar, R.string.renun)
    data object Encontrar : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.encontrar, R.string.encuen)
    data object Cobrar : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.cobrar, R.string.cobr)
    data object Sueldo : TrabajoInfo(R.drawable.detail_mujer, R.drawable.detail_mujer, R.string.sueldo, R.string.sueld)

}