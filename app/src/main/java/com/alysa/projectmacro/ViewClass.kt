package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class ViewClass : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_class)

//        button cancel = back parenting class
        val btncncel : ImageView = findViewById(R.id.btn_cancel)
        btncncel.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_cancel->{
                val intent = Intent(this@ViewClass , ParentingClass::class.java)
                startActivity(intent)
            }
        }
    }
}