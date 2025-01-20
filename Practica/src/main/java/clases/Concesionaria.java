package clases;

import java.util.ArrayList;

public class Concesionaria {

    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void mostrarVehiculo() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }

}
