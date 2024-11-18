package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiVersion")
public class ApiVersionController {

    // Endpoint para hacer café
    @GetMapping("/hacerCafe")
    @ResponseStatus(HttpStatus.OK) // Responde con 200 OK
    public String hacerCafe() {
        return "Coffee is ready!";
    }

    // Endpoint para hacer té
    @GetMapping("/hacerTe")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT) //Responde con 418 I am a teapot
    public String hacerTe() {
        return "I'm a tea pot";
    }

    // Endpoint para notFound
    @GetMapping("/notFound")
    @ResponseStatus(HttpStatus.NOT_FOUND) // Responde con 404 Not Found
    public String notFound() {
        return "Resource not found";
    }
}
