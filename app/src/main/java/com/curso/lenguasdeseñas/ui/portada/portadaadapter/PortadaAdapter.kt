package com.curso.lenguasdeseñas.ui.portada.portadaadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.portadamodel.PortadaInfo

class PortadaAdapter (private var portadaList: List<PortadaInfo> = emptyList(),
                      private val onItemSelecte: (PortadaInfo) -> Unit ):

RecyclerView.Adapter<PortadaViewHolder> () {
    fun updateList(list: List<PortadaInfo>){
        portadaList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PortadaViewHolder {
        return PortadaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_portada, parent,false))
    }

    override fun getItemCount() = portadaList.size

    override fun onBindViewHolder(holder: PortadaViewHolder, position: Int) {
     holder.render(portadaList[position])
    }

}