package com.sofka;

public class usuario {

    public static void nombre_usuario() {
        String nombre = Consola.leer("Bienvenido a la drogueria SUBA, ingrese su nombre completo");
        Consola.escribir("Buen día señor(a) " + nombre + "por favor elija un opción");
        Consola.escribir("1. Consultar productos disponibles");
        Consola.escribir("2. Comprar un producto");
        Consola.escribir("3. Hacer una devolución");
    }
}
