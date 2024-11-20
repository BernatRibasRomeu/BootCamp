package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numero")
public class NumeroController {

    @GetMapping("/{valor}")
    public String verificarNumero(@PathVariable String valor) {
        try {
            int numero = Integer.parseInt(valor); // Intenta convertir el valor a un número
            if (numero % 2 == 0) {
                return valor + " es un número PAR.";
            } else {
                return valor + " es un número IMPAR.";
            }
        } catch (NumberFormatException e) {
            return valor + " no es un número válido.";
        }
    }
}