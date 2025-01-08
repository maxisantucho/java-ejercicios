package com.poo;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " " + apellido;
    }
}
