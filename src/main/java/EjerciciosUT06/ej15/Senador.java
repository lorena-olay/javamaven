package EjerciciosUT06.ej15;

public class Senador extends Legislador{
    private double salarioExtra;

    public Senador(String provinciaQueRepresenta, String partidoPolitico, double salarioExtra) {
        super(provinciaQueRepresenta, partidoPolitico);
        this.salarioExtra = salarioExtra;
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Senador";
    }

    public double getSalarioExtra() {
        return salarioExtra;
    }

    public void setSalarioExtra(double salarioExtra) {
        this.salarioExtra = salarioExtra;
    }

    @Override
    public String toString() {
        return "Senador{" + super.toString() +
                "salarioExtra=" + salarioExtra +
                '}';
    }
}
