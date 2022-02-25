package ut05estructuradealmacenamiento.setsortedset;

import javax.swing.*;

public class Prueba {
    public static void main(String[] args) {
        Ejercito rusia = new Ejercito();
        Soldado kowalski = new Soldado("000", "Kowalski", "Cerebrito", "Informes", 6);
        Soldado cabo = new Soldado("001", "Cabo", "Cadete", "Private", 5);
        Soldado rico = new Soldado("002", "Rico", "Kabuum", "Kabuum", 7);
        Soldado skipper = new Soldado("003", "Skipper", "Capitán", "Teniente", 7);

        rusia.alistarSoldados(skipper);
        rusia.alistarSoldados(rico);
        rusia.alistarSoldados(kowalski);
        rusia.alistarSoldados(cabo);
        JOptionPane.showMessageDialog(null, "¿Tenemos soldados en el ejército?");
        String aux2 = rusia.noHaySoldados() ? "No hay" : "HAY" ;
        JOptionPane.showMessageDialog(null, aux2);
        rusia.numSoldados();
        for (Soldado p : rusia.listaSoldados()) {
            System.out.println(p);
        }
        rusia.listaSoldados();
        JOptionPane.showMessageDialog(null, "¿Está el soldado cabo?");
        String aux = rusia.presenteSoldado(cabo) ? "¡PRESENTE!" : "Ausente";
        JOptionPane.showMessageDialog(null, aux);
        rusia.desmatricularSoldado(cabo);
        JOptionPane.showMessageDialog(null, "El soldado cabo ha muerto");
        JOptionPane.showMessageDialog(null, "¿Está el soldado cabo?");
        String aux1 = rusia.presenteSoldado(cabo) ? "¡PRESENTE!" : "Ausente";
        JOptionPane.showMessageDialog(null, aux1);
        rusia.listaSoldados();
    }
}
