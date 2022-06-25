package com.sofka;

public class App {
    public static void main(String[] args) {
        Boolean salir = false;
        int opcion;
        Agenda agendaTelefono = new Agenda();
        Contacto a;
        String nombre, organizacion;
        int telefono;

        while (!salir) {
            Consola.escribir("1. Agregar contacto");
            Consola.escribir("2. Buscar contacto por nombre");
            Consola.escribir("3. Buscar contacto por numero");
            Consola.escribir("4. Eliminar contacto");
            Consola.escribir("5. Salir");
            opcion = Consola.leerEntero("Ingrese una opcion: ");

            switch (opcion) {
                case 1:
                    nombre = Consola.leer("Ingrese el nombre del contacto: ");
                    organizacion = Consola.leer("Ingrese la organizacion del contacto: ");
                    telefono = Consola.leerEntero("Ingrese el telefono del contacto: ");
                    a = new Contacto(nombre, organizacion, telefono);
                    agendaTelefono.agregarContacto(a);
                    break;
                case 2:
                    nombre = Consola.leer("Ingrese el nombre del contacto: ");
                    agendaTelefono.BuscarContactoNombre(nombre);
                    break;
                case 3:
                    telefono = Consola.leerEntero("Ingrese el telefono del contacto: ");
                    agendaTelefono.BuscarContactoTelefono(telefono);
                    break;
                case 4:
                    nombre = Consola.leer("Ingrese el nombre del contacto: ");
                    agendaTelefono.EliminarContacto(nombre);
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
