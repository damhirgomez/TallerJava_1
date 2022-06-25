package com.sofka;

import java.util.Scanner;

public class Consola {

    private static Scanner input = new Scanner(System.in);

    private Consola() {
    } // Anula la creación de objetos de tipo 'Consola'

    /**
     * Imprime un objeto en la consola y salta una línea
     *
     * @param x El objeto a ser impreso.
     */
    public static void escribir(Object x) {
        System.out.println(x);
    }

    /**
     * Imprime un objeto en la consola sin saltar de línea
     *
     * @param x El objeto a ser impreso.
     */
    public static void escribirSinSaltar(Object x) {
        System.out.print(x);
    }

    /**
     * Retorna un dato colocado por el usuario en la consola como String
     *
     * @return El dato colocado por el usuario en la consola como String
     */
    public static String leer() {
        return input.nextLine();
    }

    /**
     * Muestra al usuario un mensaje y luego retorna un dato colocado por el
     * usuario en la consola como String
     *
     * @param mensaje El mensaje que el usuario verá antes de ingresar un dato.
     * @return El dato colocado por el usuario en la consola como String
     */
    public static String leer(String mensaje) {
        Consola.escribir(mensaje);
        return input.nextLine();
    }

    /**
     * Muestra al usuario un mensaje y luego retorna un dato colocado por el
     * usuario en la consola como entero
     *
     * @return El dato colocado por el usuario en la consola como entero
     * @throws NumberFormatException si el dato ingresado no representa un
     *                               entero.
     */
    public static int leerEntero() {
        return Integer.parseInt(Consola.leer());
    }

    /**
     * Muestra al usuario un mensaje y luego retorna un dato colocado por el
     * usuario en la consola como entero
     *
     * @param mensaje El mensaje que el usuario verá antes de ingresar un dato.
     * @return El dato colocado por el usuario en la consola como entero
     * @throws NumberFormatException si el dato ingresado no representa un
     *                               entero.
     */
    public static int leerEntero(String mensaje) {
        return Integer.parseInt(Consola.leer(mensaje));
    }

    public static double leerDouble() {
        return Double.parseDouble(Consola.leer());
    }

    public static double leerDouble(String mensaje) {
        return Double.parseDouble(Consola.leer(mensaje));
    }
}
