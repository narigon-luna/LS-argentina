package com.curso.lenguasdeseñas.ui.mundo.mundoadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.mundomodel.MundoModel

class MundoAdapter(private var mundoList: List<MundoModel>):
    RecyclerView.Adapter<MundoViewHolder>()  {

    fun updateMundo(mundoList: List<MundoModel>){
        this.mundoList = mundoList
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MundoViewHolder {
    return MundoViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_mundo, parent, false)
    )
    }

    override fun getItemCount() = mundoList.size

    override fun onBindViewHolder(holder: MundoViewHolder, position: Int) {
        holder.mundorender(mundoList[position])
    }
}