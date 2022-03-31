package EjerciciosUT06.ej13;

public class Estudiante extends Persona{
    private int ID;

    public Estudiante(String nombre, String apellidos, String NIF, Direccion direccion, int ID) {
        super(nombre, apellidos, NIF, direccion);
        this.ID = ID;
    }

    @Override
    public void identificate() {
        System.out.println("Soy estudiante");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "ID=" + ID +
                '}';
    }
}
