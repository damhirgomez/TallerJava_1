package com.sofka;

public class App {
    public static void main(String[] args) {
        String[][] matriz = { { "01", "02", "03", "04", "05" },
                { "06", "07", "08", "09", "10" },
                { "11", "12", "13", "14", "15" },
                { "16", "17", "18", "19", "20" } };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        Consola.escribir("");

        for (int i = 0; i < matriz.length; i++) {
            if (i == 1 || i == 3) {
                for (int j = matriz.length; j >= 0; j--) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();

            } else {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
