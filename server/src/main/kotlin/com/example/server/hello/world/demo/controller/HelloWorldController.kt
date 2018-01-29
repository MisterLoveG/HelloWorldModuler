package com.example.server.hello.world.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController{

    @GetMapping("/hello")
    fun getHello():String{
        return "Hello World!!"
    }

}