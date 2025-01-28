package clases.software.datos;

import clases.software.domain.Pelicula;
import clases.software.excepciones.AccesoDatosExcepcion;
import clases.software.excepciones.EscrituraDatosExcepcion;
import clases.software.excepciones.LecturaDatosExcepcion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean comprobarSiExisteArchivo(String nombreArchivo) throws AccesoDatosExcepcion {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosExcepcion {
        File archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String contenido = null;
            contenido = entrada.readLine();
            while (contenido != null) {
                String[] con = contenido.split(", ");
                String nombre = con[0];
                String estreno = con[1];
                String duracion = con[2];
                String genero = con[3];
                String nombreDirector = con[4];
                Pelicula pelicula = new Pelicula(nombre, estreno, duracion, genero, nombreDirector);
                peliculas.add(pelicula);
                contenido = entrada.readLine();
            }
            entrada.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new LecturaDatosExcepcion("Excepcion al listar peliculas");
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosExcepcion {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.print(pelicula);
            salida.close();
            System.out.println("Se ha agregado la pelicula exitosamente");
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new EscrituraDatosExcepcion("Excepcion al escribir en el archivo");
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosExcepcion {
        File archivo = new File(nombreArchivo);
        String resultado = "";
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            int indice = 0;
            linea = entrada.readLine();
            boolean bandera = true;
            while(linea != null && bandera) {
                String[] cad = linea.split(", ");
                String con = cad[0].substring(10);
                if(buscar.equalsIgnoreCase(con)) {
                    List<Pelicula> lista = listar(nombreArchivo);
                    resultado = String.valueOf(lista.get(indice));
                    bandera = false;
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            throw new LecturaDatosExcepcion("Excepcion al buscar la pelicula");
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosExcepcion {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo correctamente");
        } catch(IOException e) {
            e.printStackTrace(System.out);
            throw new AccesoDatosExcepcion("Excepcion al crear el archivo");
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosExcepcion {
        File archivo = new File(nombreArchivo);
        if(archivo.exists()) {
            archivo.delete();
        }
        System.out.println("Se ha borrado el archivo");
    }

}
