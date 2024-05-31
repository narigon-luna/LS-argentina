package com.curso.lenguasdeseñas.ui.gramatica.gramaticaadalter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.dactilomodel.DactilologicoInfo
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo

class GramaticaAdapter (private var gramaticaList: List<GramaticaInfo> = emptyList(),
                        private val onItemSelecte: (GramaticaInfo) -> Unit) :
//private val onItemSelecte: (GeneralInfo) -> Unit) :

    RecyclerView.Adapter<GramaticaViewHolder>() {

    fun updateList(list:List<GramaticaInfo>){
        gramaticaList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GramaticaViewHolder {
        return GramaticaViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_gramatica, parent, false)
        )
    }

    override fun getItemCount() = gramaticaList.size


    override fun onBindViewHolder(holder: GramaticaViewHolder, position: Int) {
        holder.gramaticarender(gramaticaList[position]/**, onItemSelecte*/)
        // holder.itemView.setOnClickListener(View.OnClickListener {
        // })
    }
}