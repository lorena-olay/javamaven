package ut05estructuradealmacenamiento.ej24;

import java.util.ArrayList;
import java.util.Objects;

public class Cancion {
    private static ArrayList<String> Cancion = new ArrayList<String>(); // Create an ArrayList object

    /*imprimirLista (ListaReproduccion tmp). Método de clase
    que imprime los nombres de las canciones contenidas en tmp.
     */
    public static void imprimirLista (ArrayList<String> tmp){

    }

    /*eliminaCancion(Cancion c), elimina el objeto c si se encuentra en la lista de
    reproducción. Usa el método remove(Cancion)
     */
    /*
    public void eliminaCancion(Cancion c){
        System.out.println(this.Cancion);
        System.out.println(c);
        System.out.println((Cancion.contains(c)) ? (Cancion.remove(c)) : "no está");
        System.out.println(Cancion);
    }

     */

    /*eliminaCancion(int): elimina la Cancion que se encuentra en la posición indicada.
     */
    public static void eliminaCancion(int i){
        Cancion.remove(i);
        System.out.println(Cancion);
    }

    /*grabarCancion(Cancion): agrega al final de la lista la Cancion proporcionada.
     */
    public static void grabarCancion(String cancion){
        String aux = String.valueOf(Cancion.add(cancion));
        System.out.println(Cancion);
    }

    /*cambiarCancion(int, Cancion): cambia la Cancion de la posición indicada por
    la nueva Cancion proporcionada.
     */
    public static void cambiarCancion(int i, String cancion){
        String aux = Cancion.set(i, cancion);
        System.out.println(Cancion);
    }

    /*escucharCancion(int): devuelve la Cancion que se encuentra en la posición
    indicada.
     */
    public static void escucharCancion(int i) {
        String aux = Cancion.get(i);
        System.out.println(aux);
    }

    /*estaVacia(): devuelve si la lista de reproducción está vacía.
     */
    public static void estaVacia() {
        boolean vacia = false;
        if (Cancion.isEmpty()) {
            vacia = true;
            System.out.println("está vacia");
        } else {
            vacia = false;
            System.out.println("no está vacia");
        }
    }

    /*numeroCanciones(): devuelve el número de canciones de la lista.
     */
    public static void numeroCanciones() {
        int size = Cancion.size();
        System.out.println(size);
    }

    public Cancion() {
    }

    public Cancion(ArrayList<String> cancion) {
        Cancion = cancion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cancion)) return false;
        Cancion cancion = (Cancion) o;
        return getCancion().equals(cancion.getCancion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCancion());
    }

    public ArrayList<String> getCancion() {
        return Cancion;
    }

    public void setCancion(ArrayList<String> cancion) {
        Cancion = cancion;
    }
}
