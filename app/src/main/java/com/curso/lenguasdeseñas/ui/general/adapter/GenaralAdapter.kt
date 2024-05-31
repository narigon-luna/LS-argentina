package com.curso.lenguasdeseñas.ui.general.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.generalmodel.GeneralInfo

class GenaralAdapter(private var generalList: List<GeneralInfo> = emptyList(),/** private val context: (GeneralInfo) -> Unit):*/
                     private val onItemSelecte: (GeneralInfo) -> Unit) :

 RecyclerView.Adapter<GeneralViewHolder>() {

    fun updateList(list:List<GeneralInfo>){
        generalList = list
        notifyDataSetChanged()
    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneralViewHolder {
      return GeneralViewHolder(
          LayoutInflater.from(parent.context).inflate(R.layout.item_general, parent, false)
      )
    }

    override fun getItemCount() = generalList.size


    override fun onBindViewHolder(holder: GeneralViewHolder, position: Int) {
       holder.render(generalList[position]/**, onItemSelecte*/)
       // holder.itemView.setOnClickListener(View.OnClickListener {
       // })
    }


}