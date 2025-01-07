package com.poo;

public class Oficina extends Modulo{

    private int ventanas;
    private int tomas;

    public Oficina(int codigo, int largo, int ancho, int unidades, int ventanas, int tomas) {
        super(codigo, largo, ancho, unidades);
        this.ventanas = ventanas;
        this.tomas = tomas;
    }

    @Override
    public double obtenerPrecioUnitario(float p) {
        double calculo = largo * ancho * 2.5 * p + 3 * p * ventanas + 0.2 * p * tomas;
        return calculo;
    }

}
