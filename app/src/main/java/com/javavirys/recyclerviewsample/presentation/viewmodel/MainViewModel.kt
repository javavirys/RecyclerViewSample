package com.javavirys.recyclerviewsample.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.javavirys.recyclerviewsample.core.entity.User
import com.javavirys.recyclerviewsample.domain.repository.UserRepository
import kotlinx.coroutines.launch

class MainViewModel(private val userRepository: UserRepository) : ViewModel() {

    private val usersLiveData: MutableLiveData<List<User>> = MutableLiveData<List<User>>()

    fun loadUsers() {
        viewModelScope.launch {
            val users = userRepository.getAll()
            usersLiveData.postValue(users)
        }
    }

    fun getUsers(): LiveData<List<User>> = usersLiveData
}