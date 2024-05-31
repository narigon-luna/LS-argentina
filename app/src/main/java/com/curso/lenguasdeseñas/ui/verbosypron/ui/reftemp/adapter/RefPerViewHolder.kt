package com.curso.lenguasdeseñas.ui.verbosypron.ui.reftemp.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemReftempBinding
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.reftemp.RefTempInfo

class RefPerViewHolder  (view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemReftempBinding.bind(view)
    fun rende(refTempInfo: RefTempInfo){
        val contex = binding.tvTitulo.context
        binding.ivRef.setImageResource(refTempInfo.img)
        binding.ivTemp.setImageResource(refTempInfo.img1)
        binding.tvTitulo.text = contex.getString(refTempInfo.name)
        binding.tvDescripcion.text = contex.getString(refTempInfo.descrip)
        binding.peren.setOnClickListener {

        }
    }
}