package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.widget.AppCompatImageButton

class konsultasiActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var back: AppCompatImageButton
    private lateinit var notif: AppCompatImageButton
    private  lateinit var psi: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konsultasi)

        back = findViewById(R.id.back)
        notif = findViewById(R.id.pesan)
        psi = findViewById(R.id.psimen1)

        back.setOnClickListener(this)
        notif.setOnClickListener(this)
        psi.setOnClickListener(this)
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
            R.id.psimen1 -> {
                val intent = Intent(this, ConsulPayment::class.java)
                startActivity(intent)
            }
        }
    }
}