package com.curso.lenguasdeseñas.ui.estadocivil.estciviladapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemEstadocivilBinding
import com.curso.lenguasdeseñas.dominio.model.model.estadocivilmodel.EstadoCivilInfo

class EstadoCivilViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    private val  binding = ItemEstadocivilBinding.bind(view)

    fun estcivrender(estadoCivilInfo: EstadoCivilInfo){
        val context = binding.tvTitulo.context
        binding.ivEst.setImageResource(estadoCivilInfo.imgestciv)
        binding.ivCiv.setImageResource(estadoCivilInfo.img2estci)
        binding.tvTitulo.text = context.getString(estadoCivilInfo.nameestci)
        binding.tvDescripcion.text = context.getString(estadoCivilInfo.descripestci)
        binding.peren.setOnClickListener {

        }
    }

}