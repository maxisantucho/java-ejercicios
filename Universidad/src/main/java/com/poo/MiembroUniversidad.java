package com.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MiembroUniversidad {

    private String nombreApellido;
    private String dni;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;

    public MiembroUniversidad(String dni, String nombreApellido, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "MiembroUniversidad: " + nombreApellido +
                "\nDNI: " + dni +
                "\nFecha de nacimiento: " + fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                "\nFecha de ingreso: " + fechaIngreso.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}
