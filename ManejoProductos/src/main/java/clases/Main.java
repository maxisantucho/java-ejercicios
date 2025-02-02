package clases;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File archivo = new File("archivo.txt");

//        try (PrintWriter entrada = new PrintWriter(new FileWriter(archivo))) {
//            entrada.print(new Producto("303456", "Jabon", "Limpiza de ropa", 12f, 5));
//            System.out.println("El archivo se ha creado con exito");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try (PrintWriter entrada = new PrintWriter(new FileWriter(archivo, true))) {
//            entrada.print(new Producto("14532", "Detergente", "Limpiza de trastos", 9f, 11));
//            System.out.println("El archivo se ha creado con exito");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try (BufferedReader salida = new BufferedReader(new FileReader(archivo))) {
//            String contenido = salida.readLine();
//            while(contenido != null) {
//                System.out.println(contenido);
//                contenido = salida.readLine();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        archivo.delete();
        System.out.println("Archivo eliminado");

    }
}