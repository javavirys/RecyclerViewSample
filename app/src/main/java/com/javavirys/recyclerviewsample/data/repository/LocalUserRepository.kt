package com.javavirys.recyclerviewsample.data.repository

import com.javavirys.recyclerviewsample.R
import com.javavirys.recyclerviewsample.core.entity.User
import com.javavirys.recyclerviewsample.domain.repository.UserRepository

class LocalUserRepository : UserRepository {

    override fun getAll() = listOf(
        User(0, "Vitaliy Sychov", "Middle Android developer", R.drawable.ic_vitaliy),
        User(1, "Vyacheslav Gvozdetskiy", "Senior PHP developer", R.drawable.ic_vyacheslav),
        User(2, "Juliya Pushkina", "Quality assurance engineer", R.drawable.ic_julia),
        User(3, "Andrei Smirnov", "Project manager", R.drawable.ic_andrei)
    )
}