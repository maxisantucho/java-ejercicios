package com.poo;

public class Sanitario extends Modulo{

    private int boxes;
    private boolean lavado;

    public Sanitario(int codigo, int largo, int ancho, int unidades, int boxes, boolean lavado) {
        super(codigo, largo, ancho, unidades);
        if(boxes > 0) {
            this.boxes = boxes;
        } else {
            this.boxes = 1;
        }
        this.lavado = lavado;
    }

    @Override
    public double obtenerPrecioUnitario(float p) {
        double calculo = largo * ancho * p + 2 * p * boxes;
        if(lavado) {
            return calculo += 3 * p;
        } else {
            return calculo;
        }
    }
}
