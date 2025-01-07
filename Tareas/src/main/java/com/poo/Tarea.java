package com.poo;

public class Tarea{

private String nombre;
private String asignatura;
private String profesor;
private String fechaEntregada;
private int estado;

public Tarea(String nombre, String asignatura, String profesor, String fechaEntregada) {
    this.nombre = nombre;
    this.asignatura = asignatura;
    this.profesor = profesor;
    this.fechaEntregada = fechaEntregada;
}

public void setEstado(int estado) {
    this.estado = estado;
}

@Override
public String toString() {
    String textoEstado = "Creado";
    if (estado == 1) {
        textoEstado = "Entregado";
    }
    return "Tarea{" +
            "nombre='" + nombre + '\'' +
            ", asignatura='" + asignatura + '\'' +
            ", profesor='" + profesor + '\'' +
            ", fechaEntregada='" + fechaEntregada + '\'' +
            ", estado=" + textoEstado +
            '}';
}
}
