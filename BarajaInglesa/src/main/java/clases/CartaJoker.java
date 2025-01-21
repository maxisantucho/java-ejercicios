package clases;

public class CartaJoker extends Carta {

    private boolean aColor;

    public CartaJoker(boolean aColor) {
        this.aColor = aColor;
    }

    @Override
    public String getRepresentacion() {
        return "Joker " + (aColor ? "a colores" : "blanco y negro");
    }

}
