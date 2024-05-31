package com.curso.lenguasdeseñas.ui.detaildias.diasadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.modelcp.CpInfo
import com.curso.lenguasdeseñas.dominio.model.model.modeldias.DiasInfo
import com.curso.lenguasdeseñas.ui.detail.cpadapter.CpViewHolder

class Diasadapter (private var diasList: List<DiasInfo> = emptyList(),
                   private val onItemSelecte: (DiasInfo) -> Unit):
    RecyclerView.Adapter<DiasViewHolder>() {

    fun updateList(list:List<DiasInfo>){
        diasList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiasViewHolder {
              return DiasViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_dias, parent, false))
    }

    override fun getItemCount() = diasList.size

    override fun onBindViewHolder(holder: DiasViewHolder, position: Int) {
        holder.diasrender(diasList[position])
    }
}