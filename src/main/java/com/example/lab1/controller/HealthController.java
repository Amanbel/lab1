package com.example.lab1.controller;

import com.example.lab1.dto.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;


@RestController
public class HealthController {
    
    @Value("${spring.application.name:demo-service}")
    private String serviceName;
    
    @Value("${application.version:1.0.0}")
    private String version;

    @GetMapping("/health")
    public HealthStatus health() {
        return new HealthStatus(
            serviceName,
            version,
            "UP",
            Instant.now()
        );
    }
}
