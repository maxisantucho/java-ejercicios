package com.poo;

public abstract class Robot {

    private String nombre;
    protected boolean estado;
    protected int energia = 100;
    protected int orden;

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public boolean estaDespierto() {
        return estado;
    }

    public void despertar() {
        estado = true;
    }

    public void dormir() {
        estado = false;
    }

    public abstract void ordenes(String mensaje);

    public abstract void gastarEnergia();

    public void recargar() {
        energia = energia + (100 - energia);
    }

    public boolean tieneEnergia() {
        return energia > 0;
    }

    @Override
    public String toString() {
        String comoEsta = "Durmiendo";
        if(estado) {
            comoEsta = "Despierto";
        }
        return "\nNombre: " + nombre +
                "\nEstado: " + comoEsta +
                "\nEnergia: " + energia;
    }
}
