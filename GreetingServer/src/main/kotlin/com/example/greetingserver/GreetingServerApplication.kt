package com.example.greetingserver

import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean

@EnableEurekaClient
@SpringBootApplication
class GreetingServerApplication {
    private val logger = KotlinLogging.logger {}

    @Value("\${eureka.client.service-url.defaultZone}")
    var defaultZone: String? = null

    @Value("\${spring.application.name}")
    lateinit var applicationName: String

    @Bean
    fun postApplicationSetup() = ApplicationRunner {
        logger.info{ String.format("Eureka URI: %s", System.getenv("EUREKA_URL") ?: "default") }
        logger.info{ String.format("Eureka Default Zone: %s", defaultZone) }
        logger.info{ String.format("Application Name: %s", applicationName) }
    }
}

fun main(args: Array<String>) {
    runApplication<GreetingServerApplication>(*args)
}
