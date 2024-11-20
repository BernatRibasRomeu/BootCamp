package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar") // Ruta base para el controlador
public class SaludarController {

    // Endpoint: /saludar/hola
    @GetMapping("/hola")
    public String hola() {
        return "Hola!";
    }

    // Endpoint: /saludar/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    // Endpoint: /saludar/salut
    @GetMapping("/salut")
    public String salut() {
        return "Salut!";
    }
}
