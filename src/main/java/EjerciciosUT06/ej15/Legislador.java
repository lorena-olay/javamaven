package EjerciciosUT06.ej15;

import EjerciciosUT06.ej12.Persona;

public abstract class Legislador extends Persona {
    private String provinciaQueRepresenta, partidoPolitico;

    public Legislador() {
    }

    public Legislador(String nombre, String apellidos, String NIF, String provinciaQueRepresenta, String partidoPolitico) {
        super(nombre, apellidos, NIF);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
    }

    public abstract String getCamaraEnQueTrabaja();

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return super.toString() + "Legislador{" +
                "provinciaQueRepresenta='" + provinciaQueRepresenta + '\'' +
                ", partidoPolitico='" + partidoPolitico + '\'' +
                '}';
    }
}
