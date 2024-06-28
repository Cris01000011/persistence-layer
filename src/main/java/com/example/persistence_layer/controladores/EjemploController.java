package com.example.persistence_layer.controladores;

import com.example.persistence_layer.modelos.Ejemplo;
import com.example.persistence_layer.servicios.EjemploService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ejemplos")
public class EjemploController {

    @Autowired
    private EjemploService ejemploService;

    @PostMapping
    public Ejemplo crearEjemplo(@RequestBody Ejemplo ejemplo) {
        return ejemploService.guardarEjemplo(ejemplo);
    }

    @GetMapping
    public List<Ejemplo> obtenerTodos() {
        return ejemploService.obtenerTodos();
    }
}
