package EjerciciosUT05estructuradealmacenamiento.setsortedset;
//PARTE B
//Crea una clase EjercitoOrdenado donde haya la misma funcionalidad pero hay que tener en cuenta que en este caso
//no hay duplicados y los soldados están ordenados según su nif.
//Crea una clase de prueba para tu clase EjercitoOrdenado, donde se haga uso de los métodos anteriores.

import java.util.*;

public class EjercitoOrdenado {
    private SortedSet<Soldado> ejercito;

    public EjercitoOrdenado() {
        this.ejercito = new TreeSet<>();
    }

    //1. Saber el número de soldados que hay.
    public void numSoldados() {
        System.out.printf("Ahora el set contiene %d elementos", this.ejercito.size());
    }//return int

    //2. Alistar a un solado.
    public void alistarSoldados(Soldado soldado) {
        ejercito.add(soldado);
    }

    //3. Saber si el ejército no tiene soldados.
    public boolean noHaySoldados() {
        boolean aux = ejercito.isEmpty();
        return aux;
    }

    //4. Saber si un soldado está en el ejército.
    public boolean presenteSoldado(Soldado soldado) {
        boolean presente = ejercito.contains(soldado);
        return presente;
    }

    //4. Sacar todos los soldados, en forma de ArrayList.
    public ArrayList<Soldado> listaSoldados() {
        ArrayList<Soldado> soldados = new ArrayList<>();
        for (Soldado persona : ejercito) {
            soldados.add(persona);
        }
        return soldados;
    }

    //5. Desmatricular a un soldado del ejército.
    public void desmatricularSoldado(Soldado soldado) {
        ejercito.remove(soldado);
    }



}
