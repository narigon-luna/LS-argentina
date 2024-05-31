package com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.sentimientos.sentimientosadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemSentimientosBinding
import com.curso.lenguasdeseñas.ui.gramatica.dominio.relacionesmodel.sentimientos.SentimientosInfo

class SentimientosViewHolder (view: View): RecyclerView.ViewHolder(view)  {
    private val binding = ItemSentimientosBinding.bind(view)
     fun sentimientosrender(sentimientosInfo: SentimientosInfo){
         val contex = binding.tvTitulo.context
         binding.ivSentimientos.setImageResource(sentimientosInfo.img)
         binding.ivPersepcion.setImageResource(sentimientosInfo.img2)
         binding.tvTitulo.text = contex.getString(sentimientosInfo.name)
         binding.tvDescripcion.text = contex.getString(sentimientosInfo.descripcion)
         binding.parent.setOnClickListener {

         }
     }
}