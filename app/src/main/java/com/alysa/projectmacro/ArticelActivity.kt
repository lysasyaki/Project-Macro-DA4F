package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.AppCompatImageButton

class ArticelActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var back: AppCompatImageButton
    private lateinit var notif: AppCompatImageButton
    private lateinit var ency1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_articel)

        back = findViewById(R.id.back)
        notif = findViewById(R.id.pesan)
        ency1 = findViewById(R.id.btn_baca1)

        back.setOnClickListener(this)
        notif.setOnClickListener(this)
        ency1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.back -> {
                val intent = Intent(this, Homepage::class.java)
                startActivity(intent)
            }
            R.id.pesan -> {
                val intent = Intent(this, notificationActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_baca1 -> {
                val intent = Intent(this, ViewArtikel::class.java)
                startActivity(intent)
            }
        }
    }
}