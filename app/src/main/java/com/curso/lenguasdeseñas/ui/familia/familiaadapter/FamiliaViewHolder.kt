package com.curso.lenguasdeseñas.ui.familia.familiaadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemFamilaBinding
import com.curso.lenguasdeseñas.dominio.model.model.familia.FamiliaInfo

class FamiliaViewHolder (view: View): RecyclerView.ViewHolder(view) {

    private val  binding = ItemFamilaBinding.bind(view)

    fun falmiliarender(familiaInfo: FamiliaInfo) {
        val context = binding.tvTitulo.context
        binding.ivFamilia.setImageResource(familiaInfo.imgfami)
        binding.ivFamili.setImageResource(familiaInfo.img1fami)
        binding.tvTitulo.text = context.getString(familiaInfo.namefami)
        binding.tvDescripcion.text = context.getString(familiaInfo.descrpfami)
        binding.peren.setOnClickListener {

        }
    }
}