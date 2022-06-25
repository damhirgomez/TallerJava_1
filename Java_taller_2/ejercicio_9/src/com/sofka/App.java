package com.sofka;

public class App {
        public static void main(String[] args) {
                calcular.inicio();
                int opcion = Consola.leerEntero();
                switch (opcion) {
                        case 1:
                                calcular.triangulo();
                                break;
                        case 2:
                                calcular.rectangulo();
                                break;
                        case 3:
                                calcular.trapecio();
                                break;
                        default:
                                Consola.escribir("Opcion no valida");
                                break;
                }

        }
}
