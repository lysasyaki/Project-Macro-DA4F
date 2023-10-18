package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class login : AppCompatActivity(), View.OnClickListener {

    private lateinit var signin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signin = findViewById(R.id.btn_signIn)

        signin.setOnClickListener(this)
    }

    override fun onClick(v: View){
        when(v.id){
            R.id.btn_signIn->{
                val intent = Intent(this, Homepage::class.java)
                startActivity(intent)
            }
        }
    }
}