package com.poo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Persona pepe = new Persona("Pepe", "Perez");
        Deportista mariano = new Deportista("Mariano", "Martinez", 100);
        Deportista juan = new Deportista("Juan", "Juarez", 70);
        Futbolista ana = new Futbolista("Ana", "Lopez", 80, 10);
        Futbolista messi = new Futbolista("Andres", "Poccetinno", 100, 100);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(pepe);
        personas.add(mariano);
        personas.add(juan);
        personas.add(ana);
        personas.add(messi);

        ArrayList<Deportista> deportistas = new ArrayList<>();
        deportistas.add(mariano);
        deportistas.add(juan);

        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(ana);
        futbolistas.add(messi);

        UtilListas.mostrarListaDePersonas(personas);
        System.out.println();
        UtilListas.mostrarListaDePersonas(deportistas);
        System.out.println();
        UtilListas.mostrarListaDePersonas(futbolistas);
        System.out.println();

        UtilListas.agregarDeportistaALaLista(deportistas, "Dibu", "Martineh", 16);
        UtilListas.mostrarListaDePersonas(deportistas);
        System.out.println();
        UtilListas.agregarDeportistaALaLista(personas, "Alejandro", "Garnacho", 40);
        UtilListas.mostrarListaDePersonas(personas);


//        ArrayList<Persona> personas = new ArrayList<>();
//
//        personas.add(new Persona("Pepe", "Perez"));
//        personas.add(new Persona("Mariano", "Martinez"));
//        personas.add(new Persona("Juan", "Juarez"));
//        personas.add(new Persona("Ana", "Lopez"));
//
//        ArrayList<Auto> autos = new ArrayList<>();
//
//        autos.add(new Auto("ABC123", "Azul"));
//        autos.add(new Auto("DFJ234", "Negor"));
//        autos.add(new Auto("HIG345", "Bordo"));
//        autos.add(new Auto("KLM456", "Plateado"));
//
//        UtilListas.mostrarLista(personas);
//        System.out.println();
//        UtilListas.mostrarLista(autos);

    }
}