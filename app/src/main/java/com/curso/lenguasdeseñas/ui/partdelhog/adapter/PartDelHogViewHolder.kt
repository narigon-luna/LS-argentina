package com.curso.lenguasdeseñas.ui.partdelhog.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemPartdelhogarBinding
import com.curso.lenguasdeseñas.dominio.model.model.pertdelhog.ParteDelHogInfo

class PartDelHogViewHolder (view: View): RecyclerView.ViewHolder(view)  {
    private val binding = ItemPartdelhogarBinding.bind(view)
    fun render(partdelHogaInfo: ParteDelHogInfo){
        val context = binding.tvTitulo.context
        binding.ivPart.setImageResource(partdelHogaInfo.img)
        binding.ivHogar.setImageResource(partdelHogaInfo.img1)
        binding.tvTitulo.text = context.getString(partdelHogaInfo.name)
        binding.tvDescripcion.text = context.getString(partdelHogaInfo.descrip)
        binding.peren.setOnClickListener {

        }
    }
}