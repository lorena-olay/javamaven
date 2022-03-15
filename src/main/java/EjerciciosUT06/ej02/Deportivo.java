package EjerciciosUT06.ej02;

public class Deportivo extends Vehiculo{
    private int caballos;
    private int suspension;

    public Deportivo(String matricula, String marca, String modelo, String color, double tarifa, int caballos, int suspension) {
        super(matricula, marca, modelo, color, tarifa);
        this.caballos = caballos;
        this.suspension = suspension;
    }

    public String getAtributos(){
        return (super.getAtributos()+"Caballos "+this.caballos+"\n Suspension "+this.suspension);
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        return "Deportivo{" +
                "caballos=" + caballos +
                ", suspension=" + suspension +
                '}';
    }
}
