package clases.software.presentacion;

import clases.software.servicio.ControlPeliculasImpl;
import clases.software.servicio.IControlPeliculas;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        IControlPeliculas control = new ControlPeliculasImpl();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Iniciar control de peliculas");
            System.out.println("2. Agregar pelicula");
            System.out.println("3. Listar peliculas");
            System.out.println("4. Buscar pelicula");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion) {
                case 1:
                    control.iniciarArchivo();
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la pelicula: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese fecha de estreno: ");
                    String estreno = sc.nextLine();
                    System.out.print("Ingrese duracion de la pelicula: ");
                    String duracion = sc.nextLine();
                    System.out.print("Ingrese el genero de la pelicula: ");
                    String genero = sc.nextLine();
                    System.out.print("Ingrese el nombre del director: ");
                    String director = sc.nextLine();
                    control.agregarPelicula(nombre, estreno, duracion, genero, director);
                    System.out.println("Pelicula agregada con exito");
                    break;
                case 3:
                    control.listarPelicula();
                    break;
                case 4:
                    System.out.print("Ingrese nombre de la pelicula a buscar: ");
                    String pelicula = sc.nextLine();
                    control.buscarPelicula(pelicula);
                    break;
                case 5:
                    System.out.println("Adios");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while(opcion != 5);

    }

}