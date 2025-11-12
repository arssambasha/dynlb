package com.maab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LoadBalancerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoadBalancerServiceApplication.class, args);
    }
}

@RestController
class LoadBalancerController {

    @GetMapping("/")
    public String home() {
        return "Dynamic Load Balancer Service is running!";
    }
}
