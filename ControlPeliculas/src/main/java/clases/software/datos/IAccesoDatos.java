package clases.software.datos;

import clases.software.domain.Pelicula;
import clases.software.excepciones.AccesoDatosExcepcion;
import clases.software.excepciones.EscrituraDatosExcepcion;
import clases.software.excepciones.LecturaDatosExcepcion;

import java.util.List;

public interface IAccesoDatos {

    boolean comprobarSiExisteArchivo(String nombreArchivo) throws AccesoDatosExcepcion;

    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosExcepcion;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean axenar) throws EscrituraDatosExcepcion;

    String buscar(String nombreArchivo, String buscar) throws LecturaDatosExcepcion;

    void crear(String nombreArchivo) throws AccesoDatosExcepcion;

    void borrar(String nombreArchivo) throws AccesoDatosExcepcion;

}
