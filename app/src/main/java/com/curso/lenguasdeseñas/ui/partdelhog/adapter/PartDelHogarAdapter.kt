package com.curso.lenguasdeseñas.ui.partdelhog.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.pertdelhog.ParteDelHogInfo

class PartDelHogarAdapter ( private var parhogarList: List<ParteDelHogInfo> = (emptyList()),
                            private val onItemSelect: (ParteDelHogInfo)  -> Unit ):
RecyclerView.Adapter<PartDelHogViewHolder> (){
    fun updatelist(list: List<ParteDelHogInfo>) {
        parhogarList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PartDelHogViewHolder {
        return PartDelHogViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_partdelhogar, parent, false))
    }

    override fun getItemCount() = parhogarList.size

    override fun onBindViewHolder(holder: PartDelHogViewHolder, position: Int) {
        holder.render(parhogarList[position])
    }
}