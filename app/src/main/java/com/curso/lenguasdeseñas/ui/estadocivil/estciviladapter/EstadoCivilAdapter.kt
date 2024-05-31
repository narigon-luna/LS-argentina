package com.curso.lenguasdeseñas.ui.estadocivil.estciviladapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerInfo
import com.curso.lenguasdeseñas.dominio.model.model.estadocivilmodel.EstadoCivilInfo
import com.curso.lenguasdeseñas.ui.carper.carperadapter.CarPerViewHolder

class EstadoCivilAdapter (private var estCivList: List<EstadoCivilInfo> = emptyList(),
                          private val onItemSelecte: (EstadoCivilInfo) -> Unit):
  RecyclerView.Adapter<EstadoCivilViewHolder>() {
      fun updateList(list:List<EstadoCivilInfo>){
         estCivList = list
         notifyDataSetChanged()
     }


     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EstadoCivilViewHolder {
         return EstadoCivilViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_estadocivil, parent, false))
     }

     override fun getItemCount() = estCivList.size


     override fun onBindViewHolder(holder: EstadoCivilViewHolder, position: Int) {
         holder.estcivrender(estCivList[position])
     }


 }