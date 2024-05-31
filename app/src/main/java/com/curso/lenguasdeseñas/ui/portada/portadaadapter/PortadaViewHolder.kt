package com.curso.lenguasdeseñas.ui.portada.portadaadapter

import android.net.Uri
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemPortadaBinding
import com.curso.lenguasdeseñas.dominio.model.model.portadamodel.PortadaInfo

class PortadaViewHolder  (view: View) : RecyclerView.ViewHolder(view)  {

    private val binding = ItemPortadaBinding.bind(view)
    fun render (portadaInfo: PortadaInfo) {

        binding.textView1.text = binding.textView1.context.getString(portadaInfo.intro)
        binding.textView2.text = binding.textView2.context.getString(portadaInfo.expli)
        binding.videoView.setVideoURI(Uri.parse(portadaInfo.video))
        binding.videoView.start()
        binding.parent.setOnClickListener {

        }
    }
}