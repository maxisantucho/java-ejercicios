package clases;

public class Moto extends Vehiculo {

    private int anchoDeManubrio;

    public Moto(String marca, String modelo, String patente, int anchoDeManubrio) {
        super(marca, modelo, patente);
        this.anchoDeManubrio = anchoDeManubrio;
    }

    public void hacerWheelie() {
        System.out.println("Haciendo wheelie ...");
    }

    @Override
    public void acelera() {

    }

    @Override
    public void frenar() {

    }

    @Override
    public void encender() {

    }

    @Override
    public String toString() {
        return super.toString() + "\nMoto{" +
                "anchoDeManubrio=" + anchoDeManubrio +
                '}';
    }
}
