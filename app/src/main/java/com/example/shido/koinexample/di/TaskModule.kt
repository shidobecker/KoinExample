package com.example.shido.koinexample.di

import com.example.shido.koinexample.datasource.TaskDataSource
import com.example.shido.koinexample.datasource.TaskRemoteDataSource
import com.example.shido.koinexample.repository.FakeTaskRepository
import com.example.shido.koinexample.repository.TaskRepository
import com.example.shido.koinexample.viewmodel.MainViewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext


val taskModule: Module = applicationContext {
    bean { TaskRemoteDataSource() as TaskDataSource}
    bean { FakeTaskRepository(get()) as TaskRepository }

    factory { MainViewModel(get()) } // get() will resolve Repository instance

}
