package domain;

import java.util.Objects;

public class Telefono {

    private TipoTelefono tipo;
    private String indicativoPais;
    private String numero;

    public Telefono(TipoTelefono tipo, String indicativoPais, String numero) {
        this.tipo = tipo;
        this.indicativoPais = indicativoPais;
        this.numero = numero;
    }

    public TipoTelefono getTipo() {
        return tipo;
    }

    public String getIndicativoPais() {
        return indicativoPais;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefono telefono = (Telefono) o;
        return indicativoPais.equals(telefono.indicativoPais) && numero.equals(telefono.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indicativoPais, numero);
    }
}
