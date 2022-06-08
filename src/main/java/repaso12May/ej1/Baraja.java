package repaso12May.ej1;

import java.util.ArrayList;

public class Baraja {
    private final String[] palos = {"picas", "rombos", "tréboles", "corazones"};
    private final String[] numeros = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private String numero;
    private String palo;
    private ArrayList<Baraja> baraja = new ArrayList<>();

    public Baraja() {
    }

    public Baraja(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    //final String[] num = {"2","3",};
    public void crearBaraja() {
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                baraja.add(new Baraja(numeros[j], palos[i]));
            }
        }
    }

    public void mostrar() {
        baraja.forEach(System.out::println);
    }


    public String[] getPalos() {
        return palos;
    }

    public String[] getNumeros() {
        return numeros;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public ArrayList<Baraja> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Baraja> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "numero='" + numero + '\'' +
                ", palo='" + palo + '\'' +
                '}';
    }
}
