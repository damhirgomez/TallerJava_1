package com.sofka;

public class Tablas {
    int[][] tabla = new int[11][11];

    public void llenarTabla() {
        for (int i = 1; i < tabla.length; i++) {
            for (int j = 1; j < tabla[i].length; j++) {
                tabla[i][j] = i * j;
            }
        }
    }

    public void imprimirTabla() {
        for (int i = 1; i < tabla.length; i++) {
            for (int j = 1; j < tabla[i].length; j++) {
                Consola.escribirSinSaltar(i + " x " + j);
                Consola.escribirSinSaltar(" ");
            }
            System.out.println();
        }
    }

    public void ResultadoTabla(int fila, int columna) {
        Consola.escribir("El resultado de la tabla es: " + tabla[fila][columna]);
    }
}
