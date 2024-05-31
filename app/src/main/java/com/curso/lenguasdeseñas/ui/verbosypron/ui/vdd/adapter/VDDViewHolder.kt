package com.curso.lenguasdeseñas.ui.verbosypron.ui.vdd.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemVddBinding
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.vdd.VerboDedespInfo

class VDDViewHolder (view: View): RecyclerView.ViewHolder(view)  {
    private val binding = ItemVddBinding.bind(view)
    fun render(verboDedespInfo: VerboDedespInfo) {
        val contex = binding.tvTitulo.context
        binding.ivVd.setImageResource(verboDedespInfo.img)
        binding.ivVdd.setImageResource(verboDedespInfo.img1)
        binding.tvTitulo.text = contex.getString(verboDedespInfo.name)
        binding.tvDescripcion.text = contex.getString(verboDedespInfo.descrip)
        binding.peren.setOnClickListener {

        }
    }
}