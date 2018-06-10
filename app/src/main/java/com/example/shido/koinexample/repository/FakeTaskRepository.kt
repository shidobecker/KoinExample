package com.example.shido.koinexample.repository

import android.util.Log
import com.example.shido.koinexample.datasource.TaskDataSource
import com.example.shido.koinexample.model.Task

class FakeTaskRepository(val taskDataSource: TaskDataSource) : TaskRepository {

    override fun createNewTask(message: String) {
        Log.w("Created", "Created Task")
    }

    override fun getTasks(): List<Task> {

        val listFromServer = taskDataSource.getTaskFromServer()

        val localList = mutableListOf(Task("ID 1", "Task1"),
                Task("ID 2", "Task2"),
                Task("ID 3", "Task3"))

        localList.addAll(listFromServer)

        return localList
    }
}