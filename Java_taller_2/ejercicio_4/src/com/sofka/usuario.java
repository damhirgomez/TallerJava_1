package com.sofka;

public class usuario {

    public static void nombre_usuario() {
        String nombre = Consola.leer("Bienvenido a la video tienda el Porvenir, ingrese su nombre completo");
        Consola.escribir("Buen día señor(a) " + nombre + "por favor elija un opción");
        Consola.escribir("1. Ver peliculas disponibles");
        Consola.escribir("2. Entregar una pelicula");
        Consola.escribir("3. Reportar una novedad sobre su pelicula");
    }
}
