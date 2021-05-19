package com.javavirys.recyclerviewsample.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.javavirys.recyclerviewsample.data.repository.LocalUserRepository
import com.javavirys.recyclerviewsample.presentation.viewmodel.MainViewModel

class MainViewModelFactory : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        MainViewModel(LocalUserRepository()) as T
}