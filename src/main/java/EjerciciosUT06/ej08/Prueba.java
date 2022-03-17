package EjerciciosUT06.ej08;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Azar> lista = new ArrayList<>();
        lista.add(new Dado());
        lista.add(new Moneda());
        for (Azar a : lista){
            System.out.println(a.lanzar());
        }
    }
}