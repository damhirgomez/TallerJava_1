package com.sofka;

public class usuario {

    public static void nombre_usuario() {
        String nombre = Consola.leer("Bienvenido a la secretaria de salud, ¿Cómo te llamas? ");
        int cedula = Consola.leerEntero("Ingrese su cédula: ");
        Consola.escribir("Bienvenido " + nombre + " con cédula " + cedula);
    }
}
