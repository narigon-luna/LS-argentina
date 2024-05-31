package com.curso.lenguasdeseñas.ui.ropayacc.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.ropayacc.RopayAccInfo

class RopayAccAdapter (private var ropayAccList: List<RopayAccInfo> = emptyList(),
                        private val onItemSelect: (RopayAccInfo)  -> Unit) :
RecyclerView.Adapter<RopáyAccViewHolder>(){
    fun updatelist(list: List<RopayAccInfo>){
        ropayAccList = list
        notifyDataSetChanged()

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RopáyAccViewHolder {
       return RopáyAccViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_ropyacc, parent, false))
    }

    override fun getItemCount()= ropayAccList.size

    override fun onBindViewHolder(holder: RopáyAccViewHolder, position: Int) {
       holder.render(ropayAccList[position])
    }
}