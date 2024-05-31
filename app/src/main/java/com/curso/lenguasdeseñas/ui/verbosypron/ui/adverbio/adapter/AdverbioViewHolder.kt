package com.curso.lenguasdeseñas.ui.verbosypron.ui.adverbio.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemAdverbioBinding
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.adv.AdverbioInfo

class AdverbioViewHolder (view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemAdverbioBinding.bind(view)
    fun render(adverbioInfo: AdverbioInfo) {
        val context = binding.tvTitulo.context
        binding.ivAdverbio.setImageResource(adverbioInfo.img)
        binding.ivAdverbio1.setImageResource(adverbioInfo.img1)
        binding.tvTitulo.text = context.getString(adverbioInfo.name)
        binding.tvDescripcion.text = context.getString(adverbioInfo.descrip)
        binding.peren.setOnClickListener {


        }

    }
}