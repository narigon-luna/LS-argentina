package com.curso.lenguasdeseñas.ui.gramatica.gramaticaadalter

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ActivityCarruselBinding
import com.curso.lenguasdeseas.databinding.ItemGramaticaBinding
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo
import com.curso.lenguasdeseñas.ui.carper.CarPerActivity
import com.curso.lenguasdeseñas.ui.carrusel.CarruselActivity
import com.curso.lenguasdeseñas.ui.datoper.DatoPerActivity
import com.curso.lenguasdeseñas.ui.detail.GeneralDetailAvtivity
import com.curso.lenguasdeseñas.ui.detaildias.DetailDiasActivity
import com.curso.lenguasdeseñas.ui.detailestyclim.DetailestayClimActivity
import com.curso.lenguasdeseñas.ui.detailtecnoyredes.DetailTecnoyRedesActivity
import com.curso.lenguasdeseñas.ui.estadocivil.EstadoCivilActivity
import com.curso.lenguasdeseñas.ui.familia.FamiliaActivity
import com.curso.lenguasdeseñas.ui.fcortesia.FcortesiaActivity
import com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.RelacionesActivity
import com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.sentimientos.SentimientosActivity
import com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.trabajo.TrabajoActivity
import com.curso.lenguasdeseñas.ui.ocio.OcioActivity

class GramaticaViewHolder  (view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemGramaticaBinding.bind(view)

    fun gramaticarender(gramaticaInfo: GramaticaInfo) {
        val context = binding.tvTitulo.context
        binding.ivGramatica.setImageResource(gramaticaInfo.imggramatica)
        binding.tvTitulo.text = context.getString(gramaticaInfo.namegramatica)
        binding.tvDescripcion.text = context.getString(gramaticaInfo.descripgramatica)
        binding.parent.setOnClickListener {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                when (position) {
                    0 -> {
                        val intent = Intent(context, CarPerActivity::class.java)
                        context.startActivity(intent)
                    }
                    1 -> {
                        val intent = Intent(context, DatoPerActivity::class.java)
                        context.startActivity(intent)
                    }
                    2 -> {
                        val intent = Intent(context, EstadoCivilActivity::class.java)
                        context.startActivity(intent)
                    }
                    3 -> {
                        val intent = Intent(context,FamiliaActivity::class.java)
                        context.startActivity(intent)
                    }
                    4 -> {
                        val intent = Intent(context, FcortesiaActivity::class.java)
                        context.startActivity(intent)
                    }
                    5 -> {
                        val intent = Intent(context, OcioActivity::class.java)
                        context.startActivity(intent)
                    }
                    6 -> {
                        val intent = Intent(context, RelacionesActivity::class.java)
                        context.startActivity(intent)
                    }
                    7 -> {
                        val intent = Intent(context, SentimientosActivity::class.java)
                        context.startActivity(intent)
                    }
                    8 -> {
                        val intent = Intent(context, TrabajoActivity::class.java)
                        context.startActivity(intent)
                    }else-> {

                }

                }
            }
        }
    }
}