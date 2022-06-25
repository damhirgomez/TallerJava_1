package com.sofka;

public class App {
        public static void main(String[] args) {
                CuentaAhorro cuenta = new CuentaAhorro(0000, 0000, "nulo");
                String nombre = Consola.leer("Bienvenido al banco fiel, ingrese su nombre completo");
                Consola.escribir("Bienvenido " + nombre + " al banco fiel" + "a continuacion crearemos su cuenta");
                nombre = cuenta.nombre;
                int numero_cuenta = Consola.leerEntero("Ingrese el numero de cuenta");
                cuenta.numero_cuenta = numero_cuenta;
                int saldo = Consola.leerEntero("Ingrese el saldo");
                cuenta.saldo = saldo;
                Consola.escribir("Su cuenta de ahorro " + cuenta.numero_cuenta + " a nombre de " + cuenta.nombre
                                + " ha sido creada");
                int opcion = Consola.leerEntero("Ingrese una opcion: 1.Depositar 2.Retirar 3.Consultar saldo 4.Salir");
                switch (opcion) {
                        case 1:
                                int monto = Consola.leerEntero("Ingrese el monto a depositar");
                                cuenta.depositar(monto);
                                break;
                        case 2:
                                int retiro = Consola.leerEntero("Ingrese el monto a retirar");
                                cuenta.retirar(retiro);
                                break;
                        case 3:
                                cuenta.mostrar_saldo();
                                break;
                        case 4:
                                Consola.escribir("Gracias por utilizar nuestro banco fiel");
                                break;
                        default:
                                Consola.escribir("Opcion no valida");
                }
        }
}
