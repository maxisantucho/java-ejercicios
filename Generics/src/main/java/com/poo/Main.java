package com.poo;

import java.lang.ref.SoftReference;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {

        Sorteador<Club> sorteo = new Sorteador<>();

        System.out.println("Sorteador recién creado");
        retardo(1);
        System.out.println("¿Sorteador vacío? " + sorteo.isEmpty());
        retardo(1);
        System.out.println("Comienza la inserción de elementos");
        retardo(1);
        sorteo.add(new Club("Boca Juniors", PaisSudamericano.ARGENTINA));
        sorteo.add(new Club("River Plate", PaisSudamericano.ARGENTINA));
        sorteo.add(new Club("Flamengo", PaisSudamericano.BRASIL));
        sorteo.add(new Club("Palmeiras", PaisSudamericano.BRASIL));
        sorteo.add(new Club("Atlético Mineiro", PaisSudamericano.BRASIL));
        sorteo.add(new Club("Athlético Paranaense", PaisSudamericano.BRASIL));
        sorteo.add(new Club("Nacional", PaisSudamericano.URUGUAY));
        sorteo.add(new Club("Peñarol", PaisSudamericano.URUGUAY));
        retardo(1);
        System.out.println("Fin de la inserción de elementos");
        retardo(1);
        System.out.println("¿Está vacío? " + sorteo.isEmpty());
        retardo(1);
        System.out.println("\n*** Comienza el sorteo... ***");
        retardo(1);
        while (!sorteo.isEmpty()) {
            System.out.println(sorteo.remove());
            retardo(1);
        }
        System.out.println("*** Fin del sorteo ***\n");
        retardo(1);
        System.out.println("¿Sorteador vacío? " + sorteo.isEmpty());

    }

    public static void retardo(int s) {
        try{
            Thread.sleep(s * 1000);
        } catch(InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}