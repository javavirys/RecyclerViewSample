package com.javavirys.recyclerviewsample.core.entity

import androidx.annotation.DrawableRes

data class User(
    val id: Int,
    val fullName: String,
    val position: String,
    @DrawableRes val imageId: Int
)