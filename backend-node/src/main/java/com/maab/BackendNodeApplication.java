package com.maab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BackendNodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackendNodeApplication.class, args);
    }
}

@RestController
class BackendController {

    @GetMapping("/")
    public String home() {
        return "Backend Node is alive!";
    }

    @GetMapping("/info")
    public String info() {
        return "Node info: Healthy, low load";
    }
}
