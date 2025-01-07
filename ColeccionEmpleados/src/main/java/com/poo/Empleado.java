package com.poo;

public class Empleado {

    private String nombre;
    private String apellido;
    private int dni;
    private String cargo;

    public Empleado(int dni, String cargo, String apellido, String nombre) {
        this.dni = dni;
        this.cargo = cargo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nEmpleado: " + nombre + " " + apellido +
                "\nDNI: " + dni +
                "\nCargo: " + cargo;
    }
}
