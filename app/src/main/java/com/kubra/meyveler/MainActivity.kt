package com.kubra.meyveler

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meyveİsimleri = ArrayList<String>()
        meyveİsimleri.add("avakado")
        meyveİsimleri.add("cilek")
        meyveİsimleri.add("kiraz")
        meyveİsimleri.add("portakal")
        meyveİsimleri.add("uzum")


        val avakadoBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.avakado)
        val cilekBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.cilek)
        val kirazBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.kiraz)
        val portakalBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.portakal)
        val uzumBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.uzum)

        val meyveGörselleri = ArrayList<Bitmap>()
        meyveGörselleri.add(avakadoBitmap)
        meyveGörselleri.add(cilekBitmap)
        meyveGörselleri.add(kirazBitmap)
        meyveGörselleri.add(portakalBitmap)
        meyveGörselleri.add(uzumBitmap)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RcyclerAdapter(meyveİsimleri, meyveGörselleri)
        recyclerView.adapter =adapter

    }
}