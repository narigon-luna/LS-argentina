package com.curso.lenguasdeseñas.ui.ropayacc.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemRopyaccBinding
import com.curso.lenguasdeseñas.dominio.model.model.ropayacc.RopayAccInfo

class RopáyAccViewHolder (view: View) : RecyclerView.ViewHolder(view)  {
    private val binding = ItemRopyaccBinding.bind(view)
    fun render(ropayAccInfo: RopayAccInfo){
        val context = binding.tvTitulo.context
        binding.ivRopa.setImageResource(ropayAccInfo.img)
        binding.ivAcc.setImageResource(ropayAccInfo.img1)
        binding.tvTitulo.text = context.getString(ropayAccInfo.name)
        binding.tvDescripcion.text = context.getString(ropayAccInfo.descrip)
        binding.peren.setOnClickListener {

        }
    }
}