package com.sofka;

public class App {
    public static void main(String[] args) {
        usuario.nombre_usuario();
        int opcion = Consola.leerEntero();
        switch (opcion) {
            case 1:
                Consola.escribir("Ha elegido ver peliculas disponibles, las opciones son: ");
                Consola.escribir("1. El aro");
                Consola.escribir("2. La vida es bella");
                Consola.escribir("3. Toy story");
                int opcion_pelicula = Consola.leerEntero();
                if (opcion_pelicula == 1) {
                    Consola.escribir("Ha elegido El aro");
                } else if (opcion_pelicula == 2) {
                    Consola.escribir("Ha elegido La vida es bella");
                } else if (opcion_pelicula == 3) {
                    Consola.escribir("Ha elegido Toy story");
                } else {
                    Consola.escribir("Ha elegido una opcion no valida");
                }
                break;
            case 2:
                Consola.escribir("Entregar una pelicula");
                String nombre_pelicula = Consola.leer("Por favor ingrese el nombre de la pelicula a entregar");
                String estado_pelicula = Consola.leer(
                        "Indique la palabra si, si la pelicula esta en buen estado o la palabra no, si la pelicula esta en mal estado");
                if (estado_pelicula.equals("si")) {
                    Consola.escribir("La pelicula " + nombre_pelicula + " esta en buen estado");
                } else if (estado_pelicula.equals("no")) {
                    Consola.escribir("La pelicula " + nombre_pelicula + " esta en mal estado, debera pagar una multa");
                } else {
                    Consola.escribir("Ha elegido una opcion no valida");
                }
                break;
            case 3:
                String novedad_pelicula = Consola.leer("Reportar una novedad sobre su pelicula");
                Consola.escribir(
                        "Una persona se comunicara con ud para resolver la novedad (" + novedad_pelicula + ")");
                break;
            default:
                Consola.escribir("Opción no válida");
                break;
        }

    }

}
