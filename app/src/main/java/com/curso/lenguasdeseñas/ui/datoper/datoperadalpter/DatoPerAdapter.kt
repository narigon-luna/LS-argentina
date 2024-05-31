package com.curso.lenguasdeseñas.ui.datoper.datoperadalpter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerInfo
import com.curso.lenguasdeseñas.dominio.model.model.datospermodel.DatoPerInfo
import com.curso.lenguasdeseñas.ui.carper.carperadapter.CarPerViewHolder

class DatoPerAdapter (private var datoPerList: List<DatoPerInfo> = emptyList(),
                      private val onItemSelecte: (DatoPerInfo) -> Unit):
    RecyclerView.Adapter<DatoPerViewHolder>()  {
    fun updateList(list:List<DatoPerInfo>){
        datoPerList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatoPerViewHolder {
        return DatoPerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_datosper, parent, false))
    }

    override fun getItemCount() = datoPerList.size

    override fun onBindViewHolder(holder: DatoPerViewHolder, position: Int) {
        holder.datoperrender(datoPerList[position])
    }

}