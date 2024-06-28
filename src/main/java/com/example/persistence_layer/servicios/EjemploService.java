package com.example.persistence_layer.servicios;

import com.example.persistence_layer.modelos.Ejemplo;
import com.example.persistence_layer.repositorios.EjemploRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EjemploService {

    @Autowired
    private EjemploRepository ejemploRepository;

    public Ejemplo guardarEjemplo(Ejemplo ejemplo) {
        return ejemploRepository.save(ejemplo);
    }

    public List<Ejemplo> obtenerTodos() {
        return ejemploRepository.findAll();
    }
}
