package com.curso.lenguasdeseñas.ui.detailtecnoyredes.tecnoyredesadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemTecnoyredesBinding
import com.curso.lenguasdeseñas.dominio.model.model.tecnoyredes.TecnotRedesInfo

class TecnoyRedesViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemTecnoyredesBinding.bind(view)
    fun tecnoyredesrender(tecnotRedesInfo: TecnotRedesInfo){
        val context = binding.tvTitulo.context
        binding.ivTecno.setImageResource(tecnotRedesInfo.imgtr)
        binding.ivRedes.setImageResource(tecnotRedesInfo.img2tr)
        binding.tvTitulo.text = context.getString(tecnotRedesInfo.nametr)
        binding.tvDescripcion.text = context.getString(tecnotRedesInfo.descricciontr)
        binding.peren.setOnClickListener {
        }
    }
}