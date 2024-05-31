package com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.trabajo.trabajoadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.sentimientos.SentimientosInfo
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.trabajo.TrabajoInfo
import com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.sentimientos.sentimientosadapter.SentimientosViewHolder

class TrabajoAdapter (private var trabajoList: List<TrabajoInfo> = emptyList(),
                      private val onItemSelecte: (TrabajoInfo) -> Unit):
    RecyclerView.Adapter<TrabajoViewHolder>()     {


    fun updateList(list:List<TrabajoInfo>){
        trabajoList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrabajoViewHolder {
   return TrabajoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_trabajo, parent, false))
    }

    override fun getItemCount() = trabajoList.size

    override fun onBindViewHolder(holder: TrabajoViewHolder, position: Int) {
      holder.sentirender(trabajoList[position])
    }
}