package com.sofka;

public class Taller {
    private Usuario[] usuarios;

    public Taller() {
        usuarios = new Usuario[5];
    }

    public void agregarVehiculo(Usuario a) {

        if (existeVehiculo(a)) {
            Consola.escribir("El auto ya existe con esta placa");
        } else {
            Boolean EsIgual = false;
            for (int i = 0; i < usuarios.length && !EsIgual; i++) {
                if (usuarios[i] == null) {
                    usuarios[i] = a;
                    EsIgual = true;
                }
            }
            if (EsIgual) {
                Consola.escribir("Vehiculo agregado");
            } else {
                Consola.escribir("No existe espacio para otro Usuario");
            }

        }
    }

    public Boolean existeVehiculo(Usuario a) {
        Boolean Existe = false;
        for (int i = 0; i < usuarios.length && !Existe; i++) {
            if (usuarios[i] != null) {
                if (usuarios[i].getPlaca().equals(a.getPlaca())) {
                    Existe = true;
                }
            }
        }
        return Existe;
    }

    public void BuscarUsuarioNombre(String nombre) {
        Boolean UsuarioEncontrado = false;
        for (int i = 0; i < usuarios.length && !UsuarioEncontrado; i++) {
            if (usuarios[i] != null) {
                if (usuarios[i].getNombre().equalsIgnoreCase(nombre)) {
                    Consola.escribir("El Usuario con nombre " + nombre + " existe"
                            + " e ingreso el vehiculo de marca " + usuarios[i].getMarca() + " y la placa "
                            + usuarios[i].getPlaca());
                    UsuarioEncontrado = true;
                }
            }
        }
        if (!UsuarioEncontrado) {
            Consola.escribir("No existe un Usuario con el nombre " + nombre);
        }
    }

    public void BuscarVehiculoPlaca(String placa) {
        Boolean UsuarioEncontrado = false;
        for (int i = 0; i < usuarios.length && !UsuarioEncontrado; i++) {
            if (usuarios[i] != null) {
                if (usuarios[i].getPlaca().equals(placa)) {
                    Consola.escribir("El vehiculo con placa " + placa + " es de marca " + usuarios[i].getMarca()
                            + "y usuario que lo registro fue " + usuarios[i].getNombre() + " y el telefono "
                            + usuarios[i].getTelefono());
                    UsuarioEncontrado = true;
                }
            }
        }
        if (!UsuarioEncontrado) {
            Consola.escribir("No existe un vehiculo con el telefono " + placa);
        }
    }

    public void RetirarVehiculo(String placa) {
        Boolean eliminado = false;
        for (int i = 0; i < usuarios.length && !eliminado; i++) {
            if (usuarios[i] != null) {
                if (usuarios[i].getPlaca().equalsIgnoreCase(placa)) {
                    usuarios[i] = null;
                    Consola.escribir("Usuario eliminado");
                    eliminado = true;
                }
            }
        }
        if (!eliminado) {
            Consola.escribir("No existe un vehiculo con la placa " + placa);
        }

    }
}
