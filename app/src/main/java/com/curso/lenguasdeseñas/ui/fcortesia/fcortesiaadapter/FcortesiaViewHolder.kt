package com.curso.lenguasdeseñas.ui.fcortesia.fcortesiaadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemFcortesiaBinding
import com.curso.lenguasdeseñas.dominio.model.model.fcortesia.FcortesiaInfo

class FcortesiaViewHolder (view: View): RecyclerView.ViewHolder(view) {
     private val binding = ItemFcortesiaBinding.bind(view)

    fun fcortrender(fcortesiaInfo: FcortesiaInfo) {
        val context = binding.tvTitulo.context

        binding.ivForm.setImageResource(fcortesiaInfo.imgfc)
        binding.ivCort.setImageResource(fcortesiaInfo.imfc1)
        binding.tvTitulo.text = context.getString(fcortesiaInfo.namefc)
        binding.tvDescripcion.text = context.getString(fcortesiaInfo.descrfc)
        binding.peren.setOnClickListener {

        }

    }
}