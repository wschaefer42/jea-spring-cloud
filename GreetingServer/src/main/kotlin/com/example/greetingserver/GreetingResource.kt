package com.example.greetingserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingResource {
    @GetMapping("/greeting")
    fun greeting(): String = "Eureka!"
}