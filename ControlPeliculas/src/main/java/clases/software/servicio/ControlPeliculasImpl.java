package clases.software.servicio;

import clases.software.datos.AccesoDatosImpl;
import clases.software.datos.IAccesoDatos;
import clases.software.domain.Pelicula;
import clases.software.excepciones.AccesoDatosExcepcion;
import clases.software.excepciones.LecturaDatosExcepcion;

import java.util.List;

public class ControlPeliculasImpl implements IControlPeliculas {

    private IAccesoDatos datos;

    public ControlPeliculasImpl() {
        datos = new AccesoDatosImpl();
    }

    public void agregarPelicula(String nombre, String estreno, String duracion, String genero, String nombreDirector) {
        Pelicula pelicula = new Pelicula(nombre, estreno, duracion, genero, nombreDirector);
        boolean anexar = false;
        try {
            anexar = datos.comprobarSiExisteArchivo(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosExcepcion e) {
            System.out.println("Error de acceso a datos");
            e.printStackTrace(System.out);
        }
    }

    public void listarPelicula() {
        try {
            List<Pelicula> peliculas = datos.listar(NOMBRE_RECURSO);
            for (Pelicula p : peliculas) {
                System.out.println(p.mostrarDatos());
            }
        } catch (AccesoDatosExcepcion e) {
            System.out.println("Error de acceso a datos");
            e.printStackTrace(System.out);
        }
    }

    public void buscarPelicula(String buscar) {
        String resultado = "";
        try {
            resultado = datos.buscar(NOMBRE_RECURSO, buscar);
        } catch(AccesoDatosExcepcion e) {
            System.out.println("Error de acceso de datos");
            e.printStackTrace(System.out);
        }
        if(resultado == null) {
            System.out.println("No se ha encontrado la pelicula");
        } else {
            System.out.println(resultado);
        }
    }

    public void iniciarArchivo() {
        try {
            if(datos.comprobarSiExisteArchivo(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                datos.crear(NOMBRE_RECURSO);
            }
        } catch(Exception e) {
            System.out.println("Error al iniciar control de peliculas");
            e.printStackTrace(System.out);
        }
    }

}
