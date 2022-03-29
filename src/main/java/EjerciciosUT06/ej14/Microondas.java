package EjerciciosUT06.ej14;

public class Microondas extends Electrodomestico implements Silencioso{
    private double protenciaMax;

    @Override
    public void silencio() {
        System.out.println("El microondas de condumo "+getConsumo()+" emite 40dB");
    }

    public Microondas(double consumo, String modelo, double protenciaMax) {
        super(consumo, modelo);
        this.protenciaMax = protenciaMax;
    }

    public double getProtenciaMax() {
        return protenciaMax;
    }

    public void setProtenciaMax(double protenciaMax) {
        this.protenciaMax = protenciaMax;
    }

    @Override
    public String toString() {
        return super.toString()+"Microondas{" +
                "protenciaMax=" + protenciaMax +
                '}';
    }
}
