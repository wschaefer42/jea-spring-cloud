package com.example.greetingclient

import jakarta.inject.Inject
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class GreetingController {
    @Inject
    private lateinit var greetingService: GreetingService

    @GetMapping("/get-greeting")
    fun greeting(model: Model): String {
        model["greeting"] = greetingService.greeting()
        return "greeting"
    }
}