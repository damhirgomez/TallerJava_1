package com.sofka;

public class calcular {

    public static void inicio() {
        Consola.escribir("Ingrese a que tipo de figura le desea calcular el area: ");
        Consola.escribir("1. Triangulo");
        Consola.escribir("2. Rectangulo");
        Consola.escribir("3. Trapecio");

    }

    public static void triangulo() {
        double base = Consola.leerDouble("Ingrese la base del triangulo: ");
        double altura = Consola.leerDouble("Ingrese la altura del triangulo: ");
        double area = (base * altura) / 2;
        Consola.escribir("El area del triangulo es: " + area);
    }

    public static void rectangulo() {
        double base = Consola.leerDouble("Ingrese la base del rectangulo: ");
        double altura = Consola.leerDouble("Ingrese la altura del rectangulo: ");
        double area = base * altura;
        Consola.escribir("El area del rectangulo es: " + area);
    }

    public static void trapecio() {
        double base1 = Consola.leerDouble("Ingrese la base del trapecio: ");
        double base2 = Consola.leerDouble("Ingrese la base del trapecio: ");
        double altura = Consola.leerDouble("Ingrese la altura del trapecio: ");
        double area = ((base1 + base2) * altura) / 2;
        Consola.escribir("El area del trapecio es: " + area);
    }
}
