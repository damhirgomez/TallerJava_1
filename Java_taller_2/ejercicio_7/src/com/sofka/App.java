package com.sofka;

public class App {
        public static void main(String[] args) {
                usuario.nombre_usuario();
                int peso = Consola.leerEntero("Ingrese su peso: ");
                double estatura = Consola.leerDouble("Ingrese su estatura: ");
                double imc = peso / (estatura * estatura);
                if (imc < 18.5) {
                        Consola.escribir("Su imc es: " + imc + " y está en bajo peso");
                } else if (imc >= 18.5 && imc <= 24.9) {
                        Consola.escribir("Su imc es: " + imc + " y está en peso normal");
                } else if (imc >= 25 && imc <= 29.9) {
                        Consola.escribir("Su imc es: " + imc + " y está en sobrepeso");
                } else if (imc >= 30 && imc <= 34.9) {
                        Consola.escribir("Su imc es: " + imc + " y está en obesidad grado 1");
                } else if (imc >= 35 && imc <= 39.9) {
                        Consola.escribir("Su imc es: " + imc + " y está en obesidad grado 2");
                } else {
                        Consola.escribir("Su imc es: " + imc + " y está en obesidad grado 3");
                }
        }
}
