package clases;

public class Producto {

    private String codigo;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;

    public Producto(String codigo, String nombre, String descripcion, float precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto: " + codigo +
                ", nombre: " + nombre +
                ", descripcion: " + descripcion +
                ", precio: " + precio +
                ", stock: " + stock + "\n";
    }
}
