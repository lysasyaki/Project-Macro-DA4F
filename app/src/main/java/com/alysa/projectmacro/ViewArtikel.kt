package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatImageButton

class ViewArtikel : AppCompatActivity(), View.OnClickListener {

    private lateinit var cancel : AppCompatImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_artilel)

        cancel = findViewById(R.id.image_cancel)
        cancel.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.image_cancel ->{
                val intent = Intent(this, ArticelActivity::class.java)
                startActivity(intent)
            }
        }
    }
}