package com.ejerciciosJAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    ArrayList<Receta> recetario = new ArrayList<>();

    public static void main(String[] args) {

        Main control = new Main();
        control.mostrarMenu();

    }

    public void mostrarMenu() {
        String menu = "1. Agregar receta";
        menu += "\n2. Eliminar recetas no aprobadas";
        menu += "\n3. Consultar por ingrediente";
        menu += "\n4. Consultar por tipo";
        menu += "\n5. Salir";
        System.out.println(menu);
        System.out.print("Seleccione una opcion: ");
        int opc = Integer.parseInt(sc.nextLine());
        ejecutarOpcion(opc);
        mostrarMenu();
    }

    public void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                agregarReceta();
                break;
            case 2:
                eliminarNoAprobadas();
                break;
            case 3:
                consultarIngrediente();
                break;
            case 4:
                consultarTipo();
                break;
            case 5:
                System.out.println("Gracias por utilizar el sistema.");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no disponible.");
        }
    }

    //Pollo a la naranja&pollo,sal,agua,aceite,naranja&20&Sal&true
    //Flan de coco&gelatina,agua,azucar,leche,coco&10&Dulce&false
    //Flan de limon&gelatina,azucar,leche,limon&10&Dulce&false

    public void agregarReceta() {
        System.out.println("Ingrese los datos de la receta separados por &");
        System.out.println("(nombre&ingredientes&tiempo&tipo&estado");
        System.out.println("(los ingredientes separados por , )");
        String entrada = sc.nextLine();
        String[] datos = entrada.split("&");
        String nombre = datos[0];
        String[] ingredientes = datos[1].split(",");
        int tiempo = Integer.parseInt(datos[2]);
        String tipo = datos[3];
        boolean estado = Boolean.parseBoolean(datos[4]);
        Receta receta = new Receta(nombre, ingredientes, tiempo, tipo, estado);
        recetario.add(receta);
        System.out.println(recetario);
    }

    public void eliminarNoAprobadas() {
        recetario.removeIf(item -> (item.isEstado() == false));
        System.out.println(recetario);
    }

    public void consultarIngrediente() {
        System.out.print("Ingrese ingrediente: ");
        String ingrediente = sc.nextLine();
        for(int i = 0; i<recetario.size(); i++) {
            Receta receta = recetario.get(i);
            String [] ingredientes = receta.getIngredientes();
            for(int j = 0; j< ingredientes.length; j++) {
                if(ingredientes[j].equalsIgnoreCase(ingrediente)) {
                    System.out.println(receta);
                }
            }
        }
    }

    public void consultarTipo() {
        System.out.println("1. Sal");
        System.out.println("2. Dulce");
        System.out.print("Seleccione un tipo: ");
        int tipo = Integer.parseInt(sc.nextLine());
        String tipoFinal = "";
        if(tipo == 1) {
            tipoFinal = "Sal";
        } else {
            tipoFinal = "Dulce";
        }

        for (Receta item : recetario) {
            if(item.getTipo().equalsIgnoreCase(tipoFinal)) {
                System.out.println(item);
            }
        }
    }

}