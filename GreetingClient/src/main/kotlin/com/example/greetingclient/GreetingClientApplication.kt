package com.example.greetingclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class GreetingClientApplication

fun main(args: Array<String>) {
    runApplication<GreetingClientApplication>(*args)
}
