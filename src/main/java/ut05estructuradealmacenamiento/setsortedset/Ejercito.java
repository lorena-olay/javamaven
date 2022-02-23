package ut05estructuradealmacenamiento.setsortedset;

import java.util.HashSet;
import java.util.Set;

public class Ejercito {
    /*
PARTE A
Aplica lo estudiado para realizar una nueva clase llamada Ejercito, que contenga un número de soldados N. El constructor debe inicializar
la estructura SET (no hay soldados duplicados y el orden no importa). Debe haber métodos para:
1. Saber el número de soldados que hay.
2. Alistar a un solado.
3. Saber si el ejército no tiene soldados.
4. Saber si un soldado está en el ejército.
4. Sacar todos los soldados, en forma de ArrayList.
5. Desmatricular a un soldado del ejército.
Crea una clase de prueba para tu clase Ejército, donde se hagan uso de los métodos anteriores.
*/
    public static void main(String[] args) {
        Set<Soldado> ejercito = new HashSet<>();
        ejercito.add(new Soldado("00000", "Nombre", "Apellido", "Apellido", 1));
        ejercito.add(new Soldado("00000", "Nombre", "Apellido", "Apellido", 1));
        ejercito.add(new Soldado("00001", "Nombre", "Apellido", "Apellido", 1));


    }

}
