package com.tyj.prometheus_grafana.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping({"", "/"})
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Home Page");
    }

    @GetMapping("/greet/{name}")
    public ResponseEntity<String> greet(@PathVariable("name") String name) {
        return ResponseEntity.ok("Hello from Spring with Prometheus and Grafana, " + name + "!");
    }

    @GetMapping("/error")
    public ResponseEntity<String> generateError() {
        throw new IllegalArgumentException("Error test");
    }
}