package com.poo;

public enum PaisSudamericano {

    ARGENTINA, BRASIL, URUGUAY, PARAGUAY, CHILE, ECUADOR, VENEZUELA, COLOMBIA;

    private PaisSudamericano() {

    }

    @Override
    public String toString() {
        return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();
    }
}
