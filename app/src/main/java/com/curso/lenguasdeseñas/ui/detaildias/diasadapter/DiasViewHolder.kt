package com.curso.lenguasdeseñas.ui.detaildias.diasadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemDiasBinding
import com.curso.lenguasdeseñas.dominio.model.model.modelcp.CpInfo
import com.curso.lenguasdeseñas.dominio.model.model.modeldias.DiasInfo

class DiasViewHolder (view: View) : RecyclerView.ViewHolder(view){

    private val binding = ItemDiasBinding.bind(view)
    fun diasrender(diasInfo: DiasInfo){
        val context = binding.tvTitulo.context
        binding.ivDias.setImageResource(diasInfo.imgdias)
        binding.tvTitulo.text = context.getString(diasInfo.namedias)
        binding.tvDescripcion.text = context.getString(diasInfo.descripciondias)
        binding.perent.setOnClickListener {
        }
    }
}