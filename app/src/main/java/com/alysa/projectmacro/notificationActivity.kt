package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class notificationActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var next : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        next = findViewById(R.id.btn_chat)

        next.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.btn_chat ->{
                val intent = Intent(this, MassageSessionActivity::class.java)
                startActivity(intent)
            }
        }
    }
}