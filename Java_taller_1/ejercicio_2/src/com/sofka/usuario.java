package com.sofka;

import java.util.Scanner;

public class usuario {
    public static String nombre, apellido;
    public static int edad;
    public static float estatura;

    public static void usuario_info() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            nombre = input.nextLine();
            System.out.println("Ingrese su apellido: ");
            apellido = input.nextLine();
            System.out.println("Ingrese su edad: ");
            edad = input.nextInt();
            System.out.println("Ingrese su estatura: ");
            estatura = input.nextFloat();
            System.out.print("Su nombre es: " + nombre + " " + apellido + " Y su edad es: " + edad
                    + " Y su estatura es: " + estatura + "m");
        }
    }

}
