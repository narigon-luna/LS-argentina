package com.curso.lenguasdeseñas.ui.verbosypron.ui.pp.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemPpBinding
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.pp.ProPerInfo

class PrpPerViewHolder (view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemPpBinding.bind(view)
    fun render(proPerInfo: ProPerInfo){
        val contexto= binding.tvTitulo.context
        binding.ivPro.setImageResource(proPerInfo.img)
        binding.ivPerso.setImageResource(proPerInfo.img1)
        binding.tvTitulo.text = contexto.getString(proPerInfo.name)
        binding.tvDescripcion.text = contexto.getString(proPerInfo.descrip)
        binding.paren.setOnClickListener {

        }
    }
}