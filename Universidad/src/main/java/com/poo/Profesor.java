package com.poo;

import java.time.LocalDate;

public class Profesor extends MiembroUniversidad{

    private Carrera carrera;

    public Profesor(String dni, String nombreApellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, Carrera carrera) {
        super(dni, nombreApellido, fechaNacimiento, fechaIngreso);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfesor" +
                "\nCarrera: " + carrera;
    }
}
