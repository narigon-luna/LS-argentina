package com.curso.lenguasdeseñas.ui.detailcolores.coloresadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.modelcolores.ColoresInfo

class ColorAdapter(private var colorList: List<ColoresInfo> = emptyList(),
                   private val onItemSelecte: (ColoresInfo) -> Unit) :
    RecyclerView.Adapter<ColorViewHolder>() {

    fun updateList(list:List<ColoresInfo>){
        colorList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
        return ColorViewHolder (LayoutInflater.from(parent.context).inflate(R.layout.item_colores, parent, false))
    }

    override fun getItemCount() = colorList.size

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
       holder.colorrender(colorList[position])
    }

}