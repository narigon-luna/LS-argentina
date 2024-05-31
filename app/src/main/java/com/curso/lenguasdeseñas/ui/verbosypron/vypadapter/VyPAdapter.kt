package com.curso.lenguasdeseñas.ui.verbosypron.vypadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.vypmodel.VyPInfo

class VyPAdapter (private var vyPList: List<VyPInfo> = emptyList(),
                   private val onItemSelecte: (VyPInfo) -> Unit) :
    RecyclerView.Adapter<VyPViewHolder>() {

  fun updateList(list: List<VyPInfo>){
      vyPList = list
      notifyDataSetChanged()
  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VyPViewHolder {
      return VyPViewHolder(
          LayoutInflater.from(parent.context).inflate(R.layout.item_vyp, parent, false)
      )
    }
    override fun getItemCount() = vyPList.size

    override fun onBindViewHolder(holder: VyPViewHolder, position: Int) {
      holder.render(vyPList[position])
    }
}