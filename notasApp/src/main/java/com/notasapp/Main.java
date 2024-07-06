package com.notasapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numTareas = 0;
        boolean ejecutar = true;
        String[] tareas = new String[15];

        Scanner entrada = new Scanner(System.in);

        while(ejecutar) {
            System.out.println("\nAplicacion de notas");
            System.out.println("1. Agregar una tarea");
            System.out.println("2. Buscar una tarea");
            System.out.println("3. Editar una tarea");
            System.out.println("4. Eliminar una tarea");
            System.out.println("5. Mostrar todas las tareas");
            System.out.println("6. Salir de la aplicacion");
            int opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    if(numTareas < tareas.length) {
                        System.out.println("Cual es la descripcion de tu tarea:");
                        String descripcion = entrada.nextLine();
                        tareas[numTareas] = descripcion;
                        numTareas++;
                        System.out.println("Tarea agregada");
                    } else {
                        System.out.println("No se pudo agregar la tarea o ya no hay espacio");
                    }
                    break;
                case 2:
                    System.out.print("Digite el numero de la tarea que busca: ");
                    int idTarea = Integer.parseInt(entrada.nextLine());
                    if(idTarea <= numTareas) {
                        System.out.println("Tarea " + idTarea + ": " + tareas[idTarea]);
                    } else {
                        System.out.println("El ID de la tarea es invalido");
                    }
                    break;
                case 3:
                    System.out.print("Digite numero de tarea a editar: ");
                    int tareaEdit = Integer.parseInt(entrada.nextLine());
                    if(tareaEdit <= numTareas) {
                        System.out.println("Escriba la nueva tarea:");
                        String tareaNueva = entrada.nextLine();
                        tareas[tareaEdit] = tareaNueva;
                        System.out.println("La tarea se edito correctamente");
                    } else {
                        System.out.println("No existe ese num de tarea.");
                    }
                    break;
                case 4:
                    System.out.println("Digite el id de la tarea que desea eliminar");
                    int tareaEliminada = Integer.parseInt(entrada.nextLine());
                    if(tareaEliminada <= numTareas) {
                        for (int i = tareaEliminada; i < numTareas; i++) {
                            tareas[i] = tareas[i + 1];
                        }
                        numTareas--;
                        System.out.println("Tarea eliminada correctamente");
                    } else {
                        System.out.println("El id no existe");
                    }
                    break;
                case 5:
                    if(numTareas == 0) {
                        System.out.println("Agregar al menos una tarea");
                    } else {
                        System.out.println("Lista de tareas:");
                        for (int i = 0; i < numTareas; i++) {
                            System.out.print(i + "." + tareas[i] + "; ");
                        }
                    }
                    break;
                case 6:
                    ejecutar = false;
                    System.out.println("Gracias por usar nuestra aplicacion");
                    break;
                default:
                    System.out.println("Ingrese opcion correcta");
            }

        }

    }
}