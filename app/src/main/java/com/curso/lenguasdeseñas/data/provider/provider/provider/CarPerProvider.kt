package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerInfo
import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerInfo.*

import javax.inject.Inject

class CarPerProvider  @Inject constructor() {
    fun getCarPer(): List<CarPerInfo> {
          return listOf(
              Adulto,
              Alegre,
              Alto,
              Antipatico,
              Bajo,
              Barba,
              Bebe,
              Bueno,
              Canoso,
              Calvo,
              Caracter,
              Castaño,
              Celoso,
              Cariñoso,
              Chusma,
              Divertido,
              Educado,
              Envidioso,
              Feo,
              Flaco,
              Gordo,
              Hermoso,
              Hipoacusico,
              Hombre,
              Ignorante,
              Inteligente,
              Joven,
              Lacio,
              Lindo,
              Malo,
              Mujer,
              Natural,
              Niño,
              Niño,
              Oyente,
              Pelirrojo,
              PeloCorto,
              PeloLargo,
              Rizado,
              Rubio,
              Serio,
              Simpatico,
              Sordo,
              TezBlanca,
              Teñido,
              Timido,
              TezMorocha
              )
    }
}