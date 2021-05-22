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
package com.javavirys.recyclerviewsample.data.repository

import com.javavirys.recyclerviewsample.R
import com.javavirys.recyclerviewsample.core.entity.User
import com.javavirys.recyclerviewsample.domain.repository.UserRepository

class LocalUserRepository : UserRepository {

    override suspend fun getAll() = listOf(
        User(0, "Vitaliy Sychov", "Middle Android developer", R.drawable.ic_vitaliy),
        User(1, "Vyacheslav Gvozdetskiy", "Senior PHP developer", R.drawable.ic_vyacheslav),
        User(2, "Juliya Pushkina", "Quality assurance engineer", R.drawable.ic_julia),
        User(3, "Andrei Smirnov", "Project manager", R.drawable.ic_andrei)
    )
}