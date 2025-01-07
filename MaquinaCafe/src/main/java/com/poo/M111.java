package com.poo;

public class M111 extends MaquinaCafe{

    private static final int MAX_LECHE = 600;
    private int leche;

    public M111() {
        super();
        this.leche = MAX_LECHE;
    }

    public void cafeConLeche() {
        cafe();
        leche -= 20;
    }

    public void recargarLeche() {
        recargarCafe();
        recargarAgua();
        leche = MAX_LECHE;
    }

    public int vasosCafeConLeche(){
        int cafe = vasosCafe();
        int cLeche = (int) leche / 20;
        if(cafe < cLeche) {
            return cafe;
        } else {
            return cLeche;
        }
    }

}
