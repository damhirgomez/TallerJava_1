package com.sofka;

import java.util.Scanner;

public class usuario {
    public static String pais, capital;

    public static void usuario_info() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre de la ciudad: ");
            capital = input.nextLine();
            System.out.println("Ingrese el nombre del país: ");
            pais = input.nextLine();

            System.out.print(capital + " es la capital de " + pais + ". ");
        }
    }

}
