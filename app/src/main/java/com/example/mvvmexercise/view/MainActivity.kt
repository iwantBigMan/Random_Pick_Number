package com.example.mvvmexercise.view

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmexercise.R
import com.example.mvvmexercise.databinding.ActivityMainBinding
import com.example.mvvmexercise.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mbinding : ActivityMainBinding
    private val model : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        mbinding.lifecycleOwner = this
        mbinding.viewModel = model

        var setMaxNum = findViewById<Button>(R.id.setMaxNumbtn)

        setMaxNum.setOnClickListener{
            var intent = Intent(this, SetMaxActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}