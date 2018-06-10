package com.example.shido.koinexample.datasource

import com.example.shido.koinexample.model.Task

class TaskRemoteDataSource : TaskDataSource {

    override fun getTaskFromServer(): List<Task> {
        return listOf(Task("ID 1", "Task1 From Server"),
                Task("ID 2", "Task2 From Server"),
                Task("ID 3", "Task3 From Server"))
    }
}