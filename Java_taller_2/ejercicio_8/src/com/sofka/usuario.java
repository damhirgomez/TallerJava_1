package com.sofka;

public class usuario {

    public static void nombre_usuario() {
        String nombre = Consola.leer("Bienvenido a la pasteleria por favor ingrese su nombre completo");
        Consola.escribir("Bienvenido " + nombre + " a la pasteleria");
    }

    public static int pasteleria() {
        int precio;
        Consola.escribir("Como desea su torta?");
        Consola.escribir("Los sabores disponibles son: ");
        Consola.escribir("1. Chocolate");
        Consola.escribir("2. Vainilla");
        Consola.escribir("3. Redvelvet");
        String torta = Consola.leer("Escriba el sabor que desea");
        Consola.escribir("Usted ha elegido la torta de " + torta);
        String relleno = Consola.leer("Que rellenos desea? Arequipe, crema de queso, chantilli");
        int porciones = Consola.leerEntero("De cuantas porciones desea su torta?");
        int decoracion = Consola.leerEntero("Desea decorara su torta su torta? 1. Si 2. No");
        if (decoracion == 1) {
            precio = porciones * 5000 + 2000;
            Consola.escribir("Su torta de chocolate con relleno de " + relleno + " y "
                    + porciones + " porciones tiene un precio de " + precio
                    + " pesos");
        } else {
            precio = porciones * 5000;
            Consola.escribir("Su torta de chocolate con relleno de " + relleno + " y "
                    + porciones + " porciones tiene un precio de " + precio
                    + " pesos");
        }
        return precio;
    }
}
