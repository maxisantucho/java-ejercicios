package com.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = 10, y, z;
        System.out.println("Dividir");
        Scanner sc = new Scanner(System.in);
        z = Integer.parseInt(sc.nextLine());
        try {
            y = x / z;
            System.out.println("Resultado " + y);
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Adios");

    }
}