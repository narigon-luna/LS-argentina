package com.curso.lenguasdeseñas.ui.detailestyclim.estyclimadapter


import android.content.Context
import android.net.Uri
import android.view.View
import android.webkit.WebChromeClient
import android.widget.MediaController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.ItemEstayclimBinding
import com.curso.lenguasdeseñas.dominio.model.model.estycli.EstyClimInfo


class EstayClimViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemEstayclimBinding.bind(view)

    fun estayclimrender(estyClimInfo: EstyClimInfo){
      //  val mediaController = MediaController()
       // mediaController.setAnchorView(binding.imageView)
       // mediaController.setMediaPlayer(binding.imageView)
       // binding.imageView.setMediaController()
        //binding.imageView.start()

      //  Glide.with(binding.imageView.context).load(estyClimInfo.imgest)
       //val video = estyClimInfo.imgest
       // binding.imageView.setVideoURI(Uri.parse(video))


      //  binding.imageView.setOnPreparedListener { mp ->
            // Reproducir el video cuando esté preparado
        //    mp.start()
      //  }
        binding.ivEstac.setImageResource(estyClimInfo.foto)
        binding.ivClima.setImageResource(estyClimInfo.photo)
       binding.imageView.loadData(estyClimInfo.imgest,"text/html","utf-8")
      binding.imageView.settings.javaScriptEnabled = true
       binding.imageView.webChromeClient = WebChromeClient()
        val context = binding.tvTitulo.context
      //  binding.ivEstayClim.setImageResource(estyClimInfo.imgest)
        binding.tvTitulo.text = context.getString(estyClimInfo.nameest)
        binding.tvDescripcion.text = context.getString(estyClimInfo.descripest)

        binding.parent.setOnClickListener {
        }
    }
}