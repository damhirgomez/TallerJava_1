package com.sofka;

public class ArbolNavidad {

    public static void ParteArriba() {
        int i, j, k, n;
        n = 8;
        i = 1;
        j = n + (n / 2);
        k = 1;
        do {
            do {
                Consola.escribirSinSaltar(" ");
                j--;

            } while (j > i);

            do {
                Consola.escribirSinSaltar("*");
                k++;
            } while (k <= 2 * i - 1);
            i++;
            k = 1;
            j = n + (n / 2);
            Consola.escribir("");
        } while (i < n + (n / 2));
    }

    public static void Tallo() {
        int i, j, k, n;
        n = 8;
        i = 2;
        j = n + (n / 2);
        k = n / 2;
        do {
            do {
                Consola.escribirSinSaltar(" ");
                j--;

            } while (j > 2);

            do {
                Consola.escribirSinSaltar("*");
                k++;
            } while (k <= (n / 2) + 2);
            i++;
            j = n + (n / 2);
            k = n / 2;
            Consola.escribir("");
        } while (i < n - (n / 2));

    }

    public static void ParteFinal() {
        int j, k, n;
        n = 8;
        j = n + (n / 2);
        k = n / 2;
        do {
            Consola.escribirSinSaltar(" ");
            j--;
        } while (j > 3);
        do {
            Consola.escribirSinSaltar("*");
            k++;
        } while (k <= (n / 2) + 4);
        Consola.escribir("");
        j = n + (n / 2);
        k = n / 2;
        do {
            Consola.escribirSinSaltar(" ");
            j--;
        } while (j > 4);
        do {
            Consola.escribirSinSaltar("*");
            k++;
        } while (k <= (n / 2) + 6);

    }
}
