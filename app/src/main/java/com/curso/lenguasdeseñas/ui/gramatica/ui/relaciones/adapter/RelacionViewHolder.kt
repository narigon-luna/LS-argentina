package com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemRelacionBinding
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.RelacionesInfo

class RelacionViewHolder  (view: View): RecyclerView.ViewHolder(view) {

    private val  binding = ItemRelacionBinding.bind(view)
    fun relacionrender(relacionesInfo: RelacionesInfo){
        val contex = binding.tvTitulo.context
        binding.Relacion.setImageResource(relacionesInfo.imgrela)
        binding.ivRelacion1.setImageResource(relacionesInfo.imgrela1)
        binding.tvTitulo.text = contex.getString(relacionesInfo.namerela)
        binding.tvDescripcion.text = contex.getString(relacionesInfo.descrirela)
        binding.paren.setOnClickListener {

        }
    }
}