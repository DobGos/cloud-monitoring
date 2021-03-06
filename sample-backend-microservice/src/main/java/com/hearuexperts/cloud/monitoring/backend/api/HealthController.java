package com.hearuexperts.cloud.monitoring.backend.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HealthController {

    @CrossOrigin
    @RequestMapping("/")
    public String index() {
            return "CMON Backend is up and running!";
    }

}