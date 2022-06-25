package com.sofka;

import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        int var = 0;
        Random Rand = new Random();
        int[] numerosArray = new int[20];
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();

        for (int i = 0; i < numerosArray.length; i++) {
            numerosArray[i] = Rand.nextInt(100);
        }

        while (var < numerosArray.length) {
            if (numerosArray[var] % 2 == 0) {
                pares.add(numerosArray[var]);
            } else {
                impares.add(numerosArray[var]);
            }
            var++;
        }
        Consola.escribir("Los numeros pares son: " + pares);
        Consola.escribir("Los numeros impares son: " + impares);

    }
}
