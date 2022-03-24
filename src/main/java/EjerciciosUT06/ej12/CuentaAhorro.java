package EjerciciosUT06.ej12;

public class CuentaAhorro extends Cuenta{
    private double interes;
    private double comisionAnual;
    @Override
    public void actualizarSaldo() {
        setSaldo(getSaldo()+(getSaldo()*this.interes)-this.comisionAnual);
    }

    @Override
    public void retirar(double cantidad) {
        if (getSaldo()!=0){
            setSaldo(getSaldo()-cantidad);
        }else {
            throw new IllegalArgumentException("No puedes retirar dinero de una cuenta que no tiene");
        }

    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "interes=" + interes +
                ", comisionAnual=" + comisionAnual +
                '}';
    }
}
