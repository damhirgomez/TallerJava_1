package com.sofka;

public class App {
    public static void main(String[] args) {
        int entrada = Consola.leerEntero("Por favor ingrese el numero del que desea saber la tabla de multiplicar: ");

        for (int i = 1; i <= 10; i++) {
            Consola.escribir(entrada + " X " + i + " = " + (entrada * i));
        }
    }
}
