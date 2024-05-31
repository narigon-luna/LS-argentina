package com.curso.lenguasdeseñas.ui.verbosypron.ui.vdd.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.reftemp.RefTempInfo
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.vdd.VerboDedespInfo

class VDDAdapter (private var vddList: List<VerboDedespInfo> = emptyList(),
                   private val onItemSelected: (VerboDedespInfo) -> Unit):
    RecyclerView.Adapter<VDDViewHolder>() {

        fun updatelist(list: List<VerboDedespInfo>){
            vddList = list
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VDDViewHolder {
       return VDDViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_vdd, parent, false))
    }

    override fun getItemCount() = vddList.size

    override fun onBindViewHolder(holder: VDDViewHolder, position: Int) {
        holder.render(vddList[position])
    }
}