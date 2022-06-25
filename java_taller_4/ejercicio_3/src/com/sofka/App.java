package com.sofka;

public class App {
    public static void main(String[] args) {
        int cantidad = 100;
        for (int x = 2; x <= cantidad; x++) {
            if (esPrimo(x)) {
                Consola.escribirSinSaltar(x + ",");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;

    }
}
