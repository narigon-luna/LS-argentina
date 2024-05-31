package com.curso.lenguasdeseñas.ui.detailcolores.coloresadapter

import android.media.session.MediaController
import android.net.Uri
import android.view.View
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.curso.lenguasdeseas.databinding.ItemColoresBinding
import com.curso.lenguasdeseñas.dominio.model.model.modelcolores.ColoresInfo

class ColorViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemColoresBinding.bind(view)
        // lateinit var videoView: VideoView
        // lateinit var mediaController: MediaController
    fun colorrender(coloresInfo: ColoresInfo) {
        val context = binding.tvTitulo.context
            binding.ivColor.setImageResource(coloresInfo.photo)
            binding.ivColor1.setImageResource(coloresInfo.photo1)
            binding.tvTitulo.text = context.getString(coloresInfo.nameColor)
            binding.tvDescripcion.text = context.getString(coloresInfo.descripcionCol)
            binding.peren.setOnClickListener {

            }
          // val videoView: VideoView
       //binding.tvTitulo.text = coloresInfo.nameColor.toString()
        //Glide.with(binding.ivColores.context).load(coloresInfo.photo).into(binding.ivColores)
        //binding.videoView.setVideoURI(Uri.parse(coloresInfo.photo))

    }
}