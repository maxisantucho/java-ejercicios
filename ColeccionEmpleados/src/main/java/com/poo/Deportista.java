package com.poo;

public class Deportista extends Persona {

    private int energia;

    public Deportista(String apellido, String nombre, int energia) {
        super(apellido, nombre);
        this.energia = energia;
    }

    public void descansar() {
        energia = 100;
    }

    @Override
    public String toString() {
        return nombreCompleto();
    }

}
