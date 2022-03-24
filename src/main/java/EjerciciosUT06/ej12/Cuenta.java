package EjerciciosUT06.ej12;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;

public abstract class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona cliente;
    private static ArrayList<String> lista = new ArrayList<>();

    public Cuenta() {
        this.numeroCuenta = noRepe();
        this.saldo = 0;
        this.cliente = cliente;
    }

    public Cuenta(double saldo, Persona cliente) {
        this.numeroCuenta = noRepe();
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String numCuenta(){
        String aux = RandomStringUtils.randomNumeric(20);
        lista.add(aux);
        return aux;
    }

    public String noRepe(){
        String aux;
        do {
            aux=numCuenta();
        }while (!(lista.contains(aux)));
        lista.add(aux);
        return aux;
    }

    public abstract void actualizarSaldo();

    public abstract void retirar(double cantidad);



    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
