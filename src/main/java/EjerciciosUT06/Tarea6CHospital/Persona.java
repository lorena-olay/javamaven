package EjerciciosUT06.Tarea6CHospital;

import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private NIF NIF=new NIF();

    public Persona() {
    }

    public Persona(String nombre, String apellidos, NIF nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
    }

    public void renovarNIF(LocalDate fechaSolicitud){
        this.NIF.renovar(NIF.getFechaCaducidad().plusYears(fechaSolicitud.getYear()));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public NIF getNif() {
        return NIF;
    }

    public void setNif(NIF nif) {
        this.NIF = nif;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nif=" + NIF +
                '}';
    }
}
