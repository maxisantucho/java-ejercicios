package com.poo;

public class Futbolista extends Deportista {

    private int nroCamiseta;

    public Futbolista(String apellido, String nombre, int nroCamiseta, int energia) {
        super(apellido, nombre, energia);
        this.nroCamiseta = nroCamiseta;
    }

    public void patear() {
        System.out.println("Pateando...");
    }

    @Override
    public String toString() {
        return nombreCompleto();
    }

}
