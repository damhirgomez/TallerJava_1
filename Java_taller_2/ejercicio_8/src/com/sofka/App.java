package com.sofka;

public class App {
        public static void main(String[] args) {
                int ventas;
                int vender = 0;
                int total_ventas = 0;

                do {
                        usuario.nombre_usuario();
                        ventas = usuario.pasteleria();
                        total_ventas = ventas + total_ventas;
                        vender = Consola.leerEntero("Desea vender otra torta? 1. Si 2. No");
                } while (vender != 2);

                Consola.escribir("El total de las ventas es de " + total_ventas + " pesos");
        }
}
