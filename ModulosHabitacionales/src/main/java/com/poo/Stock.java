package com.poo;

public class Stock {

    private Modulo t[];
    private int cantidad;

    public Stock(int max) {
        this.t = new Modulo[max];
    }

    public void alta(Modulo e) {
        t[cantidad] = e;
        cantidad++;
    }

    public void baja(Modulo cod) {

    }

    public int cantModulos() {
        return cantidad;
    }

    public boolean estaLlena() {
        return cantidad == t.length;
    }

    public boolean estaModulo(int cod) {
        boolean esta = false;
        int i = 0;
        while(!esta && i < cantModulos()) {
            if(t[i].obtenerCodigo() == cod) {
                esta = true;
            }
            i++;
        }
        return esta;
    }

    public float valorTotal(float p) {
        float v = 0;
        for (int i = 0; i < cantModulos(); i++) {
            v += t[i].obtenerUnidades() * t[i].obtenerPrecioUnitario(p);
        }
        return v;
    }

}
