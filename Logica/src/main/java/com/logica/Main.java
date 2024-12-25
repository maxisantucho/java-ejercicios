package com.logica;

//import java.util.Scanner;

public class Main {

//    static Scanner sc = new Scanner(System.in);

//    public static void transponerSegunda() {
//        int[][] a = new int[5][9];
//        int[][] b = new int[9][5];
//        //llenar matriz A
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = (int) ((Math.random() * (100 - 10) + 10));
//            }
//        }
//        //mostrar matriz A
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        //trasponer matriz B
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                b[i][j] = a[j][i];
//            }
//        }
//        //mostrar matriz B
//        System.out.println("");
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                System.out.print(b[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }

//    public static void sumatoriaMatriz() {
//        int[][] matriz = {{1, 2, 3},
//                          {4, 5, 6},
//                          {7, 8, 9}};
//        int sumFilas = 0;
//        int sumColumnas = 0;
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                sumFilas = sumFilas + matriz[i][j];
//                sumColumnas = sumColumnas + matriz[j][i];
//            }
//            System.out.println("Suma de " + (i+1) + "º fila:    " + sumFilas);
//            System.out.println("Suma de " + (i+1) + "º columna: " + sumColumnas);
//            sumFilas = 0;
//            sumColumnas = 0;
//        }
//    }

//    public static void rellenarDiagonal() {
//        int[][] matriz = new int[7][7];
//        for (int i = 0; i < matriz.length; i++) {
//            matriz[i][i] = 1;
//        }
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void matrizTraspuesta() {
//        int[][] matriz = {{1, 2, 3},
//                     {4, 5, 6},
//                     {7, 8, 9}};
//        System.out.println("Matriz original:");
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int aux;
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < i; j++) {
//                aux = matriz[i][j];
//                matriz[i][j] = matriz[j][i];
//                matriz[j][i] = aux;
//            }
//        }
//        System.out.println("Matriz traspuesta:");
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static void sumarMatrices() {
//        int[][] a = {{1, 3, 2},
//                     {4, 3, 3},
//                     {2, 0, 5}};
//        int[][] b = {{1, 1, 6},
//                     {4, 3, 10},
//                     {6, 8, 2}};
//        int[][] matriz = new int[3][3];
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                matriz[i][j] = a[i][j] + b[i][j];
//            }
//        }
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + "; ");
//            }
//            System.out.println();
//        }
//    }

//    public static void matrizSimetrica() {
//        int[][] matriz = {{0, 1, -2},
//                          {1, 3, 0},
//                          {-2, 0, 5}};
//        if(matriz.length != matriz[0].length) {
//            System.out.println("No es una matriz cuadrada.");
//        } else {
//            boolean bandera = true;
//            for (int i = 0; i < matriz.length && bandera; i++) {
//                for (int j = 0; j < matriz[i].length && bandera; j++) {
//                    if(matriz[i][j] != matriz[j][i]) {
//                        bandera = false;
//                    }
//                }
//            }
//            if(bandera) {
//                System.out.println("Se obtiene la misma matriz al cambiar sus filas por columnas.");
//            } else {
//                System.out.println("La matriz no es asumetrica.");
//            }
//        }
//    }

//    public static void busquedaSecuencial() {
//        int[] arr = {4, 1, 5, 2, 3};
//        int dato = 2;
//        int i = 0;
//        boolean bandera = true;
//        while(i < 5 && bandera) {
//            if(arr[i] == dato) {
//                bandera = false;
//            }
//            i++;
//        }
//        if(bandera) {
//            System.out.println("No se ha encontrado el numero a buscar");
//        } else {
//            System.out.println("El numero esta en la posicion " + (i-1));
//        }
//    }

//    public static void metodoInsercion() {
//        int[] arr = {12, 3, 5, 54, 34, 6, 8, 22, 10, 48};
//        for (int i = 0; i < arr.length; i++) {
//            int j = i;
//            int aux = arr[i];
//            while(j > 0 && arr[j-1] > aux) {
//                arr[j] = arr[j-1];
//                j--;
//            }
//            arr[j] = aux;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "; ");
//        }
//    }

//    public static void metodoBurbuja() {
//        int[] arr = {1, 20, 10, 4, 7, 6, 8, 13, 3, 9, 2};
//        for (int j = 0; j < arr.length - 1; j++) {
//            int aux = arr[j];
//            if(aux > arr[j+1]) {
//                arr[j] = arr[j+1];
//                arr[j+1] = aux;
//                j = -1;
//            }
//        } //Otra manera de hacerlo
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "; ");
//        }
//    }

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

//        transponerSegunda();

//        sumatoriaMatriz();

//        rellenarDiagonal();

//        matrizTraspuesta();

//        sumarMatrices();

//        matrizSimetrica();

//        busquedaSecuencial();

//        metodoInsercion();

//        metodoBurbuja();

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