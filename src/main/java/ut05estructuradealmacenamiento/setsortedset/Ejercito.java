package ut05estructuradealmacenamiento.setsortedset;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ejercito {
    private Set<Soldado> ejercito;

    //El constructor debe inicializar la estructura SET (no hay soldados duplicados y el orden no importa).
    public Ejercito() {
        this.ejercito = new HashSet<>();
    }

    //1. Saber el número de soldados que hay.
    public void numSoldados() {
        System.out.printf("Ahora el set contiene %d elementos", this.ejercito.size());
    }

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
    // Crea una clase de prueba para tu clase Ejército, donde se hagan uso de los métodos anteriores.


}
