package com.curso.lenguasdeseñas.ui.fcortesia.fcortesiaadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.fcortesia.FcortesiaInfo


class FcortesiaAdapter (private var fCortesiaList: List<FcortesiaInfo> = emptyList(),
                        private val onItemSelecte: (FcortesiaInfo) -> Unit):
    RecyclerView.Adapter<FcortesiaViewHolder>()  {
    fun updateList(list:List<FcortesiaInfo>){
        fCortesiaList = list
        notifyDataSetChanged()
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FcortesiaViewHolder {
       return FcortesiaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_fcortesia, parent,false))
    }

       override fun getItemCount() = fCortesiaList.size

       override fun onBindViewHolder(holder: FcortesiaViewHolder, position: Int) {
        holder.fcortrender(fCortesiaList[position])
    }

}