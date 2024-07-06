package com.ejerciciosJAVA;

import java.util.Arrays;

public class Receta {

    private String nombre;
    private String[] ingredientes;
    private int tiempoPreparacion;
    private String tipo;
    private boolean estado;

    public Receta(String nombre, String[] ingredientes, int tiempoPreparacion, String tipo, boolean estado) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.tiempoPreparacion = tiempoPreparacion;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Receta" +
                "\nNombre: " + nombre +
                "\nIngredientes: " + Arrays.toString(ingredientes) +
                "\nTiempo de preparacion: " + tiempoPreparacion +
                "\nTipo: " + tipo +
                "\nEstado: " + estado;
    }
}
