package EjerciciosUT06.ej11;

public class Rectangulo extends Figura{
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    public double area(){
        return getAltura()*getBase();
    }

    @Override
    public String toString() {
        return "Rectangulo{}";
    }
}
