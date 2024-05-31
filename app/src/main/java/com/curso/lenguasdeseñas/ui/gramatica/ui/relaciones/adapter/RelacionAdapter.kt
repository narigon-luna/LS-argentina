package com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.familia.FamiliaInfo
import com.curso.lenguasdeseñas.ui.familia.familiaadapter.FamiliaViewHolder
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.RelacionesInfo

class RelacionAdapter  (private var relacionList: List<RelacionesInfo> = emptyList(),
                        private val onItemSelecte: (RelacionesInfo) -> Unit):
    RecyclerView.Adapter<RelacionViewHolder>() {

    fun updateList(list:List<RelacionesInfo>){
        relacionList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RelacionViewHolder {
      return RelacionViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_relacion, parent,false))
    }

    override fun getItemCount() = relacionList.size

    override fun onBindViewHolder(holder: RelacionViewHolder, position: Int) {
        holder.relacionrender(relacionList[position])
    }
}