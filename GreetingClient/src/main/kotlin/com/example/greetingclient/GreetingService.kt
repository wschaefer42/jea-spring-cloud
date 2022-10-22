package com.example.greetingclient

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(value = "greeting-server", url = "\${app.greeting.url}")
interface GreetingService {
    @GetMapping("/greeting")
    fun greeting(): String
}