package com.alysa.projectmacro

import android.content.Intent
import android.health.connect.datatypes.units.Mass
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Sumarry : AppCompatActivity(), View.OnClickListener {

    private lateinit var finish : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sumarry)

        finish = findViewById(R.id.btn_finish)

        finish.setOnClickListener(this)
    }

    override fun onClick(v: View){
        when(v.id){
            R.id.btn_finish->{
                val intent = Intent(this, MassageSessionActivity::class.java)
                startActivity(intent)
            }
        }
    }
}