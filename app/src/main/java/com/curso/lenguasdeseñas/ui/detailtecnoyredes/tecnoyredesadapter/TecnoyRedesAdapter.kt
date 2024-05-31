package com.curso.lenguasdeseñas.ui.detailtecnoyredes.tecnoyredesadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.modeldias.DiasInfo
import com.curso.lenguasdeseñas.dominio.model.model.tecnoyredes.TecnotRedesInfo


class TecnoyRedesAdapter (private var tecnoyRedesList: List<TecnotRedesInfo> = emptyList(),
                          private val onItemSelecte: (TecnotRedesInfo) -> Unit):
    RecyclerView.Adapter<TecnoyRedesViewHolder>()  {
    fun updateList(list:List<TecnotRedesInfo>){
        tecnoyRedesList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TecnoyRedesViewHolder {
        return TecnoyRedesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_tecnoyredes, parent, false))
    }

    override fun getItemCount() = tecnoyRedesList.size

    override fun onBindViewHolder(holder: TecnoyRedesViewHolder, position: Int) {
        holder.tecnoyredesrender(tecnoyRedesList[position])
    }
}