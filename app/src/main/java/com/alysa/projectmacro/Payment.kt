package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Payment : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

//        button cancel kembali ke konsultasi tapi aku gak punya filenya
        val btncancel : ImageView = findViewById(R.id.btn_cancel)
        btncancel.setOnClickListener(this)

        val btnpayment : Button = findViewById(R.id.btn_payment)
        btnpayment.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_cancel->{
//               Yang dapat bagian konsultasi sisa masukin yaaaa
            }

            R.id.btn_payment->{
                val intent = Intent(this@Payment , Sumarry::class.java)
                startActivity(intent)
            }
        }
    }
}