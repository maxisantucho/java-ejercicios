package com.poo;

import java.util.ArrayList;
import java.util.Random;

public class Sorteador <T> {

    private ArrayList<T> elementos;
    private Random random;

    public Sorteador() {
        this.elementos = new ArrayList<>();
        this.random = new Random();
    }

    public void add(T elemento) {
        elementos.add(elemento);
    }

    public T get() throws NoSuchFieldException {
        checkEmptyness();
        return elementos.get(rnd());
    }

    public T remove() throws NoSuchFieldException {
        checkEmptyness();
        return elementos.remove(rnd());
    }

    private void checkEmptyness() throws NoSuchFieldException {
        if(isEmpty()) {
            throw new NoSuchFieldException("No hay mas elementos en el sorteador");
        }
    }

    private int rnd() {
        return random.nextInt(elementos.size());
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

}
