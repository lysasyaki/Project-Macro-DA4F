package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.AppCompatImageButton

class MassageSessionActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var end : Button
    private lateinit var back : AppCompatImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_massage_session)

        end = findViewById(R.id.btn_end)
        back = findViewById(R.id.btn_back)

        end.setOnClickListener(this)
        back.setOnClickListener(this)
    }

    override fun onClick(v: View){
        when(v.id){
            R.id.btn_end ->{
                val intent = Intent(this, ratingActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_back ->{
                val intent = Intent(this, notificationActivity::class.java)
                startActivity(intent)
            }
        }
    }
}