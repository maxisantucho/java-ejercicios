package clases;

public class Auto extends Vehiculo {

    private boolean tieneAire;

    public Auto(String marca, String modelo, String patente, boolean tieneAire) {
        super(marca, modelo, patente);
        this.tieneAire = tieneAire;
    }

    public void prenderAire() {
        if(tieneAire) {
            System.out.println("Aire encendido ...");
        }
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
        return super.toString() + "\nAuto{" +
                "tieneAire=" + tieneAire +
                '}';
    }

}
