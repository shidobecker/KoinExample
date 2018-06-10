package com.example.shido.koinexample.datasource

import com.example.shido.koinexample.model.Task

interface TaskDataSource {

    fun getTaskFromServer(): List<Task>

}