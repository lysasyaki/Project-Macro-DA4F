package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ParentingClass : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parenting_class)

        val btnSelengkapny : TextView = findViewById(R.id.btn_baca_seleng)
        btnSelengkapny.setOnClickListener(this)
    }

    override fun onClick(v: View) {
      when(v.id){
          R.id.btn_baca_seleng->{
              val intent = Intent( this , ViewClass::class.java)
              startActivity(intent)

          }

      }
    }
}