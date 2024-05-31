package com.curso.lenguasdeseñas.dominio.model.model.estycli

import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.modeldias.DiasInfo

sealed class EstyClimInfo(val foto: Int,val  photo: Int,val imgest: String, val nameest: Int, val descripest: Int) {
    data object Primavera: EstyClimInfo(R.drawable.len_4, R.drawable.len_4,"<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BB7Ds0KH78A?si=CGIywTk4gly2p9Jp\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>", R.string.primavera, R.string.pri)
    data object Verano: EstyClimInfo(R.drawable.len_4, R.drawable.len_4,"<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BB7Ds0KH78A?si=CGIywTk4gly2p9Jp\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>", R.string.verano, R.string.ve)
    data object Otoño: EstyClimInfo(R.drawable.len_4, R.drawable.len_4,"<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BB7Ds0KH78A?si=CGIywTk4gly2p9Jp\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>", R.string.otoño, R.string.o)
    /**data object Invierno: EstyClimInfo(R.raw.ic_senia, R.string.invierno, R.string.i)
    data object Sol: EstyClimInfo(R.raw.ic_senia, R.string.sol, R.string.s)
    data object Nublado : EstyClimInfo(R.raw.ic_senia, R.string.nublado, R.string.nu)
    data object Llovizna: EstyClimInfo(R.raw.ic_senia, R.string.llovizna, R.string.llo)
    data object Rayos: EstyClimInfo(R.raw.ic_senia, R.string.rayos, R.string.ra)
    data object Relampago: EstyClimInfo(R.raw.ic_senia, R.string.relampago, R.string.re)
    data object Granizo: EstyClimInfo(R.raw.ic_senia, R.string.granizo, R.string.gra)
    data object Nieve : EstyClimInfo(R.raw.ic_senia, R.string.nieve, R.string.ni)
    data object Mojado : EstyClimInfo(R.raw.ic_senia, R.string.mojado, R.string.mo)
    data object Seco : EstyClimInfo(R.raw.ic_senia, R.string.seco, R.string.se)
    data object Frio: EstyClimInfo(R.raw.ic_senia, R.string.frio, R.string.fri)
    data object Calor: EstyClimInfo(R.raw.ic_senia, R.string.calor, R.string.ca)*/

}