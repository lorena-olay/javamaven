package EjerciciosUT06.ej02;

public class Turismo extends Vehiculo{
    private int puertas;
    private boolean marchaAutomatica;

    public Turismo(String matricula, String marca, String modelo, String color, double tarifa, boolean marchaAutomatica, int puertas) {
        super(matricula, marca, modelo, color, tarifa);
        this.marchaAutomatica = marchaAutomatica;
        this.puertas = puertas;
    }
    public String getAtributos(){
        return (super.getAtributos()+"\n MarchaAutomatica? "+this.marchaAutomatica+"\n CantidadPuertas? "+this.puertas);
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }

    @Override
    public String toString() {
        return super.toString()+"Turismo{" +
                "puertas=" + puertas +
                ", marchaAutomatica=" + marchaAutomatica +
                '}';
    }
}
