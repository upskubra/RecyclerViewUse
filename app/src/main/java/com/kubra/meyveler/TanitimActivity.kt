package com.kubra.meyveler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)
        val intent = intent
        val secilenMeyve = intent.getStringExtra("secilenMeyve")
        textView.text = secilenMeyve
        val meyveGorseli = Singelton.secilenGorsel
        val secilenGorsel = meyveGorseli.gorsel
        imageView.setImageBitmap(secilenGorsel)



    }
}