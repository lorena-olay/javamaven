package EjerciciosUT06.ej14;

public class Frigorifico extends Electrodomestico implements Silencioso{
    private int capacidad;

    public Frigorifico(double consumo, String modelo, int capacidad) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    @Override
    public void silencio() {
        System.out.println("El frigorífico del modelo: "+getModelo()+" emite "+"50dB" );
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString()+"Frigorifico{" +
                "capacidad=" + capacidad +
                '}';
    }
}
