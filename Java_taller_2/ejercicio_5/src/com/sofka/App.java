package com.sofka;

public class App {
    public static void main(String[] args) {
        usuario.nombre_usuario();
        int opcion = Consola.leerEntero();
        switch (opcion) {
            case 1:
                Consola.escribir("Los productos disponibles son:");
                Consola.escribir("1. Dolex 20mg");
                Consola.escribir("2. Pastillas para el dolor de cabeza");
                Consola.escribir("3. Jarabe para la tos");
                Consola.escribir("Para comprar un producto reinicie el programa y escoja la opcion 2");
                break;
            case 2:
                Consola.escribir("Elija el producto que quiere comprar de los disponibles:");
                Consola.escribir("1. Dolex 20mg $800 c/u");
                Consola.escribir("2. Pastillas para el dolor de cabeza $500 c/u");
                Consola.escribir("3. Jarabe para la tos $12000 c/u");
                int producto = Consola.leerEntero();
                if (producto == 1) {
                    Consola.escribir("El producto que quiere comprar es Dolex 20mg");
                    Consola.escribir("¿Cuantos productos desea comprar?");
                    int cantidad = Consola.leerEntero();
                    Consola.escribir("El total a pagar es: $" + (cantidad * 800));
                } else if (producto == 2) {
                    Consola.escribir("El producto que quiere comprar es Pastillas para el dolor de cabeza");
                    Consola.escribir("¿Cuantos productos desea comprar?");
                    int cantidad = Consola.leerEntero();
                    Consola.escribir("El total a pagar es: $" + (cantidad * 500));
                } else if (producto == 3) {
                    Consola.escribir("El producto que quiere comprar es Jarabe para la tos");
                    Consola.escribir("¿Cuantos productos desea comprar?");
                    int cantidad = Consola.leerEntero();
                    Consola.escribir("El total a pagar es: $" + (cantidad * 12000));
                } else {
                    Consola.escribir("El producto que quiere comprar no esta disponible");
                }
                break;
            case 3:
                String devolver_producto = Consola.leer("Por favor ingrese el nombre del producto que desea devolver");
                Consola.escribir("El producto que desea devolver es: " + devolver_producto);
                break;
            default:
                Consola.escribir("Opción no válida");
                break;
        }

    }

}
