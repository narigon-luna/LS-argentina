package com.curso.lenguasdeseñas.ui.ocio.ocioadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemOcioBinding
import com.curso.lenguasdeseñas.dominio.model.model.ocio.OcioInfo

class OcioViewHolder (view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemOcioBinding.bind(view)

    fun ociorender (ocioInfo: OcioInfo){
        val context = binding.tvTitulo.context
        binding.ivOcio.setImageResource(ocioInfo.imgocio)
        binding.ivViaje.setImageResource(ocioInfo.amgviahes)
        binding.tvTitulo.text = context.getString(ocioInfo.nameocio)
        binding.tvDescripcion.text = context.getString(ocioInfo.descripocio)
        binding.paren.setOnClickListener {

        }
    }
}