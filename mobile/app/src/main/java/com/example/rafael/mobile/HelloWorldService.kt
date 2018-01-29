package com.example.rafael.mobile

import retrofit2.Call
import retrofit2.http.GET

interface HelloWorldService{
    @GET("/api/hello")
    fun retrieveHello(): Call<String>
}