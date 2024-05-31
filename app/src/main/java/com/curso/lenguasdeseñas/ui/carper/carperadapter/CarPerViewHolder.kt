package com.curso.lenguasdeseñas.ui.carper.carperadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemCarperBinding
import com.curso.lenguasdeseñas.dominio.model.model.car.permodel.CarPerInfo

class CarPerViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    private val  binding = ItemCarperBinding.bind(view)
     fun carperrender(carPerInfo: CarPerInfo) {
         val context = binding.tvTitulo.context
         binding.ivCar.setImageResource(carPerInfo.imgcarper)
         binding.ivPer.setImageResource(carPerInfo.ims1carper)
         binding.tvTitulo.text = context.getString(carPerInfo.namecarper)
         binding.tvDescripcion.text = context.getString(carPerInfo.descripcarper)
         binding.peren.setOnClickListener {

         }
     }
}