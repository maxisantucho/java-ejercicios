package com.poo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Pepe", "Perez"));
        personas.add(new Persona("Mariano", "Martinez"));
        personas.add(new Persona("Juan", "Juarez"));
        personas.add(new Persona("Ana", "Lopez"));

        ArrayList<Auto> autos = new ArrayList<>();

        autos.add(new Auto("ABC123", "Azul"));
        autos.add(new Auto("DFJ234", "Negor"));
        autos.add(new Auto("HIG345", "Bordo"));
        autos.add(new Auto("KLM456", "Plateado"));

        UtilListas.mostrarLista(personas);
        System.out.println();
        UtilListas.mostrarLista(autos);

    }
}