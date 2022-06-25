package com.sofka;

public class CuentaAhorro {
    public int numero_cuenta = 0;
    public int saldo = 0;
    public String nombre = "";

    public CuentaAhorro(int NumeroCuenta, int valor, String cliente) {
        numero_cuenta = NumeroCuenta;
        saldo = valor;
        nombre = cliente;
    }

    public int getNumeroCuenta() {
        return numero_cuenta;
    }

    public void depositar(int monto) {
        if (monto > 0) {
            saldo += monto;
            Consola.escribir("Su deposito de " + monto + " ha sido realizado y su saldo es de " + saldo);
        } else {
            Consola.escribir("El monto a depositar debe ser mayor a 0");
        }
    }

    public void retirar(int monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
                Consola.escribir("Su retiro de " + monto + " ha sido realizado");
            } else {
                Consola.escribir("El monto a retirar debe ser menor o igual al saldo");
            }
        } else {
            Consola.escribir("El monto a retirar debe ser mayor a 0");
        }
    }

    public void mostrar_saldo() {
        Consola.escribir("Su saldo es: " + saldo);
    }

    public void consultar_saldo() {
    }
}
