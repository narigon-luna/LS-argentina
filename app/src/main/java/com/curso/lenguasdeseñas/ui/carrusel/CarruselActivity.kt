package com.curso.lenguasdeseñas.ui.carrusel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.ui.carrusel.carruseladapter.CarrAdapter

class CarruselActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrusel)
        val viewPager: ViewPager = findViewById(R.id.viewPager)
        val imageList = listOf(R.drawable.detail_mujer, R.drawable.sonia, R.drawable.sonia)

        val adapter = CarrAdapter(this, imageList)
        viewPager.adapter = adapter
    }
}