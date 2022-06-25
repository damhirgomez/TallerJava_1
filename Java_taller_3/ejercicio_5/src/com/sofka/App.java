package com.sofka;

public class App {
    public static void main(String[] args) {

        int opcion = 0;
        do {
            Consola.escribir("Menu principal");
            Consola.escribir("1. Capturar nombre");
            Consola.escribir("2. Saludar");
            Consola.escribir("3. Salir");
            opcion = Consola.leerEntero("Por favor escoja una opcion: ");
            switch (opcion) {
                case 1:
                    Usuario.setNombre();
                    break;
                case 2:
                    Consola.escribir("Hola " + Usuario.nombre);
                    break;
                case 3:
                    Consola.escribir("Gracias por usar nuestra aplicacion");
                    break;
                default:
                    Consola.escribir("Opcion no valida");
                    break;
            }

        } while (opcion != 3);

    }
}
