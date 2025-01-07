package com.poo;

public class R101 extends MaquinaCafe{

    private static final int MAX_CREMA = 600;
    private static final int MAX_CACAO = 300;
    private int crema;
    private int cacao;

    public R101() {
        super();
        this.cacao = MAX_CACAO;
        this.crema = MAX_CACAO;
    }

    public void carioca() {
        cafe();
        crema -= 30;
        cacao -= 10;
    }

    public void recargarCrema() {
        crema = MAX_CREMA;
    }

    public void recargarCacao() {
        cacao = MAX_CACAO;
    }

    public int vasosCafeCarioca() {
        int cafe = vasosCafe();
        int cCrema = (int) crema / 30;
        int cCacao = (int) cacao / 10;
        if(cafe < cCrema) {
            return cCrema;
        } else if (cafe < cCacao){
            return cCacao;
        } else {
            return cafe;
        }
    }

}
