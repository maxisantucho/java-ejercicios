package com.logica;

public class Main {

//    public static void desplazarPosicion() {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int ultimo = arr[arr.length - 1];
//        for (int i = arr.length - 2; i >= 0; i--) {
//            int aux = arr[i];
//            arr[i+1] = aux;
//        }
//        arr[0] = ultimo;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "; ");
//        }
//    }

//    public static void insertarDesplazar() {
//        int[] arr = {4, 12, 45, 3, 6, 7, 34, 10, 0, 0};
//        System.out.print("Ingrese numero a insertar: ");
//        int insertar = 65;
//        int posicion = 5;
//        for (int i = arr.length - 2; i >= posicion; i--) {
//            int aux = arr[i];
//            if(i == posicion) {
//                arr[i] = insertar;
//            }
//            arr[i+1] = aux;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "; ");
//        }
//    }

//    public static void crecienteDecreciente() {
//        int[] arr = {4, 5, 7, 3, 7, 2, 7, 4, 7, 8, 9};
//        boolean creciente = false, decreciente = false;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if(arr[i] < arr[i+1]) {
//                creciente = true;
//            }
//            if(arr[i] > arr[i+1]) {
//                decreciente = true;
//            }
//        }
//        if(creciente == true && decreciente == false) {
//            System.out.println("El array es creciente");
//        } else if(creciente == false && decreciente == true) {
//            System.out.println("El array es decreciente");
//        } else if(creciente == true && decreciente == true) {
//            System.out.println("El array esta desordenado");
//        } else if(creciente == false && decreciente == false) {
//            System.out.println("Los elementos del array son todos iguales");
//        }
//    }

//    public static void mezclarArray() {
//        int[] a = {1, 2, 3, 7, 8, 9, 13, 14, 15, 19, 20, 21};
//        int[] b = {4, 5, 6, 10, 11, 12, 16, 17, 18, 22, 23, 24};
//        int[] c = new int[24];
//        int num = 0;
//        int j = 0;
//        for (int i = 0; i < c.length; i++, j++) {
//            c[i] = a[j];
//            i++;
//            j++;
//            c[i] = a[j];
//            j++;
//            i++;
//            c[i] = a[j];
//            j -= 2;
//            i++;
//            c[i] = b[j];
//            i++;
//            j++;
//            c[i] = b[j];
//            j++;
//            i++;
//            c[i] = b[j];
//        }
//        for (int i = 0; i < c.length; i++) {
//            System.out.print(c[i] + "; ");
//        }
//    }

    public static void main(String[] args) {

//        desplazarPosicion();

//        insertarDesplazar();

//        crecienteDecreciente();

//        mezclarArray();

    }
}