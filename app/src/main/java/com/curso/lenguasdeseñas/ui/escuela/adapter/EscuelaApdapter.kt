package com.curso.lenguasdeseñas.ui.escuela.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.escuelamodel.EscuelaInfo

class EscuelaApdapter (private var escuelaList: List<EscuelaInfo> = emptyList(),
                       private val onItemselect: (EscuelaInfo) -> Unit):
RecyclerView.Adapter<EscuelaViewHolder> (){
    fun nuevalis(list: List<EscuelaInfo>){
        escuelaList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EscuelaViewHolder {
        return EscuelaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_escuela,parent ,false))
    }

    override fun getItemCount() = escuelaList.size

    override fun onBindViewHolder(holder: EscuelaViewHolder, position: Int) {
     holder.render(escuelaList[position])
    }
}