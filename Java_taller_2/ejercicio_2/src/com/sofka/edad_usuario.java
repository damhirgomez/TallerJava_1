package com.sofka;

import java.util.Scanner;

public class edad_usuario {
    public static int edad;

    public static void edad() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt();
        }

    }

    public static void mayor_edad() {
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted aun es un niño");
        }
    }

}
