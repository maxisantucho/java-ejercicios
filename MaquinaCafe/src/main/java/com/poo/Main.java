package com.poo;

public class Main {

    public static void main(String[] args) {

        R101 m1 = new R101();
        M111 m2 = new M111();

        m1.cafe();
        m2.cafe();

        m1.carioca();
        m2.cafeConLeche();

        m2.cafe();

        System.out.println(m1.vasosCafeCarioca());
        System.out.println(m2.vasosCafeConLeche());
        System.out.println(m1.vasosCafe());
        System.out.println(m2.vasosCafe());

    }
}