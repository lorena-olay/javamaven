package ut05estructuradealmacenamiento.ej24;

import java.util.ArrayList;
import java.util.Objects;

public class Cancion {
    private ArrayList<String> Cancion = new ArrayList<String>(); // Create an ArrayList object

    public static boolean estaVacia(ArrayList<String> arr){
        boolean vacia = false;
        if (arr.isEmpty()){
            vacia = true;
            System.out.println("está vacia");
        }else {
            vacia=false;
            System.out.println("no está vacia");
        }
        return vacia;
    }

    public static int numeroCanciones(ArrayList<String> arr){
        int size = arr.size();
        return size;
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
