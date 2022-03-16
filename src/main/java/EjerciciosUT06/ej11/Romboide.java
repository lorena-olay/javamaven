package EjerciciosUT06.ej11;

public class Romboide extends Figura{
    public Romboide() {
    }

    public Romboide(double base, double altura) {
        super(base, altura);
    }

    public double area(){
        return getAltura()*getBase();
    }

    @Override
    public String toString() {
        return "Romboide{}";
    }
}
