package com.javavirys.recyclerviewsample.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.javavirys.recyclerviewsample.R
import com.javavirys.recyclerviewsample.core.entity.User

class UserAdapter : RecyclerView.Adapter<UserViewHolder>() {

    private val userList = mutableListOf<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_recycler_item, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.onBind(userList[position])
    }

    override fun getItemCount() = userList.size

    fun setItems(users: List<User>) {
        userList.clear()
        userList.addAll(users)
        notifyDataSetChanged()
    }
}