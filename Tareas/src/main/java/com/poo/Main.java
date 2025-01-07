package com.poo;

import java.util.Scanner;

public class Main {

    Tarea[] tareas = new Tarea[1];
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Main control = new Main();
        control.mostrarMenu();

    }

    public void mostrarMenu() {
        String menu = "1. Agregar tarea" +
                "\n2. Imprimir tareas" +
                "\n3. Realizar entrega";
        System.out.println(menu);
        System.out.print("Seleccione una opcion: ");
        int opcion = Integer.parseInt(sc.nextLine());
        ejecutarOpcion(opcion);
        mostrarMenu();
    }

    public void ejecutarOpcion(int opt) {
        switch(opt) {
            case 1:
                agregarTarea();
                break;
            case 2:
                imprimirTareas();
                break;
            case 3:
                entregarTarea();
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }

    public void agregarTarea() {
        System.out.println("Ingrese los datos de la tarea separados por un &");
        System.out.println("(nombre&asignatura&profesor&fechaDeEntrega)");
        String[] datos = sc.nextLine().split("&");
        String nombre = datos[0];
        String asignatura = datos[1];
        String profesor = datos[2];
        String fechaEntrega = datos[3];
        Tarea tarea = new Tarea(nombre, asignatura, profesor, fechaEntrega);
        if(tareas[0] == null) {
            tareas[0] = tarea;
            System.out.println("Tarea agregada");
        } else {
            Tarea[] tareasAux = new Tarea[tareas.length + 1];
            tareasAux[tareasAux.length - 1] =  tarea;
            for (int i = 0; i < tareas.length; i++) {
                tareasAux[i] = tareas[i];
            }
            tareas = tareasAux;
            System.out.println("Tarea agregada");
        }
    }

    public void imprimirTareas() {
        for (int i = 0; i < tareas.length; i++) {
            System.out.println((i+1) + ". " + tareas[i]);
        }
    }

    public void entregarTarea() {
        imprimirTareas();
        System.out.println("Seleccione tarea a entregar:");
        int tareaSeleccionada = Integer.parseInt(sc.nextLine());
        tareas[tareaSeleccionada - 1].setEstado(1);
        System.out.println("Tarea entregada");
    }
}