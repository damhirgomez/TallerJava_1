package com.sofka;

public class Contacto {
    private String nombre;
    private String organizacion;
    private int telefono;

    public Contacto(String nombre, String organizacion, int telefono) {
        this.nombre = nombre;
        this.organizacion = organizacion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean equals(Contacto a) {
        if (this.telefono == a.telefono) {
            return true;
        }
        return false;

    }

}
