package com.curso.lenguasdeseñas.ui.detailestyclim.estyclimadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.estycli.EstyClimInfo


class EstyClimAdapter (private var estyclimList: List<EstyClimInfo> = emptyList(),
                       private val onItemSelecte: (EstyClimInfo) -> Unit):
    RecyclerView.Adapter<EstayClimViewHolder>() {

    fun updateList(list:List<EstyClimInfo>){
       estyclimList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EstayClimViewHolder {
        return EstayClimViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_estayclim, parent, false))
    }

    override fun getItemCount() = estyclimList.size

    override fun onBindViewHolder(holder: EstayClimViewHolder, position: Int) {
        holder.estayclimrender(estyclimList[position])
    }
}