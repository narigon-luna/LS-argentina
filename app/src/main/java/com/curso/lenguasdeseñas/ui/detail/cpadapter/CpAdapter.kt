package com.curso.lenguasdeseñas.ui.detail.cpadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.modelcp.CpInfo

class CpAdapter(private var cpList: List<CpInfo> = emptyList(),
                private val onItemSelecte: (CpInfo) -> Unit):
RecyclerView.Adapter<CpViewHolder>(){

    fun updateList(list:List<CpInfo>){
        cpList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CpViewHolder {
      return CpViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_cp, parent, false))
    }

    override fun getItemCount() = cpList.size

    override fun onBindViewHolder(holder: CpViewHolder, position: Int) {
       holder.cprender(cpList[position])
    }


}