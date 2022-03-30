package EjerciciosUT06.Tarea6CHospital;

public class Medico extends Empleado{
    private String especialidad;

    public Medico(String nombre, String apellidos, NIF NIF, String numeroSeguridadSocial, double salario, String especialidad) {
        super(nombre, apellidos, NIF, numeroSeguridadSocial, salario);
        this.especialidad = especialidad;
    }

    @Override
    public double calcularIRPF() {
        if(this.especialidad=="cirugía"){
            return ((getSalario()*25)/100)+getSalario();
        }else {
            return ((getSalario()*23.5)/100)+getSalario();
        }
    }

    public void tratar(Paciente paciente, String medicina){
        System.out.println("He tratado al paciente " + paciente.getApellidos() + ", " + paciente.getNombre() + " con el medicamento " + medicina);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return  super.toString() + "Medico{" +
                "especialidad='" + especialidad + '\'' +
                '}';
    }
}
