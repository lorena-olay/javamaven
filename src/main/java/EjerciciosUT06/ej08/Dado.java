package EjerciciosUT06.ej08;

import java.util.Random;

public class Dado extends Azar{

    @Override
    public int lanzar() {
        return (int) (Math.random()*6);
    }
}
