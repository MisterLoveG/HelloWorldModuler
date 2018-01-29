package com.example.rafael.mobile

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloText = findViewById<TextView>(R.id.helloText)
        var newText = ""
        helloText.post {
            while(newText == ""){

            }
            helloText.text = newText
        }
        val call = Thread {
            val retrofit = Retrofit.Builder()
                    .baseUrl("http://192.168.0.5:8810/")
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build()
            val helloService = retrofit.create(HelloWorldService::class.java)
            val execute = helloService.retrieveHello().execute()
            val body = execute.body()
            newText = body!!
        }
        call.start()
    }
}
