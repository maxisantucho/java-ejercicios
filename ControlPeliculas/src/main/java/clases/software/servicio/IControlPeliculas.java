package clases.software.servicio;

public interface IControlPeliculas {

    final String NOMBRE_RECURSO = "peliculas.txt";

    void agregarPelicula(String nombre, String estreno, String duracion, String genero, String nombreDirector);

    void listarPelicula();

    void buscarPelicula(String buscar);

    void iniciarArchivo();

}
