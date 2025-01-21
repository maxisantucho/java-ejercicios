package com.poo;

import java.util.ArrayList;

public class Main {

    ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {

        Main f = new Main();

        f.agregarEmpleado(new EmpleadoSalarioFijo("123", "Ana", "Lopez", 2021, 45000));
        f.agregarEmpleado(new EmpleadoAComision("123", "Pepe"," Gomez", 2021, 30000, 100, 500));
        f.agregarEmpleado(new EmpleadoSalarioFijo("123", "Luis", "Gamez", 2019, 50000));
        f.agregarEmpleado(new EmpleadoAComision("123", "Leo", "Torres", 2017, 30000, 200, 100));
        f.agregarEmpleado(new EmpleadoSalarioFijo("123", "Maria", "Perez", 2014, 100000));

        f.mostrarSalarios();

        Empleado masClientes = f.empleadoConMasCliente();
        System.out.println("\nEl empleado con mas clientes es:");
        System.out.println(masClientes.nombreCompleto());

    }

    public void mostrarSalarios() {
        for(Empleado empleado : empleados) {
            System.out.println(empleado.nombreCompleto() + ": $" + empleado.getSalario());
        }
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado empleadoConMasCliente() {
        Empleado masClientes = null;
        int contador = -1;
        for (Empleado empleado : empleados) {
            if(empleado instanceof EmpleadoAComision) {
                EmpleadoAComision emc =  (EmpleadoAComision) empleado;
                if(emc.getCantCliente() > contador) {
                    contador = emc.getCantCliente();
                    masClientes = emc;
                }
            }
        }
        return masClientes;
    }

}