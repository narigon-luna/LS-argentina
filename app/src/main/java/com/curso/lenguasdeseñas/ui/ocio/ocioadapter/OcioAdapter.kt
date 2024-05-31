package com.curso.lenguasdeseñas.ui.ocio.ocioadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.fcortesia.FcortesiaInfo
import com.curso.lenguasdeseñas.dominio.model.model.ocio.OcioInfo

class OcioAdapter (private var ocioList: List<OcioInfo> = emptyList(),
    private val onItemSelecte: (OcioInfo) -> Unit):
RecyclerView.Adapter<OcioViewHolder>(){

    fun updateList(list:List<OcioInfo>){
        ocioList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OcioViewHolder {
        return OcioViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_ocio, parent,false))
    }

    override fun getItemCount() = ocioList.size

    override fun onBindViewHolder(holder: OcioViewHolder, position: Int) {
       holder.ociorender(ocioList[position])
    }


}