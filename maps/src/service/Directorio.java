package service;

import domain.Contacto;
import domain.Telefono;
import domain.TipoTelefono;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Directorio {

    private Map<String, Contacto> contactos;

    public Directorio() {
        this.contactos = new TreeMap<>();
    }

    public void registrarContacto(String nombre, String apellido) {
        Contacto contacto = new Contacto(nombre, apellido);
        contactos.put(contacto.getNombreCompleto(), contacto);
    }

    public void registrarContacto(String nombre, String apellido, Set<Telefono> telefonos) {
        Contacto contacto = new Contacto(nombre, apellido, telefonos);
        contactos.put(contacto.getNombreCompleto(), contacto);
    }

    public void removerContacto(String nombre, String apellido) {
        contactos.remove(nombre + " " + apellido);
    }

    public void registrarTelefono(String nombre, String apellido, TipoTelefono tipo,
                                  String indicativoPais, String numero) {
        Contacto contactoExistente = contactos.get(nombre + " " + apellido);
        if (contactoExistente == null) {
            /*Contacto nuevoContacto = new Contacto(nombre, apellido);
            nuevoContacto.getTelefonos().add(new Telefono(tipo, indicativoPais, numero));
            contactos.put(nuevoContacto.getNombreCompleto(), nuevoContacto);*/
            Set<Telefono> telefonos = new HashSet<>();
            telefonos.add(new Telefono(tipo, indicativoPais, numero));
            Contacto nuevoContacto = new Contacto(nombre, apellido, telefonos);
            contactos.put(nuevoContacto.getNombreCompleto(), nuevoContacto);
        } else {
            Telefono nuevoTelefono = new Telefono(tipo, indicativoPais, numero);
            contactoExistente.getTelefonos().add(nuevoTelefono);
        }
    }

    public void removerTelefono(String nombre, String apellido, String indicativoPais, String numero) {
        if (contactos.containsKey(nombre + " " + apellido)) {
            Contacto contactoExistente = contactos.get(nombre + " " + apellido);
            boolean seEncontroTelefono = false;
            for (Telefono telefono : contactoExistente.getTelefonos()) {
                if (telefono.getIndicativoPais().equals(indicativoPais)
                        && telefono.getNumero().equals(numero)) {
                    seEncontroTelefono = true;
                    contactoExistente.getTelefonos().remove(telefono);
                    break;
                }
            }
            if (!seEncontroTelefono) {
                System.out.println("El número de teléfono " + indicativoPais + numero +
                        " no está registrado en el contacto " + nombre + " " + apellido);
            }
        } else {
            System.out.println("El contacto " + nombre + " " + apellido + " no existe en el directorio");
        }
    }

    public Map<String, Contacto> getContactos() {
        return contactos;
    }
}
