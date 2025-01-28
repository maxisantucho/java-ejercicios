package clases.software.domain;

public class Pelicula {

    private String nombre;
    private String estreno;
    private String duracion;
    private String genero;
    private String nombreDirector;

    public Pelicula(String nombre, String estreno, String duracion, String genero, String nombreDirector) {
        this.nombre = nombre;
        this.estreno = estreno;
        this.duracion = duracion;
        this.genero = genero;
        this.nombreDirector = nombreDirector;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Pelicula: " + nombre +
                ", estreno: " + estreno +
                ", duracion: " + duracion +
                ", genero: " + genero +
                ", director: " + nombreDirector + "\n";
    }

    public String mostrarDatos() {
        return nombre + ", " + estreno + ", " + duracion + ", " + genero + ", " + nombreDirector + "\n";
    }

}
