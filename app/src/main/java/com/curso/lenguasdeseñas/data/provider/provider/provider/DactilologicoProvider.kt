package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseñas.dominio.model.model.dactilomodel.DactilologicoInfo
import com.curso.lenguasdeseñas.dominio.model.model.dactilomodel.DactilologicoInfo.*
import javax.inject.Inject

class DactilologicoProvider @Inject constructor() {
    fun getDactilo(): List<DactilologicoInfo> {
        return listOf(
            A,
            B,
            C,
            D,
            E,
            F,
            G,
            H,
            I,
            J,
            K,
            L,
            LL,
            M,
            N,
            Ñ,
            O,
            P,
            Q,
            R,
            RR,
            S,
            T,
            U,
            V,
            W,
            X,
            Y,
            Z
        )
    }
}