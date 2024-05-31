package com.curso.lenguasdeseñas.ui.detaildactilologico.dactilologicoadapter.dactiadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemDactilologicoBinding
import com.curso.lenguasdeseñas.dominio.model.model.dactilomodel.DactilologicoInfo

class DactiViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val binding = ItemDactilologicoBinding.bind(view)

            fun dactilologicorender(dactilologicoInfo: DactilologicoInfo) {
                val context = binding.ivDacti.context
                binding.ivDacti.setImageResource(dactilologicoInfo.imgdacti)
                binding.tvTitular.text = context.getString(dactilologicoInfo.namedacti)

                binding.parent.setOnClickListener {

                }
            }

}