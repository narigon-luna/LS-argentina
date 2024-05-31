package com.curso.lenguasdeseñas.ui.verbosypron.ui.reftemp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.ui.verbosypron.dominio.reftemp.RefTempInfo

class RefTempAdapter (private var refperList: List<RefTempInfo> = emptyList(),
                      private val onItemSelect: (RefTempInfo) -> Unit):
RecyclerView.Adapter<RefPerViewHolder>() {

    fun updatelist(list: List<RefTempInfo>) {
        refperList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RefPerViewHolder {
       return RefPerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_reftemp, parent, false))
    }

    override fun getItemCount() = refperList.size

    override fun onBindViewHolder(holder: RefPerViewHolder, position: Int) {
      holder.rende(refperList[position])
    }
}