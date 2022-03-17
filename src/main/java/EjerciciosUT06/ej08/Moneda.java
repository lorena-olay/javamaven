package EjerciciosUT06.ej08;

public class Moneda extends Azar{
    @Override
    public int lanzar() {
        System.out.println("Moneda: ");
        return (int) (Math.random()*2 + 1);
    }

    public Moneda(int posibilidades) {
        super(posibilidades);
    }

    public Moneda() {
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "posibilidades=" + posibilidades +
                '}';
    }
}
