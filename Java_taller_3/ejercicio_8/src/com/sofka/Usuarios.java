package com.sofka;

public class Usuarios {
    private String nombre;
    private Boolean ingreso;
    private Boolean resultado;

    public Usuarios(String nombre, Boolean ingreso, Boolean resultado) {
        this.nombre = nombre;
        this.ingreso = ingreso;
        this.resultado = resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getIngreso() {
        return ingreso;
    }

    public void setIngreso(Boolean ingreso) {
        this.ingreso = ingreso;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

}
