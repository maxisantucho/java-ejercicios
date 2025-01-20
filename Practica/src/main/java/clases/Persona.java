package clases;

public class Persona {

    private String nombre;
    private String apellido;
    private NivelEstudio nivel;

    public Persona(String nombre, String apellido, NivelEstudio nivel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nivel=" + nivel.toString().substring(0, 1).toUpperCase() + nivel.toString().substring(1).toLowerCase() +
                '}';
    }
}
