package com.poo;

import java.time.LocalDate;

public class Estudiante extends MiembroUniversidad{

    private Materia materia;

    public Estudiante(String dni, String nombreApellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, Materia materia) {
        super(dni, nombreApellido, fechaNacimiento, fechaIngreso);
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEstudiante" +
                "\nMateria: " + materia;
    }

}
