package com.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Estante> estantes = new ArrayList<>();

    public static void main(String[] args) {

        int opcion = 0;

        do{

            System.out.println("1. Agregar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Mostrar estantes mas solicitados");
            System.out.println("4. Salir");
            System.out.print("Ingrese opcion: ");

            opcion = Integer.parseInt(entrada.nextLine());

            switch(opcion) {
                case 1:
                    System.out.println("Ingrese datos del libro: isbn&titulo");
                    String[] datos = entrada.nextLine().split("&");
                    Libro libro = new Libro(datos[0], datos[1], false);
                    int numEstante = 0;
                    String nomEstante = "";
                    if(estantes.isEmpty()){
                        numEstante = 0;
                        System.out.print("Ingrese nombre del estante: ");
                        nomEstante = entrada.nextLine();
                    } else {
                        for(int i=0; i<estantes.size(); i++) {
                            System.out.println(i + " -> " + estantes.get(i).getNombreEstante());
                        }
                        System.out.println(estantes.size() + " ->  Disponible");
                        System.out.print("Seleccione un numero de estante: ");
                        numEstante = Integer.parseInt(entrada.nextLine());
                        if(numEstante >= estantes.size()) {
                            System.out.print("Ingrese nombre del estante: ");
                            nomEstante = entrada.nextLine();
                        }
                    }
                    agregarLibro(numEstante, nomEstante, libro);
                    break;
                case 2:
                    prestarLibro();
                    break;
                case 3:
                    mostrarEstanteMasSolicitado();
                    break;
                case 4:
                    System.exit(0);
                    System.out.println("Fin. Gracias");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while(opcion != 4);

    }

    public static void agregarLibro(int numEstante, String nomEstante, Libro libro) {
        if(numEstante < estantes.size()) {
            estantes.get(numEstante).agregarLibro(libro);
        } else {
            Estante estante = new Estante(nomEstante);
            estante.agregarLibro(libro);
            estantes.add(estante);
        }
        System.out.println(estantes);
        for (int i = 0; i < estantes.size(); i++) {
            System.out.println(estantes.get(i));

        }
    }

    public static void prestarLibro() {

    }

    public static void mostrarEstanteMasSolicitado() {

    }

}