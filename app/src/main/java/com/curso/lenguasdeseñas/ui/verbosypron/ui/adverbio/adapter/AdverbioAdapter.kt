package com.curso.lenguasdeseñas.ui.verbosypron.ui.adverbio.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.adv.AdverbioInfo

class AdverbioAdapter (private var adverbioList: List<AdverbioInfo> = emptyList(),
                          private val onItemSelecte:(AdverbioInfo)  -> Unit):
RecyclerView.Adapter<AdverbioViewHolder>(){
    fun updateList(list: List<AdverbioInfo>) {

        adverbioList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdverbioViewHolder {
       return AdverbioViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_adverbio,parent,false))
    }

    override fun getItemCount() = adverbioList.size
    override fun onBindViewHolder(holder: AdverbioViewHolder, position: Int) {
    holder.render(adverbioList[position])
    }
}