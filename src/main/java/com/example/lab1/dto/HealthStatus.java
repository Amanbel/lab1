package com.example.lab1.dto;

import java.time.Instant;

public record HealthStatus (
    String service,
    String version,
    String status,
    Instant timestamp
) {}
