package com.example.rafael.mobile

import android.os.AsyncTask
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

class HelloWorldTask: AsyncTask<Void, Void, String?>() {
    override fun doInBackground(vararg params: Void?): String? {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://192.168.0.5:8810/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build()
        val helloService = retrofit.create(HelloWorldService::class.java)
        val execute = helloService.retrieveHello().execute()
        return  execute.body()
    }

}
