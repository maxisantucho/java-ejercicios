package com.poo;

public class Planta {

    private Empleado[] t;
    private int cantidad;

    public Planta(int max) {
        this.t = new Empleado[max];
    }

    public void alta(Empleado e) {
        t[cantidad] = e;
        cantidad++;
    }

    public int cantidadEmpleados() {
        return t.length;
    }

    public boolean existeEmpleado(Empleado e) {
        boolean esta = false;
        int i = 0;
        while(i < cantidadEmpleados() && !esta) {
            if(t[i] == e) {
                esta = true;
            }
            i++;
        }
        return esta;
    }

}
