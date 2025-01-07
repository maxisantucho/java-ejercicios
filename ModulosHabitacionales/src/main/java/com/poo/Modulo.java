package com.poo;

public abstract class Modulo {

    protected int codigo;
    protected int largo;
    protected int ancho;
    protected int unidades;

    public Modulo(int codigo, int largo, int ancho, int unidades) {
        this.codigo = codigo;
        this.largo = largo;
        this.ancho = ancho;
        this.unidades = unidades;
    }

    public int obtenerCodigo() {
        return codigo;
    }

    public int obtenerUnidades() {
        return unidades;
    }

    public abstract double obtenerPrecioUnitario(float p);

}
