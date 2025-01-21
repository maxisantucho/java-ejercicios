package com.poo;

public class EmpleadoAComision extends Empleado{

    private double salarioMinimo;
    private int cantCliente;
    private double montoPorCliente;

    public EmpleadoAComision(String dni, String nombre, String apellido, int anioIngreso, double salarioMinimo, int cantCliente, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.cantCliente = cantCliente;
        this.montoPorCliente = montoPorCliente;
    }

    public int getCantCliente() {
        return cantCliente;
    }

    @Override
    public double getSalario() {
        double salario = cantCliente * montoPorCliente;
        return  (salario < salarioMinimo) ? salarioMinimo : salario;
    }

}
