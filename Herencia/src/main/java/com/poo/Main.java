package com.poo;

public class Main {


    public static void main(String[] args) {

        Robot r1 = new Coach("Juan");
        Robot r2 = new FactoryKeeper("Pablo");

        r1.despertar();

        System.out.println(r1);
        System.out.println();
        System.out.println(r2);
        System.out.println();

        r1.ordenes("Haga la cena");
        r1.ordenes("Haga la cama");
        r2.ordenes("Corta el pasto");
        r2.despertar();
        r2.ordenes("Saca la basura");
        r1.ordenes("Ordena la casa");
        r1.ordenes("Lava la ropa");
        System.out.println();

        System.out.println(r1);
        System.out.println();
        System.out.println(r2);
        System.out.println();
        r1.recargar();
        System.out.println(r1);
        System.out.println();
        System.out.println(r2);
        
    }
}