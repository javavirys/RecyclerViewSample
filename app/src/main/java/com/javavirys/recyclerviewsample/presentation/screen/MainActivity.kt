package com.javavirys.recyclerviewsample.presentation.screen

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.RecyclerView
import com.javavirys.recyclerviewsample.R
import com.javavirys.recyclerviewsample.di.MainViewModelFactory
import com.javavirys.recyclerviewsample.presentation.adapter.UserAdapter
import com.javavirys.recyclerviewsample.presentation.viewmodel.MainViewModel

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val model: MainViewModel by viewModels { MainViewModelFactory() }

    private val adapter: UserAdapter by lazy { UserAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = ActivityCompat.requireViewById<RecyclerView>(this, R.id.recyclerView)
        recyclerView.adapter = adapter
        model.getUsers().observe(this, adapter::setItems)
        model.loadUsers()
    }
}