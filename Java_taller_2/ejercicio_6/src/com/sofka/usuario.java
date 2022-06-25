package com.sofka;

public class usuario {

    public static void nombre_usuario() {
        String nombre = Consola.leer("Bienvenido al taller El Maquinista, por favor ingrese su nombre completo");
        Consola.escribir("Buen día señor(a) " + nombre + "por favor elija un opción");
        Consola.escribir("1. Ingreso para reparación");
        Consola.escribir("2. Salida del taller");
    }
}
