package com.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/docker")
public class FirstDockerResource {

    @GetMapping
    public String firstDocker() {
        return "first docker";
    }
}
