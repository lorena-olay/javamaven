package EjerciciosUT06.ej08;

import java.util.Random;

public class Dado extends Azar{

    @Override
    public int lanzar() {
        System.out.println("Dado: ");
        return (int) (Math.random()*6+1);
    }

    public Dado(int posibilidades) {
        super(posibilidades);
    }

    public Dado() {
    }

    @Override
    public String toString() {
        return "Dado{" +
                "posibilidades=" + posibilidades +
                '}';
    }
}
