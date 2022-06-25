package com.sofka;

import java.util.Scanner;

public class nombre_apellido {
    public static String nombre;

    public static void nombre() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese su apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Su nombre es: " + nombre + " " + "Su apellido es: " + apellido);

        }

    }

}
