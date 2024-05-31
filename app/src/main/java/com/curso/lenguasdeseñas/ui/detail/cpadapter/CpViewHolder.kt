package com.curso.lenguasdeseñas.ui.detail.cpadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemCpBinding
import com.curso.lenguasdeseñas.dominio.model.model.modelcp.CpInfo

class CpViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val binding = ItemCpBinding.bind(view)
    fun cprender(cpInfo: CpInfo){
        val context = binding.tvTitulo.context
        binding.ivCp.setImageResource(cpInfo.imgcp)
        binding.tvTitulo.text = context.getString(cpInfo.namecp)
        binding.perent.setOnClickListener {
        }
    }

}