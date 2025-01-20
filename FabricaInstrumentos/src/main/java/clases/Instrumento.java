package clases;

public class Instrumento {

    private String id;
    private double precio;
    private TipoInstrumento tipo;

    public Instrumento(String id, double precio, TipoInstrumento tipo) {
        this.id = id;
        this.precio = precio;
        this.tipo = tipo;
    }

    public TipoInstrumento getTipoInstrumento() {
        return tipo;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "id='" + id + '\'' +
                ", precio=" + precio +
                ", tipo=" + tipo +
                '}';
    }
}
