package EjerciciosUT06.ej03;

public class Empleado extends Persona {
    private double salario;
    private Persona persona;

    public Empleado() {
    }

    public Empleado(String nombre, String nif, int edad, double salario) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }



    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return ("Empleado{" +
                "salario=" + salario +
                ", persona=" + persona +
                '}');
    }

    public void aumentoSalario(double aumento){
        setSalario(this.salario+aumento);
    }
}
