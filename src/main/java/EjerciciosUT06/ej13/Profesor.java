package EjerciciosUT06.ej13;

public class Profesor extends Persona{
    private String especialidad;

    public Profesor(String nombre, String apellidos, String NIF, Direccion direccion, String especialidad) {
        super(nombre, apellidos, NIF, direccion);
        this.especialidad = especialidad;
    }

    @Override
    public void identificate() {
        System.out.println("Soy Profesor");
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "especialidad='" + especialidad + '\'' +
                '}';
    }
}
