package com.curso.lenguasdeseñas.dominio.model.model.ropayacc

import com.curso.lenguasdeseas.R

sealed class RopayAccInfo(val img:Int,val img1:Int,val name:Int,val descrip:Int)  {
    data object Ropa : RopayAccInfo(R.drawable.len_4, R.drawable.len_4,R.string.ropa, R.string.rop)
    data object Remera : RopayAccInfo(R.drawable.len_4, R.drawable.len_4,R.string.remera, R.string.reme)
    data object Vestido : RopayAccInfo(R.drawable.len_4, R.drawable.len_4,R.string.vestido, R.string.vestid)
    data object Blusa : RopayAccInfo(R.drawable.len_4, R.drawable.len_4,R.string.blusa, R.string.bls)
    data object Pijama : RopayAccInfo(R.drawable.len_4, R.drawable.len_4,R.string.pijama, R.string.pija)
    data object Camisa : RopayAccInfo(R.drawable.len_4, R.drawable.len_4,R.string.camisa, R.string.camis)
    data object Pantalon : RopayAccInfo(R.drawable.len_4, R.drawable.len_4,R.string.pantalon, R.string.pantal)
    data object Pollera : RopayAccInfo(R.drawable.len_4, R.drawable.len_4,R.string.pollera, R.string.polle)
    data object Jeans : RopayAccInfo  (R.drawable.len_4, R.drawable.len_4,R.string.jeans, R.string.jens)
    data object Campera : RopayAccInfo(R.drawable.len_4, R.drawable.len_4,R.string.campera, R.string.campe)
    data object Saco : RopayAccInfo   (R.drawable.len_4, R.drawable.len_4,R.string.saco, R.string.sac)
    data object Tapado : RopayAccInfo (R.drawable.len_4, R.drawable.len_4,R.string.tapado, R.string.tapa)
    data object Buzo : RopayAccInfo   (R.drawable.len_4, R.drawable.len_4,R.string.buzo, R.string.buz)
    data object Guardapolvo : RopayAccInfo        (R.drawable.len_4, R.drawable.len_4,R.string.guardapolvo, R.string.guardapol)
    data object Ropainteriordemujer : RopayAccInfo(R.drawable.len_4, R.drawable.len_4,R.string.ropaintmuj, R.string.ropint)
    data object Zapatos : RopayAccInfo   (R.drawable.len_4, R.drawable.len_4,R.string.zapatos, R.string.zapat)
    data object Zapatillas : RopayAccInfo(R.drawable.len_4, R.drawable.len_4,R.string.zapatilla, R.string.zapatill)
    data object Ojotas : RopayAccInfo    (R.drawable.len_4, R.drawable.len_4,R.string.ojota, R.string.ojot)
    data object Pantunflas : RopayAccInfo(R.drawable.len_4, R.drawable.len_4,R.string.pantunflas, R.string.pantunf)
    data object Cinto : RopayAccInfo     (R.drawable.len_4, R.drawable.len_4,R.string.cinto, R.string.cin)
    data object Pañuelo : RopayAccInfo   (R.drawable.len_4, R.drawable.len_4,R.string.pañuela, R.string.pañ)
    data object Gorro : RopayAccInfo     (R.drawable.len_4, R.drawable.len_4,R.string.gorro, R.string.gorr)
    data object Bufanda : RopayAccInfo   (R.drawable.len_4, R.drawable.len_4,R.string.bufanda, R.string.bufan)
    data object Cartera : RopayAccInfo   (R.drawable.len_4, R.drawable.len_4,R.string.cartera, R.string.carter)
    data object Reloj : RopayAccInfo     (R.drawable.len_4, R.drawable.len_4,R.string.relol, R.string.relo)
    data object Pulsera : RopayAccInfo   (R.drawable.len_4, R.drawable.len_4,R.string.pulsera, R.string.pulsr)
    data object Aros : RopayAccInfo      (R.drawable.len_4, R.drawable.len_4,R.string.aros, R.string.aro)
    data object Anteojos : RopayAccInfo  (R.drawable.len_4, R.drawable.len_4,R.string.anteojo, R.string.antio)
    data object Cadena : RopayAccInfo    (R.drawable.len_4, R.drawable.len_4,R.string.cadena, R.string.cade)
    data object Anillo : RopayAccInfo    (R.drawable.len_4, R.drawable.len_4,R.string.anillo, R.string.anill)

}