package com.curso.lenguasdeseñas.ui.verbosypron.ui.pp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.pp.ProPerInfo

class ProPerAdapter(private var pplist: List<ProPerInfo> = emptyList(),
                     private val onItemSelecto: (ProPerInfo) -> Unit):
    RecyclerView.Adapter<PrpPerViewHolder>() {
        fun updatelist(list: List<ProPerInfo>){
            pplist = list
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrpPerViewHolder {
    return PrpPerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_pp, parent, false))
    }

    override fun getItemCount() = pplist.size

    override fun onBindViewHolder(holder: PrpPerViewHolder, position: Int) {
      holder.render(pplist[position])
    }
}