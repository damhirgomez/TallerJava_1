package com.sofka;

public class Agenda {

    private Contacto[] contactos;

    public Agenda() {
        contactos = new Contacto[3];
    }

    public void agregarContacto(Contacto a) {

        if (ExisteContacto(a)) {
            Consola.escribir("El contacto ya existe, con este numero o nombre");
        } else {
            Boolean EsIgual = false;
            for (int i = 0; i < contactos.length && !EsIgual; i++) {
                if (contactos[i] == null) {
                    contactos[i] = a;
                    EsIgual = true;
                }
            }
            if (EsIgual) {
                Consola.escribir("Contacto agregado");
            } else {
                Consola.escribir("No existe espacio para otro contacto");
            }

        }
    }

    public Boolean ExisteContacto(Contacto a) {
        Boolean Existe = false;
        for (int i = 0; i < contactos.length && !Existe; i++) {
            if (contactos[i] != null) {
                if (contactos[i].equals(a)) {
                    Existe = true;
                }
            }
        }
        return Existe;
    }

    public void BuscarContactoNombre(String nombre) {
        Boolean ContactoEncontrado = false;
        for (int i = 0; i < contactos.length && !ContactoEncontrado; i++) {
            if (contactos[i] != null) {
                if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                    Consola.escribir("El contacto con nombre " + nombre + " es " + contactos[i].getNombre()
                            + " de la organizacion " + contactos[i].getOrganizacion() + " y el telefono "
                            + contactos[i].getTelefono());
                    ContactoEncontrado = true;
                }
            }
        }
        if (!ContactoEncontrado) {
            Consola.escribir("No existe un contacto con el nombre " + nombre);
        }
    }

    public void BuscarContactoTelefono(int telefono) {
        Boolean ContactoEncontrado = false;
        for (int i = 0; i < contactos.length && !ContactoEncontrado; i++) {
            if (contactos[i] != null) {
                if (contactos[i].getTelefono() == telefono) {
                    Consola.escribir("El contacto con telefono " + telefono + " es " + contactos[i].getNombre()
                            + " de la organizacion " + contactos[i].getOrganizacion() + " y el telefono "
                            + contactos[i].getTelefono());
                    ContactoEncontrado = true;
                }
            }
        }
        if (!ContactoEncontrado) {
            Consola.escribir("No existe un contacto con el telefono " + telefono);
        }
    }

    public void EliminarContacto(String nombre) {
        Boolean eliminado = false;
        for (int i = 0; i < contactos.length && !eliminado; i++) {
            if (contactos[i] != null) {
                if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                    contactos[i] = null;
                    Consola.escribir("Contacto eliminado");
                    eliminado = true;
                }
            }
        }
        if (!eliminado) {
            Consola.escribir("No existe un contacto con el nombre " + nombre);
        }
    }

}
