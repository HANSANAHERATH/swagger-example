package com.swagger.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/service")
public class ServiceController {

    @GetMapping(value = "/")
    public String findAllServices() {
        return "return All services";
    }
}
