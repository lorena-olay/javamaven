package EjerciciosUT05estructuradealmacenamiento.setsortedset;

import javax.swing.*;

public class PruebaOrdenada {
    public static void main(String[] args) {
        EjercitoOrdenado ucrania = new EjercitoOrdenado();
        Soldado kowalski = new Soldado("000", "Kowalski", "Cerebrito", "Informes", 6);
        Soldado cabo = new Soldado("001", "Cabo", "Cadete", "Private", 5);
        Soldado rico = new Soldado("000", "Rico", "Kabuum", "Kabuum", 7);
        Soldado skipper = new Soldado("003", "Skipper", "Capitán", "Teniente", 7);

        ucrania.alistarSoldados(skipper);
        ucrania.alistarSoldados(rico);
        ucrania.alistarSoldados(kowalski);
        ucrania.alistarSoldados(cabo);

        JOptionPane.showMessageDialog(null, "¿Tenemos soldados en el ejército?");
        String aux2 = ucrania.noHaySoldados() ? "No hay" : "HAY";
        JOptionPane.showMessageDialog(null, aux2);
        ucrania.numSoldados();
        for (Soldado p : ucrania.listaSoldados()) {
            System.out.println(p);
        }
        ucrania.listaSoldados();
        JOptionPane.showMessageDialog(null, "¿Está el soldado cabo?");
        String aux = ucrania.presenteSoldado(cabo) ? "¡PRESENTE!" : "Ausente";
        JOptionPane.showMessageDialog(null, aux);
        ucrania.desmatricularSoldado(cabo);
        JOptionPane.showMessageDialog(null, "El soldado cabo ha muerto");
        JOptionPane.showMessageDialog(null, "¿Está el soldado cabo?");
        String aux1 = ucrania.presenteSoldado(cabo) ? "¡PRESENTE!" : "Ausente";
        JOptionPane.showMessageDialog(null, aux1);
        ucrania.listaSoldados();

    }
}