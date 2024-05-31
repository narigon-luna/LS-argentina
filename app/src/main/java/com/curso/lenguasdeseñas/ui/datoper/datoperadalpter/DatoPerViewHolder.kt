package com.curso.lenguasdeseñas.ui.datoper.datoperadalpter

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemDatosperBinding
import com.curso.lenguasdeseñas.dominio.model.model.datospermodel.DatoPerInfo

class DatoPerViewHolder  (view: View) : RecyclerView.ViewHolder(view) {

    private val  binding = ItemDatosperBinding.bind(view)
    fun datoperrender(datoPerInfo: DatoPerInfo){
        val context = binding.tvTitulo.context
        binding.ivDat.setImageResource(datoPerInfo.photo)
        binding.ivDat1.setImageResource(datoPerInfo.photo1)
        binding.ivPer.setImageResource(datoPerInfo.photo2)
        binding.ivPer1.setImageResource(datoPerInfo.photo3)
        binding.tvTitulo.text = context.getString(datoPerInfo.namedatoper)
        binding.tvDescripcion.text = context.getString(datoPerInfo.descripdatoper)
        binding.peren.setOnClickListener {

        }
    }
}