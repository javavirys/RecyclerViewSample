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