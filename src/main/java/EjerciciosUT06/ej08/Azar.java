package EjerciciosUT06.ej08;

public abstract class Azar {
    protected int posibilidades;
    public abstract int lanzar();

    public Azar(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    public Azar() {
    }

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    @Override
    public String toString() {
        return "Azar{" +
                "posibilidades=" + posibilidades +
                '}';
    }
}
