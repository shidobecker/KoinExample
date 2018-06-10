package com.example.shido.koinexample.repository

import com.example.shido.koinexample.model.Task

interface TaskRepository {

    fun createNewTask(message: String)

    fun getTasks() : List<Task>

}