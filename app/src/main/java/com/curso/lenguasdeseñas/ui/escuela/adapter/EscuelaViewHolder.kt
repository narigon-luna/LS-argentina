package com.curso.lenguasdeseñas.ui.escuela.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemEscuelaBinding
import com.curso.lenguasdeseñas.dominio.model.model.escuelamodel.EscuelaInfo

class EscuelaViewHolder (view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemEscuelaBinding.bind(view)
     fun render(escuelaInfo: EscuelaInfo){
         val context = binding.tvTitulo.context
         binding.ivEscuela.setImageResource(escuelaInfo.img)
         binding.ivEducacion.setImageResource(escuelaInfo.img1)
         binding.tvTitulo.text = context.getString(escuelaInfo.name)
         binding.tvDescripcion.text = context.getString(escuelaInfo.descr)
         binding.peren.setOnClickListener {

         }
     }

}