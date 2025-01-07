package com.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    ArrayList<MiembroUniversidad> miembrosUniversidad;

    public Main() {
        this.miembrosUniversidad = new ArrayList<>();
    }

    public static void main(String[] args) {

        Main universidad = new Main();

        universidad.agregarMiembro(new Estudiante("34567833", "Marcelo Martinez", LocalDate.of(1994,4,4), LocalDate.of(2021, 4, 22), Materia.GEOGRAFIA));
        universidad.agregarMiembro(new Profesor("23454323","Mariano Ruggero", LocalDate.of(1985,6,4), LocalDate.of(2003, 2, 3), Carrera.INGENIERIA));
        universidad.agregarMiembro(new Profesor("67909876","Elian Marra", LocalDate.of(1987, 2,24), LocalDate.of(2005, 5, 23), Carrera.LICENCIATURA));
        universidad.agregarMiembro(new Estudiante("54234567","Oscar Rodriguez", LocalDate.of(2000,5,13), LocalDate.of(2021, 9, 12), Materia.CIENCIAS));
        universidad.agregarMiembro(new Estudiante("44567132","Martin Ortiz", LocalDate.of(1999,7,27), LocalDate.of(2020, 12, 1), Materia.MATEMATICA));
        universidad.agregarMiembro(new Estudiante("23346785","Pablo Ruiz", LocalDate.of(1997,4,20), LocalDate.of(2023, 2, 4), Materia.LITERATURA));
        universidad.agregarMiembro(new Profesor("10987654","Gabriel Ochoa", LocalDate.of(1980,3,7), LocalDate.of(2010, 8, 12), Carrera.MAESTRIA));

        universidad.mostrarMiembros();

    }

    public void agregarMiembro(MiembroUniversidad m) {
        miembrosUniversidad.add(m);
    }

    public void mostrarMiembros() {
        for (MiembroUniversidad m : miembrosUniversidad) {
            System.out.println(m);
            System.out.println("");
        }
    }

}