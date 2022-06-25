package com.sofka;

import java.util.Scanner;

public class usuario {
    public static String nombre_mascota, tipo_mascota, nombre_usuario;
    public static int edad_mascota;

    public static void usuario_info() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            nombre_usuario = input.nextLine();
            System.out.println("Ingrese el nombre de la mascota: ");
            nombre_mascota = input.nextLine();
            System.out.println("Ingrese el tipo de mascota: ");
            tipo_mascota = input.nextLine();
            System.out.println("Ingrese la edad de la mascota: ");
            edad_mascota = input.nextInt();

            System.out.print(nombre_mascota + " es un " + tipo_mascota + ", el cual, tiene " + edad_mascota
                    + " años de edad y " + nombre_usuario + " es su dueño.");
        }
    }

}
