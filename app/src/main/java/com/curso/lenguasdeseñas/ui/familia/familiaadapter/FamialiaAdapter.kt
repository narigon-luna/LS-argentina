package com.curso.lenguasdeseñas.ui.familia.familiaadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerInfo
import com.curso.lenguasdeseñas.dominio.model.model.familia.FamiliaInfo


class FamialiaAdapter  (private var familiaList: List<FamiliaInfo> = emptyList(),
                        private val onItemSelecte: (FamiliaInfo) -> Unit):
    RecyclerView.Adapter<FamiliaViewHolder>()  {
    fun updateList(list:List<FamiliaInfo>){
        familiaList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FamiliaViewHolder {
        return FamiliaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_famila, parent, false))
    }

    override fun getItemCount() = familiaList.size

    override fun onBindViewHolder(holder: FamiliaViewHolder, position: Int) {
       holder.falmiliarender(familiaList[position])
    }

}