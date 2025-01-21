package clases;

import java.util.ArrayList;

public class Alumno implements Aprobable{

    private String dni;
    private String apellido;
    private String nombre;
    private ArrayList<Examen> examenes;

    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.examenes = new ArrayList<>();
        this.apellido = apellido;
        this.dni = dni;
    }

    public void agregarExamen(Examen e) {
        examenes.add(e);
    }

    @Override
    public boolean aprobo() {
        boolean bandera = true;
        int i = 0;
        while(i < examenes.size() && bandera) {
            if(!examenes.get(i).aprobo()) {
                bandera = false;
            }
            i++;
        }
        return bandera;
    }

}
