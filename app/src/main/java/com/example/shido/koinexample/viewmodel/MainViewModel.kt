package com.example.shido.koinexample.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.shido.koinexample.model.Task
import com.example.shido.koinexample.repository.TaskRepository

class MainViewModel(val repository: TaskRepository ): ViewModel() {

    val tasks = MutableLiveData<List<Task>>()

    fun getTasks() {
        tasks.value = repository.getTasks()
    }

}