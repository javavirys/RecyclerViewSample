package com.javavirys.recyclerviewsample.presentation.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.RecyclerView
import com.javavirys.recyclerviewsample.R
import com.javavirys.recyclerviewsample.presentation.adapter.UserAdapter

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val adapter: UserAdapter by lazy { UserAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = ActivityCompat.requireViewById<RecyclerView>(this, R.id.recyclerView)
        recyclerView.adapter = adapter
    }
}