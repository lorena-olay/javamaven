package relaciondeejerciciosc.ej01y02;

public class Complejo {
    //atributos
    private int a;
    private int bi;
    //metodos
    public static String multiplicacion(Complejo z1, Complejo z2) {
        int  m1, m2, m3, m4, suma, sumai;
        String resultado;
        m1 = z1.getA() * z2.getA();
        m2 = z1.getA() * z2.getBi();
        m3 = z1.getBi() * z2.getA();
        m4 = z1.getBi() * z2.getBi();
        suma = m1 + m4;
        sumai = m2 + m3;
        resultado = suma + " " + sumai;
        return resultado;
    }
    public static String suma(Complejo z1, Complejo z2) {
        int suma, sumai;
        String resultado;
        suma = z1.getA() + z2.getA();
        sumai = z1.getBi() + z2.getBi();
        resultado = z1 + " + " + z2 + " = " + suma + " + " + sumai;
        return resultado;
    }

    public static String resta(Complejo z1, Complejo z2) {
        int resta, restai;
        String resultado;
        resta = z1.getA() + z2.getA();
        restai = z1.getBi() + z2.getBi();
        resultado = z1 + " - " + z2 + " = " + resta + " - " + restai;
        return resultado;
    }
    //constructores

    public Complejo() {
    }

    public Complejo(int a, int bi) {
        this.a = a;
        this.bi = bi;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getBi() {
        return bi;
    }

    public void setBi(int bi) {
        this.bi = bi;
    }

    @Override
    public String toString() {
        return
                a + " + " +
                        bi + "i";
    }
}
