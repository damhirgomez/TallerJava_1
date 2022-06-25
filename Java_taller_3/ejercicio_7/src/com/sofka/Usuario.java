package com.sofka;

public class Usuario {
    private String nombre;
    private Integer telefono;
    private String marca;
    private String placa;

    public Usuario(String nombre, Integer telefono, String marca, String placa) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.marca = marca;
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
