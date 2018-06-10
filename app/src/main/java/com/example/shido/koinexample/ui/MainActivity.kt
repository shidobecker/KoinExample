package com.example.shido.koinexample.ui

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.shido.koinexample.R
import com.example.shido.koinexample.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getTasks()

        viewModel.tasks.observe(this, Observer {
            it?.forEach {
                hello.text = hello.text.toString().plus("\n").plus(it.message)
            }
        })
    }
}
