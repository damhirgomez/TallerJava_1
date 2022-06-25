package com.sofka;

import java.util.Scanner;

public class usuario {
    public static String nombre, apellido;

    public static void usuario_info() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            nombre = input.nextLine();
            System.out.println("Ingrese su apellido: ");
            apellido = input.nextLine();
            System.out.println(" Ingrese el nombre de su madre: ");
            String madre = input.nextLine();
            System.out.println(" Ingrese el apellido de su madre: ");
            String madre_apellido = input.nextLine();
            System.out.println(" Ingrese el nombre de su padre: ");
            String padre = input.nextLine();
            System.out.println(" Ingrese el apellido de su padre: ");
            String padre_apellido = input.nextLine();

            System.out.print("Yo: " + nombre + " " + apellido + " " + ", soy hijo de " + padre + " " + padre_apellido
                    + " y de " + madre + " " + madre_apellido);
        }
    }

}
