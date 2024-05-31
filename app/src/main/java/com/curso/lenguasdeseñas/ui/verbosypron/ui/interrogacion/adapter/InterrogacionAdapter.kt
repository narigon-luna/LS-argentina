package com.curso.lenguasdeseñas.ui.verbosypron.ui.interrogacion.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.interr.InterrogacionInfo

class InterrogacionAdapter (private var interrogacionList: List<InterrogacionInfo> = emptyList(),
                            private val onItemSelect: (InterrogacionInfo) -> Unit):
RecyclerView.Adapter<InterrogacionViewHolder>(){
    fun nuevaList(list: List<InterrogacionInfo>){
        interrogacionList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InterrogacionViewHolder {
       return InterrogacionViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_interrogacion,parent,false))
    }

    override fun getItemCount() = interrogacionList.size

    override fun onBindViewHolder(holder: InterrogacionViewHolder, position: Int) {
        holder.render(interrogacionList[position])
    }
}