package ej1;

import java.util.ArrayList;

public class Baraja {
    private String palo;
    private String numero;
    private static final String[] numeros = {"2","3","4","5","6","7","8","9", "10","J","Q","K","A"};
    private static final String[] palos = {"Picas","Rombos","Treboles","Corazones"};

    public Baraja() {
    }

    public Baraja(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public static ArrayList<Baraja> crearCartas(){
        ArrayList<Baraja> baraja = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                Baraja aux = new Baraja(palos[j], numeros[i]);
                baraja.add(aux);
            }
        }
        return baraja;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "palo=" + palo +
                ", numero=" + numero +
                "}";
    }
}
