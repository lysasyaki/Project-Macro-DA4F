package com.alysa.projectmacro

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class slideAdapter(private val slides: List<slide>) :
RecyclerView.Adapter<slideAdapter.slideViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): slideViewHolder {
        return slideViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slider_item_container,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return slides.size
    }

    override fun onBindViewHolder(holder: slideViewHolder, position: Int) {
        holder.bind(slides[position])
    }

    inner class slideViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val textTitle = view.findViewById<TextView>(R.id.textTitle)
        private val imageIcon = view.findViewById<ImageView>(R.id.imageIcon)

        fun bind(slide: slide) {
            textTitle.text = slide.Title
            imageIcon.setImageResource(slide.Icon)
        }
    }
}