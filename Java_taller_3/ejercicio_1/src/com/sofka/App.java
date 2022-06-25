package com.sofka;

public class App {
    public static void main(String[] args) {
        int control = 10;
        for(int i = 0; i < control; i++) {
            for (int j = 0; j < i; j++) {
                Consola.escribirSinSaltar("*");
            }
            Consola.escribir("");
        }

    }

}
