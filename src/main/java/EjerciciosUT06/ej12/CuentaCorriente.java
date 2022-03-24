package EjerciciosUT06.ej12;

public class CuentaCorriente extends Cuenta{
    private final double INTERES=1.5;
    private double saldoMin;
    @Override
    public void actualizarSaldo() {
        if(getSaldo()>1000){
            setSaldo(getSaldo()+(this.saldoMin*this.INTERES));
        }else {
            setSaldo(getSaldo()+getSaldo()+this.INTERES);
        }

    }

    @Override
    public void retirar(double cantidad) {
        double aux = getSaldo()-cantidad;
        if(aux<this.saldoMin){
            throw new IllegalArgumentException("No puedes dejar la cuenta con menos de " + saldoMin);
        }else {
            setSaldo(aux);
        }
    }

    public double getINTERES() {
        return INTERES;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "INTERES=" + INTERES +
                ", saldoMin=" + saldoMin +
                '}';
    }
}
