package com.beeguide.restapi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by Guyl Bastien on 06/01/2017.
 */

@SpringBootApplication
object Application {

    @JvmStatic fun main(args: Array<String>) {
        SpringApplication.run(Application::class.java, *args)
    }
}
