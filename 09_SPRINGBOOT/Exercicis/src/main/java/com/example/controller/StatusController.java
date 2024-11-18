package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class StatusController {

    @GetMapping("/status")
    public HttpStatus getStatus() {
        // Generar un número aleatorio entre 0 y 1
        Random random = new Random();
        int result = random.nextInt(2);  // 0 o 1

        // Si el resultado es 1, devolver HTTP 200, si es 0 devolver HTTP 404
        if (result == 1) {
            return HttpStatus.OK;  // Código 200
        } else {
            return HttpStatus.NOT_FOUND;  // Código 404
        }
    }
}