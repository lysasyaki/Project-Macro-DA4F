package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  btnSignin2: Button = findViewById(R.id.btn_signIn2)
        btnSignin2.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_signIn2 ->{
                val  intent = Intent(this@MainActivity , login::class.java)
                startActivity(intent)
            }
        }

    }


}