package com.curso.lenguasdeseñas.ui.verbosypron.vypadapter

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemVypBinding
import com.curso.lenguasdeseñas.dominio.model.model.vypmodel.VyPInfo
import com.curso.lenguasdeseñas.ui.carper.CarPerActivity
import com.curso.lenguasdeseñas.ui.datoper.DatoPerActivity
import com.curso.lenguasdeseñas.ui.estadocivil.EstadoCivilActivity
import com.curso.lenguasdeseñas.ui.familia.FamiliaActivity
import com.curso.lenguasdeseñas.ui.fcortesia.FcortesiaActivity
import com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.RelacionesActivity
import com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.sentimientos.SentimientosActivity
import com.curso.lenguasdeseñas.ui.gramatica.ui.relaciones.trabajo.TrabajoActivity
import com.curso.lenguasdeseñas.ui.ocio.OcioActivity
import com.curso.lenguasdeseñas.ui.verbosypron.ui.adverbio.AdverbioActivity
import com.curso.lenguasdeseñas.ui.verbosypron.ui.interrogacion.InterrogacionActivity
import com.curso.lenguasdeseñas.ui.verbosypron.ui.pp.PPActivity
import com.curso.lenguasdeseñas.ui.verbosypron.ui.reftemp.RefTempActivity
import com.curso.lenguasdeseñas.ui.verbosypron.ui.vdd.VDDActivity

class VyPViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemVypBinding.bind(view)
    fun render(vyPInfo: VyPInfo){
        val context = binding.tvTitulo.context
        binding.ivVeryPro.setImageResource(vyPInfo.img)
        binding.tvTitulo.text = context.getString(vyPInfo.namevp)
        binding.tvDescripcion.text = context.getString(vyPInfo.descrip)
        binding.parent.setOnClickListener {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                when (position) {
                    0 -> {
                        val intent = Intent(context, AdverbioActivity::class.java)
                        context.startActivity(intent)
                    }
                    1 -> {
                        val intent = Intent(context, InterrogacionActivity::class.java)
                        context.startActivity(intent)
                    }
                    2 -> {
                        val intent = Intent(context,  PPActivity::class.java )
                        context.startActivity(intent)
                    }
                    3 -> {
                        val intent = Intent(context, RefTempActivity::class.java)
                        context.startActivity(intent)
                    }
                    4 -> {
                        val intent = Intent(context, VDDActivity::class.java)
                        context.startActivity(intent)
                    }else-> {

                }

                }
            }
        }
    }
}