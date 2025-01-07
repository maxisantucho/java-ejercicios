package com.poo;

public abstract class MaquinaCafe {

    protected static final int MAX_CAFE = 1500;
    protected static final int MAX_AGUA = 20000;
    protected int cantCafe;
    protected int cantAgua;

    public MaquinaCafe() {
        this.cantCafe = MAX_CAFE;
        this.cantAgua = MAX_AGUA;
    }

    public void cafe() {
        cantCafe -= 40;
        cantAgua -= 200;
    }

    public void recargarCafe() {
        cantCafe = MAX_CAFE;
    }

    public void recargarAgua() {
        cantAgua = MAX_AGUA;
    }

    public int vasosCafe() {
        int cafe = (int) cantCafe / 40;
        int agua = (int) cantAgua / 200;
        if(cafe < agua) {
            return cafe;
        } else {
            return agua;
        }
    }

}
