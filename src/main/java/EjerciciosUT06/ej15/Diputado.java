package EjerciciosUT06.ej15;

public class Diputado extends  Legislador{
    private int numAsientos;

    public Diputado(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public Diputado(String nombre, String apellidos, String NIF, String provinciaQueRepresenta, String partidoPolitico, int numAsientos) {
        super(nombre, apellidos, NIF, provinciaQueRepresenta, partidoPolitico);
        this.numAsientos = numAsientos;
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Diputado";
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return super.toString() + "Diputado{" +
                "numAsientos=" + numAsientos +
                '}';
    }
}
