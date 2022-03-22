package EjerciciosUT06.ej12;

import java.util.ArrayList;

public class ListaRecursiva {
    private ArrayList<Object> lista = new ArrayList<>();

    public void recorridoRecursivo(int indiceActual) {
        if (indiceActual == this.lista.size() - 1) {
            System.out.println("Ultimo elemento..." + this.lista.get(indiceActual));
        } else {
            System.out.println("Leyendo... " + this.lista.get(indiceActual));
            recorridoRecursivo(indiceActual + 1);
        }
    }
}
