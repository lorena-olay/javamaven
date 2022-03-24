package EjerciciosUT06.Tarea6CHospital;

public class Hospital {
    private String nombre, direccion, numeroCamas;

    public Hospital() {
    }

    public Hospital(String nombre, String direccion, String numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
    }

    public void ingresarPaciente(Paciente paciente){
        System.out.println("Paciente " + paciente.getApellidos() + ", " + paciente.getNombre()+ " ha sido ingresado");
    }

    public void contratarEmpleado(Empleado empleado){
        System.out.println(empleado.getApellidos()+", "+empleado.getNombre()+" ha sido contratado");
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
