package domain;

import java.util.HashSet;
import java.util.Set;

public class Contacto {

    private String nombre;
    private String apellido;
    private Set<Telefono> telefonos;

    public Contacto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonos = new HashSet<>();
    }

    public Contacto(String nombre, String apellido, Set<Telefono> telefonos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonos = telefonos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Set<Telefono> getTelefonos() {
        return telefonos;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}
