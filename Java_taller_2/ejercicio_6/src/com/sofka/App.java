package com.sofka;

public class App {
    public static void main(String[] args) {
        usuario.nombre_usuario();
        int opcion = Consola.leerEntero("Ingrese una opción");
        switch (opcion) {
            case 1:
                Consola.escribir("Usted eligio ingreso para reparación");
                String marca_moto = Consola.leer("Por favor ingrese la marca de su moto");
                String placa_moto = Consola.leer("Por favor ingrese la placa de su moto");
                String dano_moto = Consola.leer("Por favor ingrese el daño de su moto");
                Consola.escribir("La marca de su moto es " + marca_moto + " y su placa es " + placa_moto
                        + " y entrara al taller por el daño " + dano_moto);
                break;
            case 2:
                Consola.escribir("Usted eligio salida del taller");
                String novedaes_mecanico = Consola
                        .leer("Describa las novedades del mecánico para el arreglo de la moto");
                String repuesto = Consola
                        .leer("Describa los repuestos que le fue suministrado para el arreglo de la moto");
                String inventario = Consola.leer(
                        "Desea agregar al inventario los repuestos suministrados responda si o no segun corresponda");
                if (inventario == "si") {
                    Consola.escribir(
                            "Su motocicleta esta lista para salida del taller, le agradecemos su atención, le informamos que su motocicleta tiene el siguiente arreglo: "
                                    + novedaes_mecanico + " y los repuestos suministrados son: " + repuesto
                                    + " y los repuestos fueron agregados al inventario");
                } else {
                    Consola.escribir(
                            "Su motocicleta esta lista para salida del taller, le agradecemos su atención, le informamos que su motocicleta tiene el siguiente arreglo: "
                                    + novedaes_mecanico + " y los repuestos suministrados son: " + repuesto
                                    + " y los repuestos no fueron agregados al inventario");
                }

                break;
            default:
                Consola.escribir("Opción inválida");
                break;
        }
    }

}
