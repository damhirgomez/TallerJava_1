package com.sofka;

public class App {
    public static void main(String[] args) {

        Boolean salir = false;
        int opcion;
        Taller vehiculosTaller = new Taller();
        Usuario a;
        String nombre, marca, placa;
        int telefono;

        while (!salir) {
            Consola.escribir("1. Agregar vehiculo");
            Consola.escribir("2. Buscar vehiculo por nombre de usuario");
            Consola.escribir("3. Buscar vehiculo por placa");
            Consola.escribir("4. Eliminar contacto");
            Consola.escribir("5. Salir");
            opcion = Consola.leerEntero("Ingrese una opcion: ");

            switch (opcion) {
                case 1:
                    nombre = Consola.leer("Ingrese el nombre del contacto: ");
                    telefono = Consola.leerEntero("Ingrese el telefono del contacto: ");
                    marca = Consola.leer("Ingrese la marca del vehiculo: ");
                    placa = Consola.leer("Ingrese la placa del vehiculo: ");
                    a = new Usuario(nombre, telefono, marca, placa);
                    vehiculosTaller.agregarVehiculo(a);
                    break;

                case 2:
                    nombre = Consola.leer("Ingrese el nombre del usuario que ingreso el vehiculo: ");
                    vehiculosTaller.BuscarUsuarioNombre(nombre);
                    break;
                case 3:
                    placa = Consola.leer("Ingrese la placa del vehiculo: ");
                    vehiculosTaller.BuscarVehiculoPlaca(placa);
                    break;
                case 4:
                    placa = Consola.leer("Ingrese la placa del vehiculo que desea eliminar: ");
                    vehiculosTaller.RetirarVehiculo(placa);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    Consola.escribir("Opcion incorrecta");
                    break;
            }
        }

    }
}
