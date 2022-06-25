package com.sofka;

public class App {
    public static void main(String[] args) {

        Boolean salir = false;
        String nombre;
        String ingreso;
        Boolean presento;
        String paso;
        Boolean aprobo;
        Usuarios a;
        Cursos curso = new Cursos();
        int opcion;

        while (!salir) {
            Consola.escribir("1. Agregar usuario");
            Consola.escribir("2. Consultar usuarios del curso");
            Consola.escribir("3. Eliminar usuario");
            Consola.escribir("4. Salir");
            opcion = Consola.leerEntero("Ingrese una opcion: ");

            switch (opcion) {
                case 1:
                    nombre = Consola.leer("Ingrese el nombre del estudiante: ");
                    ingreso = Consola.leer("Ingrese si el estudiante ha presentado el curso (si/no): ");
                    if (ingreso.equalsIgnoreCase("si")) {
                        presento = true;
                    } else {
                        presento = false;
                    }
                    paso = Consola.leer("Ingrese si el estudiante aprobó el curso (si/no): ");
                    if (paso.equalsIgnoreCase("si")) {
                        aprobo = true;
                    } else {
                        aprobo = false;
                    }
                    a = new Usuarios(nombre, presento, aprobo);
                    curso.agregarUsuario(a);
                    break;

                case 2:
                    curso.UsuariosAprobados();

                    break;
                case 3:
                    nombre = Consola.leer("Ingrese el nombre del estudiante: ");
                    curso.eliminarUsuario(nombre);
                    break;
                case 4:
                    salir = true;
                    break;

                default:
                    Consola.escribir("Opcion incorrecta");
                    break;
            }
        }

    }
}
