package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ConsulPayment : AppCompatActivity(), View.OnClickListener {

    private lateinit var conpay : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consul_payment)

        conpay = findViewById(R.id.btn_goTo)
        conpay.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.btn_goTo ->{
                val intent = Intent(this, Payment::class.java)
                startActivity(intent)
            }
        }
    }
}