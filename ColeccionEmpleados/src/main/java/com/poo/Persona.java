package com.poo;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Persona: " + nombre + " " + apellido;
    }
}
