package EjerciciosUT06.Tarea6CHospital;

import java.util.ArrayList;

public class Hospital {
    private String nombre, direccion, numeroCamas;
    private ArrayList<Persona> ingresados = new ArrayList<>();
    private ArrayList<Persona> contratados = new ArrayList<>();

    public Hospital() {
    }

    public Hospital(String nombre, String direccion, String numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
    }

    public void ingresarPaciente(Paciente paciente){
        System.out.println("Paciente " + paciente.getApellidos() + ", " + paciente.getNombre()+ " ha sido ingresado");
        ingresados.add(paciente);
    }

    public void contratarEmpleado(Empleado empleado){
        System.out.println(empleado.getApellidos()+", "+empleado.getNombre()+" ha sido contratado");
        contratados.add(empleado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(String numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroCamas='" + numeroCamas + '\'' +
                '}';
    }
}
