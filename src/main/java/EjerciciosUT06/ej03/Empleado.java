package EjerciciosUT06.ej03;

public class Empleado extends Persona {
    private double salario;
    //private Persona persona;ERROR

    public Empleado() {
        //INTERNAMENTE LLAMA AL CONSTRUCTOR PADRE
    }

    public Empleado(String nombre, String nif, int edad, double salario) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "salario=" + salario +
                '}';
    }

    public void aumentoSalario(double aumento){
        setSalario(this.salario+aumento);
    }
}
