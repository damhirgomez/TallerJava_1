package com.sofka;

public class Cursos {

    private Usuarios[] usuario;

    public Cursos() {
        usuario = new Usuarios[8];
    }

    public void agregarUsuario(Usuarios a) {

        if (existeUsuario(a)) {
            Consola.escribir("El usuario ya existe con este nombre");
        } else {
            Boolean EsIgual = false;
            for (int i = 0; i < usuario.length && !EsIgual; i++) {
                if (usuario[i] == null) {
                    usuario[i] = a;
                    EsIgual = true;
                }
            }
            if (EsIgual) {
                Consola.escribir("Usuario agregado");
            } else {
                Consola.escribir("No existe espacio para otro Usuario");
            }

        }
    }

    public Boolean existeUsuario(Usuarios a) {
        Boolean Existe = false;
        for (int i = 0; i < usuario.length && !Existe; i++) {
            if (usuario[i] != null) {
                if (usuario[i].getNombre().equals(a.getNombre())) {
                    Existe = true;
                }
            }
        }
        return Existe;
    }

    public void UsuariosAprobados() {
        for (int i = 0; i < usuario.length; i++) {
            if (usuario[i] != null) {
                if (usuario[i].getIngreso() == true) {
                    if (usuario[i].getResultado() == true) {
                        Consola.escribir("El usuario " + usuario[i].getNombre() + " aprobó el curso");
                    } else {
                        Consola.escribir("El usuario " + usuario[i].getNombre() + " presento el curso pero no aprobó");
                    }
                } else {
                    Consola.escribir("El usuario " + usuario[i].getNombre() + " no ha presentado el curso");
                }
            }
        }
    }

    public void eliminarUsuario(String nombre) {
        Boolean encontro = false;
        for (int i = 0; i < usuario.length && !encontro; i++) {
            if (usuario[i] != null) {
                if (usuario[i].getNombre().equals(nombre)) {
                    usuario[i] = null;
                    Consola.escribir("Usuario eliminado");
                    encontro = true;
                }
            }
        }
    }

}
