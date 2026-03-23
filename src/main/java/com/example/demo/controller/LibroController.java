package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Libro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")


public class LibroController {


    @Autowired
    private LibroService libroService;

    @GetMapping
    public List listarLibros() {
        return libroService.getLibros();
    }

    @PostMapping
    public String agregarLibro(@RequestBody Libro libro) {

        return libroService.saveLibro(libro);
    }
    
    @PutMapping("{id}")
    public String actualizarLibro(@PathVariable String id, @RequestBody String libro) {
        //TODO: process PUT request
        
        return libroService.updateLibro(libro);
    }

    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }

}
