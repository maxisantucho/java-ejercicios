package com.poo;

public class Coach extends Robot{

    public Coach(String nombre) {
        super(nombre);
    }

    public void ordenes(String mensaje) {
        if(tieneEnergia() && estaDespierto()) {
            System.out.println("Asistiendo " + mensaje);
            orden++;
            gastarEnergia();
        }
    }



    @Override
    public void gastarEnergia() {
        energia -= 20;
    }

    @Override
    public String toString() {
        return "Coach" + super.toString() +
                "\nAsistidas: " + orden;
    }
}
