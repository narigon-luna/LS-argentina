package com.curso.lenguasdeseñas.ui.general.adapter

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.curso.lenguasdeseas.databinding.ItemGeneralBinding
import com.curso.lenguasdeseñas.dominio.model.model.generalmodel.GeneralInfo
import com.curso.lenguasdeseñas.ui.detail.GeneralDetailAvtivity
import com.curso.lenguasdeseñas.ui.detailcolores.DetailColoresActivity
import com.curso.lenguasdeseñas.ui.detaildias.DetailDiasActivity
import com.curso.lenguasdeseñas.ui.detailestyclim.DetailestayClimActivity
import com.curso.lenguasdeseñas.ui.detailtecnoyredes.DetailTecnoyRedesActivity
import com.curso.lenguasdeseñas.ui.escuela.EscuelaActivity
import com.curso.lenguasdeseñas.ui.partdelhog.PartDelHogMainActivity
import com.curso.lenguasdeseñas.ui.ropayacc.RopayAccMainActivity

class GeneralViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemGeneralBinding.bind(view)

    fun render(generalInfo: GeneralInfo
               /**, context: (GeneralInfo) -> Unit
               , onItemSelected: (GeneralInfo) -> Unit)*/) {
        val context = binding.tvTitle.context
        binding.ivGeneral.setImageResource(generalInfo.img)
        binding.tvTitle.text = context.getString(generalInfo.name)

        binding.parent.setOnClickListener {
          //startRotationAnimation(binding.ivGeneral, newLambda = {onItemSelected(generalInfo)} )
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                when (position) {
                    0 -> {
                        val intent = Intent(context, GeneralDetailAvtivity::class.java)
                        context.startActivity(intent)
                    }
                    1 -> {
                        val intent = Intent(context, DetailDiasActivity::class.java)
                        context.startActivity(intent)
                    }
                    2 -> {
                        val intent = Intent(context, DetailColoresActivity::class.java)
                        context.startActivity(intent)
                    }
                    3 -> {
                        val intent = Intent(context,DetailestayClimActivity::class.java)
                        context.startActivity(intent)
                    }
                    4 -> {
                        val intent = Intent(context,DetailTecnoyRedesActivity::class.java)
                        context.startActivity(intent)
                    }
                    5 -> {
                        val intent = Intent(context,RopayAccMainActivity::class.java
                        )
                        context.startActivity(intent)
                    }
                    6 -> {
                        val intent = Intent(context, PartDelHogMainActivity::class.java)
                        context.startActivity(intent)
                    }
                    7 -> {
                        val intent = Intent(context, EscuelaActivity::class.java
                        )
                        context.startActivity(intent)
                    }else-> {

                    }

                }
            }
            }
        }
    }

    /**private fun startRotationAnimation(view:View, newLambda:()->Unit){
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            //rotationBy(360f)
            translationX(38f)
            withEndAction { newLambda() }
            start()
        }
    }*/
//}