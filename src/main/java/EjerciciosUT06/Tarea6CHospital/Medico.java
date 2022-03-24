package EjerciciosUT06.Tarea6CHospital;

public class Medico extends Empleado{
    private String especialidad;

    public Medico(String nombre, String apellidos, NIF NIF, String numeroSeguridadSocial, double salario, String especialidad) {
        super(nombre, apellidos, NIF, numeroSeguridadSocial, salario);
        this.especialidad = especialidad;
    }

    @Override
    public double calcularIRPF() {
        return 0;
    }

}
