package com.sofka;

import java.util.Scanner;

public class usuario {
    public static int edad;
    public static String nombre;

    public static void edad_nombres() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese su nombre completo: ");
            nombre = sc.nextLine();
        }

    }

    public static void mayor_edad() {
        if (edad >= 18) {
            System.out.println(nombre + " usted es mayor de edad, por lo tanto puede ingresar a la fiesta");
        } else {
            System.out.println(nombre + " usted es menor de edad, por lo tanto no puede ingresar a la fiesta");
        }
    }

}
