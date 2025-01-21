package com.poo;

public class EmpleadoSalarioFijo extends Empleado{

    private static final double PORC_1 = 0.05;
    private static final double PORC_2 = 0.1;
    private static final double ANIO_1 = 2;
    private static final double ANIO_2 = 5;
    private double sueldoBasico;

    public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    private double porcentajeAdicional() {
        int antiguedad = antiguedad();
        double porcentaje = 0;
        if(antiguedad > ANIO_2) {
            porcentaje = PORC_2;
        } else if(antiguedad >= ANIO_1) {
            porcentaje = PORC_1;
        }
        return porcentaje;
    }

    @Override
    public double getSalario() {
        return sueldoBasico + (sueldoBasico * porcentajeAdicional());
    }

}
