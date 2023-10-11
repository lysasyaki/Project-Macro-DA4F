package com.alysa.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton

class GetStarted : AppCompatActivity() {

    private val slideViewPager: ViewPager2 by lazy { findViewById(R.id.slideViewPager) }
    private val indicatorsContainer: LinearLayout by lazy { findViewById(R.id.indicatorsContainer) }
    private val btn_signin: MaterialButton by lazy { findViewById(R.id.btn_signin) }
    private val btn_signup: MaterialButton by lazy { findViewById(R.id.btn_signup) }

    private val slideAdapter = slideAdapter(
        listOf (
            slide(
                "We are ready to help and solve the problems you have",
                R.drawable.getstarted1
            ),
            slide(
                "The happiness of a family is greatly influenced by its children.",
                R.drawable.getstarted2
            ),
            slide(
                "Parents influence children's growth and development",
                R.drawable.getstarted3
            )
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.getstarted)
        slideViewPager.adapter= slideAdapter
        setupIndicators()
        setCurrentIndicator(0)
        slideViewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback(){

            override fun onPageSelected(position: Int){
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })
        btn_signin.setOnClickListener{
            if (slideViewPager.currentItem + 1 < slideAdapter.itemCount) {
                slideViewPager.currentItem +=1
            } else{
                Intent(applicationContext, signin::class.java).also{
                    startActivity(it)
                }
            }
        }
        btn_signup.setOnClickListener{
            if (slideViewPager.currentItem + 1 < slideAdapter.itemCount) {
                slideViewPager.currentItem +=1
            } else{
                Intent(applicationContext, login::class.java).also{
                    startActivity(it)
                }
            }
        }
    }

    private fun setupIndicators(){
        val indicators = arrayOfNulls<ImageView>(slideAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams =
            LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        layoutParams.setMargins(8, 0, 8, 0)
        for (i in indicators.indices){
            indicators[i] = ImageView(applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )
                )
                this?.layoutParams = layoutParams
            }
            indicatorsContainer.addView(indicators[i])
        }
    }
    private fun setCurrentIndicator(index: Int){
        val childCount = indicatorsContainer.childCount
        for(i in 0 until childCount){
            val imageView = indicatorsContainer [i] as ImageView
            if (i == index){
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_active
                    )
                )
            } else {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )
                )
            }
        }
    }
}