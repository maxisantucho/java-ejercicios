package com.poo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1 * 1000);
                System.out.println(i + 1);
            } catch(Exception e) {
                System.out.println("Fallo");
            }
        }

    }
}