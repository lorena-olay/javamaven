package EjerciciosUT06.ej14;

import java.util.InputMismatchException;

public class CampanaExtractora extends Electrodomestico{
    private double decibelios;

    public CampanaExtractora(double consumo, String modelo, double decibelios) {
        super(consumo, modelo);
        if (decibelios < 50) {
            throw new InputMismatchException("Los decibelios no puedes ser menores a 50");
        }else {
            this.decibelios = decibelios;
        }
    }

    @Override
    public void silencio() {
        System.out.println("La campana extractora del modelo: "+getModelo()+" emite "+this.decibelios);

    }

    public double getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(double decibelios) {
        if (decibelios < 50) {
        throw new InputMismatchException("Los decibelios no puedes ser menores a 50");
        }else {
            this.decibelios = decibelios;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"CampanaExtractora{" +
                "decibelios=" + decibelios +
                '}';
    }
}
