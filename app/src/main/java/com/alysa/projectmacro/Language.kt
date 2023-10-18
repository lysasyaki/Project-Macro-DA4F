package com.alysa.projectmacro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.alysa.projectmacro.ui.profile.ProfileFragment

class Language : AppCompatActivity(), View.OnClickListener {

    private lateinit var save : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        save = findViewById(R.id.btn_sv)
        save.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.btn_sv ->{
                val intent = Intent(this, ProfileFragment::class.java)
                startActivity(intent)
            }
        }
    }
}