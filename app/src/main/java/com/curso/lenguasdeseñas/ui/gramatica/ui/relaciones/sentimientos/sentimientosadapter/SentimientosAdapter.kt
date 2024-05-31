package com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.sentimientos.sentimientosadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R

import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.sentimientos.SentimientosInfo


class SentimientosAdapter (private var sentimientoList: List<SentimientosInfo> = emptyList(),
                            private val onItemSelecte: (SentimientosInfo) -> Unit):
    RecyclerView.Adapter<SentimientosViewHolder>() {

    fun updateList(list:List<SentimientosInfo>){
        sentimientoList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SentimientosViewHolder {
     return SentimientosViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_sentimientos, parent, false))
    }

    override fun getItemCount() = sentimientoList.size
    override fun onBindViewHolder(holder: SentimientosViewHolder, position: Int) {
        holder.sentimientosrender(sentimientoList[position])
    }
}