package clases;

import java.util.ArrayList;

public class BarajaInglesa {

    ArrayList<Carta> cartas;

    public BarajaInglesa() {
        this.cartas = new ArrayList<>();
        generarBaraja();
    }

    public void mostrarBajara() {
        for (Carta carta : cartas) {
            carta.darVuelta();
            carta.mostrar();
        }
    }

    private void generarBaraja() {
        generarCartaNumerales();
        generarCartaFigura();
        generarCartaJoker();
    }

    private void generarCartaNumerales() {
        final int MIN_VALUE = 2;
        final int MAX_VALUE = 10;
        Palo[] palos = Palo.values();
        for(int p = 0; p < palos.length; p++) {
            Palo paloActual = palos[p];
            for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
                cartas.add(new CartaNumeral(i, paloActual));
            }
        }
    }

    private void generarCartaFigura() {
        char[] letras = {'A', 'J', 'Q', 'K'};
        Palo[] palos = Palo.values();
        for(int p = 0; p < palos.length; p++) {
            Palo paloActual = palos[p];
            for (int i = 0; i < letras.length; i++) {
                char letraActual = letras[p];
                cartas.add(new CartaFigura(letraActual, paloActual));
            }
        }
    }

    private void generarCartaJoker() {
        cartas.add(new CartaJoker(true));
        cartas.add(new CartaJoker(false));
    }

}
