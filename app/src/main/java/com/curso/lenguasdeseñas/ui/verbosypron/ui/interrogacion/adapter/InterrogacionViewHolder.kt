package com.curso.lenguasdeseñas.ui.verbosypron.ui.interrogacion.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemInterrogacionBinding
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.interr.InterrogacionInfo

class InterrogacionViewHolder (view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemInterrogacionBinding.bind(view)
    fun render(interrogacionInfo: InterrogacionInfo) {
        val contect = binding.tvTitulo.context
        binding.ivInterro.setImageResource(interrogacionInfo.img)
        binding.ivInterro1.setImageResource(interrogacionInfo.img1)
        binding.tvTitulo.text = contect.getString(interrogacionInfo.name)
        binding.tvDescripcion.text = contect.getString(interrogacionInfo.descrip)
        binding.peren.setOnClickListener {

        }
    }
}