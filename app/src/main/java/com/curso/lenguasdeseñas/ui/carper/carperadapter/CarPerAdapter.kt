package com.curso.lenguasdeseñas.ui.carper.carperadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerInfo
import com.curso.lenguasdeseñas.dominio.model.model.tecnoyredes.TecnotRedesInfo
import com.curso.lenguasdeseñas.ui.detailtecnoyredes.tecnoyredesadapter.TecnoyRedesViewHolder

class CarPerAdapter (private var carPerList: List<CarPerInfo> = emptyList(),
                     private val onItemSelecte: (CarPerInfo) -> Unit):
    RecyclerView.Adapter<CarPerViewHolder>()  {

    fun updateList(list:List<CarPerInfo>){
       carPerList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarPerViewHolder {
        return CarPerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_carper, parent, false))
    }

    override fun getItemCount() = carPerList.size

    override fun onBindViewHolder(holder: CarPerViewHolder, position: Int) {
      holder.carperrender(carPerList[position])
    }

}