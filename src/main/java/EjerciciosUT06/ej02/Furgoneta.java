package EjerciciosUT06.ej02;

public class Furgoneta  extends Vehiculo {
    private boolean grande;

    public Furgoneta(String matricula, String marca, String modelo, String color, double tarifa, boolean grande) {
        super(matricula, marca, modelo, color, tarifa);
        this.grande = grande;
    }

    public String getAtributos(){
        return (super.getAtributos()+"\n Grande "+grande);
    }

    public boolean isGrande() {
        return grande;
    }

    public void setGrande(boolean grande) {
        this.grande = grande;
    }

    @Override
    public String toString() {
        return super.toString()+"Furgoneta{" +
                "grande=" + grande +
                '}';
    }
}
