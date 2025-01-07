package com.poo;

public class FactoryKeeper extends Robot{

    public FactoryKeeper(String nombre) {
        super(nombre);
    }

    @Override
    public void ordenes(String mensaje) {
        if (tieneEnergia() && estaDespierto()) {
            System.out.println("Haciendo tarea " + mensaje);
            orden++;
            gastarEnergia();
        }
    }

    @Override
    public void gastarEnergia() {
        energia -= 30;
    }

    @Override
    public String toString() {
        return "Factory Kepeer" + super.toString() +
                "\nTareas realizadas: " + orden;
    }

}
