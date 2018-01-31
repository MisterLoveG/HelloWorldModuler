package com.example.rafael.mobile

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloText = findViewById<TextView>(R.id.helloText)
        helloText.text = HelloWorldTask().execute().get()
    }
}
