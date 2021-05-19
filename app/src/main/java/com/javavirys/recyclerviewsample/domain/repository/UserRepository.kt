package com.javavirys.recyclerviewsample.domain.repository

import com.javavirys.recyclerviewsample.core.entity.User

interface UserRepository {

    fun getAll(): List<User>
}