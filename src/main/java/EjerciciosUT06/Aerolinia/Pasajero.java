package EjerciciosUT06.Aerolinia;

import EjerciciosUT06.Tarea6CHospital.Persona;

public class Pasajero extends Persona {
    private String numPasajero;

    public Pasajero(String nombre, String apellidos, EjerciciosUT06.Tarea6CHospital.NIF nif, String numPasajero) {
        super(nombre, apellidos, nif);
        this.numPasajero = numPasajero;
    }

    public String getNumPasajero() {
        return numPasajero;
    }

    public void setNumPasajero(String numPasajero) {
        this.numPasajero = numPasajero;
    }

    @Override
    public String toString() {
        return super.toString()+"Pasajero{" +
                "numPasajero='" + numPasajero + '\'' +
                '}';
    }
}
