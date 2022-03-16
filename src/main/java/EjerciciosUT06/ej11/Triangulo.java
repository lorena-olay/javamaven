package EjerciciosUT06.ej11;

public class Triangulo extends Figura{
    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public double area(){
        return (getAltura()*getBase())/2;
    }

    @Override
    public String toString() {
        return "Triangulo{}";
    }
}
