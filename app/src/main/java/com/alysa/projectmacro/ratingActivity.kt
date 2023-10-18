package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.alysa.projectmacro.ui.homePage.HomeFragment

class ratingActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var back : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        back = findViewById(R.id.btn_rating)
        back.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.btn_rating ->{
                val intent = Intent(this, Homepage::class.java)
                startActivity(intent)
            }
        }
    }
}