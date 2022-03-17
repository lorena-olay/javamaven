package EjerciciosUT06.ej08;

public class Moneda extends Azar{
    @Override
    public int lanzar() {
        return (int) (Math.random()*3 + 1);
    }
}
