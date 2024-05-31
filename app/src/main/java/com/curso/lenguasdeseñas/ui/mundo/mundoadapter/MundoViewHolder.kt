package com.curso.lenguasdeseñas.ui.mundo.mundoadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.curso.lenguasdeseas.databinding.ItemMundoBinding
import com.curso.lenguasdeseñas.data.provider.provider.provider.MundoProvider
import com.curso.lenguasdeseñas.dominio.model.model.mundomodel.MundoInfo
import com.curso.lenguasdeseñas.dominio.model.model.mundomodel.MundoModel
import com.squareup.picasso.Picasso

class MundoViewHolder (view: View) : RecyclerView.ViewHolder(view){
    private val binding = ItemMundoBinding.bind(view)
     fun mundorender(mundoModel: MundoModel){
       //  binding.ivImg.setImageResource(mundoModel.foto)
        // binding.ivImg1.setImageResource(mundoModel.foto1)
       //  Glide.with(binding.ivImg).load(mundoModel.foto).into(binding.ivImg)
        // Glide.with(binding.ivImg1).load(mundoModel.foto1).into(binding.ivImg1)
        Picasso.get().load(mundoModel.foto).into(binding.ivImg)
         Picasso.get().load(mundoModel.foto1).into(binding.ivImg1)
         binding.tvTitulo.text = mundoModel.texto
         binding.tvDescripcion.text = binding.tvDescripcion.context.getString(mundoModel.texto1)

        /** val context = binding.tvTitulo.context
         binding.ivImg.setImageResource(mundoModel.img1)
         binding.ivImg1.setImageResource(mundoInfo.amg2)
         binding.tvTitulo.text = context.getString(mundoInfo.name)
         binding.tvDescripcion.text = context.getString(mundoInfo.descripcion)*/

         binding.peren.setOnClickListener {

         }
     }
}