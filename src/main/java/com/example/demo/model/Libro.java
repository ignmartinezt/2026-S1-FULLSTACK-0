package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Libro {
    private int id;
    private int isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private int lanzamiento;
}
