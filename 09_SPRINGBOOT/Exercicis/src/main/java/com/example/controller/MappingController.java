package com.example.controller;

import org.springframework.web.bind.annotation.*;

import com.exemple.object.Persona;

@RestController
@RequestMapping("/persona")
public class MappingController {

    // GET: Devuelve un objeto Persona
    @GetMapping()
    public Persona obtenerPersona() {
        return new Persona("Juan", "Pérez", 30);
    }

    // POST: Recibe un objeto Persona y lo muestra por consola
    @PostMapping()
    public String recibirPersona(@RequestBody Persona persona) {
        System.out.println("Persona recibida: " + persona);
        return "Persona recibida correctamente.";
    }

    // DELETE: Recibe un ID y muestra por consola que se eliminó correctamente
    @DeleteMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable int id) {
        System.out.println("Persona con ID " + id + " eliminada correctamente.");
        return "Persona con ID " + id + " eliminada correctamente.";
    }

    // PUT: Recibe un objeto Persona y devuelve un mensaje de confirmación
    @PutMapping("/print")
    public String actualizarPersona(@RequestBody Persona persona) {
        return "Persona actualizada correctamente: " +
                "Nombre = " + persona.getNom() +
                ", Apellido = " + persona.getCognom() +
                ", Edad = " + persona.getEdat();
    }
}