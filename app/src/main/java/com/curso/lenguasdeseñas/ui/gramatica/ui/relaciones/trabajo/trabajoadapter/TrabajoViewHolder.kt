package com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.trabajo.trabajoadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemTrabajoBinding
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.trabajo.TrabajoInfo

class TrabajoViewHolder  (view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemTrabajoBinding.bind(view)

    fun sentirender(trabajoInfo: TrabajoInfo){
        val context = binding.tvTitulo.context
        binding.ivTrabajo.setImageResource(trabajoInfo.img)
        binding.ivEmpleo.setImageResource(trabajoInfo.img1)
        binding.tvTitulo.text = context.getString(trabajoInfo.name)
        binding.tvDescripcion.text = context.getText(trabajoInfo.descripcion)
        binding.parent.setOnClickListener {

        }

    }
}