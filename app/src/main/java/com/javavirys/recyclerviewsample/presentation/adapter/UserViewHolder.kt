package com.javavirys.recyclerviewsample.presentation.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.javavirys.recyclerviewsample.R
import com.javavirys.recyclerviewsample.core.entity.User

class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val nameTextView: TextView = ViewCompat.requireViewById(itemView, R.id.nameTextView)

    private val positionTextView: TextView =
        ViewCompat.requireViewById(itemView, R.id.positionTextView)

    private val avatarImageView: ImageView =
        ViewCompat.requireViewById(itemView, R.id.avatarImageView)

    fun onBind(item: User) {
        nameTextView.text = item.fullName
        positionTextView.text = item.position
        Glide.with(avatarImageView)
            .load(item.imageId)
            .into(avatarImageView)
    }
}