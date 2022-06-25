package com.sofka;

public class App {
    public static void main(String[] args) {
        Tablas tabla = new Tablas();

        tabla.imprimirTabla();
        tabla.llenarTabla();
        int numero1 = Consola.leerEntero("Ingrese el primer numero");
        int numero2 = Consola.leerEntero("Ingrese el segundo numero");
        tabla.ResultadoTabla(numero1, numero2);
    }
}
