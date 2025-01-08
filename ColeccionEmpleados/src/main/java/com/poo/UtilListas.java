package com.poo;

import java.util.List;

public class UtilListas {

    public static void mostrarLista(List<?> lista) {
        for (Object l : lista) {
            System.out.println(l);
        }
    }

    public static void mostrarListaDePersonas(List<? extends Persona> lista) {
        for(Persona p : lista) {
            System.out.println(p.nombreCompleto());
        }
    }

    public static void agregarDeportistaALaLista(List<? super Deportista> lista, String nom, String ape, int ene) {
        Deportista deportista = new Deportista(ape, nom, ene);
        lista.add(deportista);
    }

}
