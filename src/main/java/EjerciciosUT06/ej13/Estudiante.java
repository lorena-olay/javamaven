package EjerciciosUT06.ej13;

import java.util.Random;

public class Estudiante extends Persona{
    private String ID;
    Random r = new Random();

    public Estudiante(String nombre, String apellidos, String NIF, Direccion direccion, String ID) {
        super(nombre, apellidos, NIF, direccion);
        this.ID = ID;
    }

    @Override
    public void identificate() {
        System.out.println("Soy estudiante");
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiante{" +
                "ID='" + ID + '\'' +
                '}';
    }
}
