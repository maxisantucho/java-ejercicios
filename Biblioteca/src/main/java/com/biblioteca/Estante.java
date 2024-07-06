package com.biblioteca;

import java.util.ArrayList;

public class Estante {

    private String nombreEstante;
    private ArrayList<Libro> libros;

    public Estante(String nombreEstante) {
        this.nombreEstante = nombreEstante;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public String getNombreEstante() {
        return nombreEstante;
    }

    public void setNombreEstante(String nombreEstante) {
        this.nombreEstante = nombreEstante;
    }

    @Override
    public String toString() {
        return "Nombre de Estante: " + nombreEstante;
    }

}
