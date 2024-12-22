package com.logica;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);



//    public static void buscarElemento() {
//        int[] arr = new int[10];
//        System.out.println("Ingrese 10 numeros de forma creciente");
//        int num = 0;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print((i+1) + ". ");
//            arr[i] = Integer.parseInt(sc.nextLine());
//            while(num >= arr[i]) {
//                System.out.println("Numero debe ser mayor que el anterior");
//                System.out.print((i+1) + ". ");
//                arr[i] = Integer.parseInt(sc.nextLine());
//            }
//            num = arr[i];
//        }
//        System.out.print("Ingrese un numero de la tabla: ");
//        int ingresado = Integer.parseInt(sc.nextLine());
//        int j = 0;
//        boolean bandera = true;
//        while(bandera && j < arr.length) {
//            if(arr[j] == ingresado) {
//                bandera = false;
//            }
//            j++;
//        }
//        if(bandera) {
//            System.out.println("No se encontro el numero en el array.");
//        } else {
//            System.out.println("El numero ingresado esta en la posicion " + (j-1));
//        }
//    }

//    public static void fusionarTablas() {
//        int[] arrA = {12, 32, 33, 39, 45, 54, 59, 65, 78, 81};
//        int[] arrB = {2, 13, 29, 31, 55, 67, 74, 76, 90, 98};
//        int[] arrC = new int[20];
//        int a = 0, b = 0, c = 0;
//
//        while(a < 10 && b < 10){
//            if (arrA[a] < arrB[b]){
//                arrC[c]=arrA[a];
//                a++;
//                c++;
//            }
//            else{
//                arrC[c]=arrB[b];
//                b++;
//                c++;
//            }
//        }
//        if(a == 10) {
//            while(b < arrB.length) {
//                arrC[c] = arrB[b];
//                b++;
//                c++;
//            }
//        } else{
//            while(a < arrA.length) {
//                arrC[c] = arrA[a];
//                a++;
//                c++;
//            }
//        }
//        for (int i = 0; i < arrC.length; i++) {
//            System.out.print(arrC[i] + "; ");
//        }
//    }

//    public static void paresImpares() {
//        int[] arr = {12, 34, 78, 56, 45, 33, 54, 59, 81, 32};
//        int pares = 0;
//        int impares = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                pares++;
//            } else {
//                impares++;
//            }
//        }
//        int[] arrP = new int[pares];
//        int[] arrI = new int[impares];
//        int j = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                arrP[j] = arr[i];
//                j++;
//            }
//        }
//        j = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                arrI[j] = arr[i];
//                j++;
//            }
//        }
//        for (int i = 0; i < arrP.length; i++) {
//            System.out.print(arrP[i] + "; ");
//        }
//        System.out.println();
//        for (int i = 0; i < arrI.length; i++) {
//            System.out.print(arrI[i] + "; ");
//        }
//    }

//    public static void eliminarNumero() {
//        int[] arr = {13, 23, 45, 75, 35, 57, 24, 11, 90, 62};
//        System.out.print("Ingrese posicion del elemento a eliminar: ");
//        int eliminar = Integer.parseInt(sc.nextLine());
//        for (int i = eliminar; i < arr.length - 1; i++) {
//            arr[i] = arr[i+1];
//        }
//        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.print(arr[i] + "; ");
//        }
//    }

//    public static void numerosOrdenados() {
//        int[] arr = new int[10];
//        System.out.println("Ingrese 5 numeros de forma creciente:");
//        int num = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.print((i+1) + ". ");
//            arr[i] = Integer.parseInt(sc.nextLine());
//            while(num >= arr[i]) {
//                System.out.println("Numero debe ser mayor a " + num);
//                System.out.print((i+1) + ". ");
//                arr[i] = Integer.parseInt(sc.nextLine());
//            }
//            num = arr[i];
//        }
//        System.out.print("Ahora ingrese numero a insertar en el arreglo: ");
//        int insertar = Integer.parseInt(sc.nextLine());
//        int j = 0;
//        while(arr[j] < insertar && j < 5) {
//            j++;
//        }
//        for (int i = 5; i >= j; i--) {
//            arr[i+1] = arr[i];
//        }
//        arr[j] = insertar;
//        for (int i = 0; i < 6; i++) {
//            System.out.print(arr[i] + "; ");
//        }
//    }

//    public static void desplacePosiciones() {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int posicion = 8;
//        for (int i = 0; i < posicion; i++) {
//            int ultimo = arr[arr.length - 1];
//            for (int j = arr.length - 2; j >= 0; j--) {
//                int aux = arr[j];
//                arr[j+1] = aux;
//            }
//            arr[0] = ultimo;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "; ");
//        }
//    }

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

//        buscarElemento();

//        fusionarTablas();

//         paresImpares();

//        eliminarNumero();

//        numerosOrdenados();

//        desplacePosiciones();

//        desplazarPosicion();

//        insertarDesplazar();

//        crecienteDecreciente();

//        mezclarArray();

    }
}