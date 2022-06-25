package com.sofka;

public class App {
    public static void main(String[] args) {

        String[] informacion = new String[5];
        for (int i = 0; i < informacion.length; i++) {
            informacion[i] = Consola.leer("Ingrese un dato");
        }

        for (int i = 0; i < informacion.length; i++) {
            Consola.escribir("[" + i + "]" + " = " + informacion[i]);
        }
    }
}
