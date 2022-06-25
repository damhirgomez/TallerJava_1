package com.sofka;

public class App {
    public static void main(String[] args) {
        int control_1 = 10;
        int control_2 = 1;
        int control_3 = 1;
        while (control_3 <= 10) {
            while (control_1 >= control_3) {
                Consola.escribirSinSaltar(" ");
                control_1 = control_1 - 1;
            }
            while (control_2 <= control_3) {
                Consola.escribirSinSaltar("*");
                control_2 = control_2 + 1;
            }
            Consola.escribir("");
            control_3 = control_3 + 1;
            control_1 = 10;
            control_2 = 1;
        }
    }
}
