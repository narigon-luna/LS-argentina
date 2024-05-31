package com.curso.lenguasdeseñas.ui.dactilologico.dactilologicoadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.dactilomodel.DactilologicoInfo
import com.curso.lenguasdeseñas.ui.detaildactilologico.dactilologicoadapter.dactiadapter.DactiViewHolder

class DactilologicoAdapter (private var dactiloList: List<DactilologicoInfo> = emptyList(),
                            private val onItemSelecte: (DactilologicoInfo) -> Unit) :
    RecyclerView.Adapter<DactiViewHolder>()  {
    fun updateList(list:List<DactilologicoInfo>){
        dactiloList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DactiViewHolder {
        return DactiViewHolder (LayoutInflater.from(parent.context).inflate(R.layout.item_dactilologico, parent, false))
    }

    override fun getItemCount() = dactiloList.size



    override fun onBindViewHolder(holder: DactiViewHolder, position: Int) {
        holder.dactilologicorender(dactiloList[position])
    }
}