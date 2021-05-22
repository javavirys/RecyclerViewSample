/*
 * Copyright (C) 2021 Vitaliy Sychov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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