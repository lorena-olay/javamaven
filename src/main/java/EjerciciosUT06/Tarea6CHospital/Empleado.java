package EjerciciosUT06.Tarea6CHospital;

public abstract class Empleado extends Persona{
    private String numeroSeguridadSocial;
    private double salario;
/*
    public Empleado(String numeroSeguridadSocial, double salario) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

 */


    public Empleado(String nombre, String apellidos, NIF NIF, String numeroSeguridadSocial, double salario) {
        super(nombre, apellidos, NIF);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }



    public abstract double calcularIRPF();

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  super.toString() + "Empleado{" +
                "numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                ", salario=" + salario +
                '}';
    }
}
