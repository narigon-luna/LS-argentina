package com.curso.lenguasdeseñas.dominio.model.model.dactilomodel

import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.R.*


sealed class DactilologicoInfo(val imgdacti:Int, val namedacti: Int) {
     data object A: DactilologicoInfo(drawable.detail_mujer, string.a)
     data object B: DactilologicoInfo(drawable.detail_mujer, string.b)
     data object C: DactilologicoInfo(drawable.detail_mujer, string.c)
     data object D: DactilologicoInfo(drawable.detail_mujer, string.d)
     data object E: DactilologicoInfo(drawable.detail_mujer, string.e)
     data object F: DactilologicoInfo(drawable.detail_mujer, string.f)
     data object G: DactilologicoInfo(drawable.detail_mujer, string.g)
     data object H: DactilologicoInfo(drawable.detail_mujer, string.h)
     data object I: DactilologicoInfo(drawable.detail_mujer, string.ii)
     data object J: DactilologicoInfo(drawable.detail_mujer, string.jota)
     data object K: DactilologicoInfo(drawable.detail_mujer, string.k)
     data object L: DactilologicoInfo(drawable.detail_mujer, string.ele)
     data object LL: DactilologicoInfo(drawable.detail_mujer, string.ll)
     data object M: DactilologicoInfo(drawable.detail_mujer, string.m)
     data object N: DactilologicoInfo(drawable.detail_mujer, string.n)
     data object Ñ: DactilologicoInfo(drawable.detail_mujer, string.ñ)
     data object O: DactilologicoInfo(drawable.detail_mujer, string.oo)
     data object P: DactilologicoInfo(drawable.detail_mujer, string.p)
     data object Q: DactilologicoInfo( drawable.detail_mujer, string.q)
     data object R: DactilologicoInfo( drawable.detail_mujer, string.r)
     data object RR: DactilologicoInfo(drawable.detail_mujer, string.rr)
     data object S: DactilologicoInfo(drawable.detail_mujer, string.ese)
     data object T: DactilologicoInfo(drawable.detail_mujer, string.te)
     data object U: DactilologicoInfo(drawable.detail_mujer, string.u)
     data object V: DactilologicoInfo(drawable.detail_mujer, string.vee)
     data object W: DactilologicoInfo(drawable.detail_mujer, string.wv)
     data object X: DactilologicoInfo(drawable.detail_mujer, string.x)
     data object Y: DactilologicoInfo(drawable.detail_mujer, string.y)
     data object Z: DactilologicoInfo(drawable.detail_mujer, string.z)

}
