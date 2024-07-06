package com.ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Double> listaNumeros;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();
        main.listaNumeros = new ArrayList<>();
        main.leerOpciones();

    }

    public void leerOpciones() {
        int opcion;
        do {
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Modificar elemento");
            System.out.println("4. Eliminar elemento");
            System.out.println("5. Insertar elemento");
            System.out.println("6. Mostrar elemento");
            System.out.println("7. Salir\n");
            System.out.print("Ingresa una opcion (1-7): ");
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion) {
                case 1:
                    ingresarValor();
                    break;
                case 2:
                    buscarValor();
                    break;
                case 3:
                    modificarValor();
                    break;
                case 4:
                    eliminarValor();
                case 5:
                    insertarValor();
                    break;
                case 6:
                    mostrarLista();
                    break;
                case 7:

            }
        } while (opcion != 7);
    }

    public void ingresarValor() {
        System.out.print("Escribe el numero a ingresar: ");
        double numero = Double.parseDouble(sc.nextLine());
        listaNumeros.add(numero);
    }

    public void buscarValor() {
        System.out.print("Ingrese valor a buscar: ");
        double valor = Double.parseDouble(sc.nextLine());
        int indice = listaNumeros.indexOf(valor);
        if(indice != -1) {
            System.out.println("El valor ingresado esta en la posicion " + indice);
        } else {
            System.out.println("El valor no se encuentra en la lista.");
        }
    }

    public void modificarValor() {
        System.out.print("Ingrese valor a modificar: ");
        double valor = Double.parseDouble(sc.nextLine());
        int indice = listaNumeros.indexOf(valor);
        if(indice != -1) {
            System.out.print("Ingrese valor nuevo: ");
            double valorNuevo = Double.parseDouble(sc.nextLine());
            listaNumeros.set(indice, valorNuevo);
        } else {
            System.out.println("El valor que ingreso no se encuentra.");
        }
    }

    public void eliminarValor() {
        System.out.print("Ingrese valor a eliminar: ");
        double valor = Double.parseDouble(sc.nextLine());
        int indice = listaNumeros.indexOf(valor);
        if(indice != -1) {
            listaNumeros.remove(valor);
            System.out.println("Valor eliminado");
        } else {
            System.out.println("El valor no se encuentra.");
        }
    }

    public void insertarValor() {
        System.out.print("Ingrese valor a insertar: ");
        double valor = Double.parseDouble(sc.nextLine());
        System.out.print("Posicion donde desea insertar el numero: ");
        int posicion = Integer.parseInt(sc.nextLine());
        if(posicion != -1) {
            listaNumeros.add(posicion, valor);
            System.out.println("Valor insertado correctamente");
        } else {
            System.out.println("Posicion fuera del array.");
        }
    }

    public void mostrarLista() {
        if(!listaNumeros.isEmpty()) {
            System.out.print("Lista de numeros: ");
            for(int i=0; i<listaNumeros.size(); i++) {
                System.out.print(listaNumeros.get(i) + "; ");
            }
        } else {
            System.out.println("Lista vacia, ingrese al menos un valor con opcion 1.");
        }
    }

}