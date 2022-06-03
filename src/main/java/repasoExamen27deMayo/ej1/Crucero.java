package repasoExamen27deMayo.ej1;

import java.util.ArrayList;
import java.util.Objects;

public class Crucero {
    private String nombre;
    private ArrayList<String> destinos;
    private double precio;
    private int numeroNoches;
    private String puertoSalida;
    private String buque;

    public Crucero() {
    }

    public Crucero(String nombre, ArrayList<String> destinos, double precio, int numeroNoches, String puertoSalida, String buque) {
        this.nombre = nombre;
        this.destinos = destinos;
        this.precio = precio;
        this.numeroNoches = numeroNoches;
        this.puertoSalida = puertoSalida;
        this.buque = buque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getDestinos() {
        return destinos;
    }

    public void setDestinos(ArrayList<String> destinos) {
        this.destinos = destinos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public String getPuertoSalida() {
        return puertoSalida;
    }

    public void setPuertoSalida(String puertoSalida) {
        this.puertoSalida = puertoSalida;
    }

    public String getBuque() {
        return buque;
    }

    public void setBuque(String buque) {
        this.buque = buque;
    }

    @Override
    public String toString() {
        return "Crucero{" +
                "nombre='" + nombre + '\'' +
                ", destinos=" + destinos +
                ", precio=" + precio +
                ", numeroNoches=" + numeroNoches +
                ", puertoSalida='" + puertoSalida + '\'' +
                ", buque='" + buque + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crucero crucero = (Crucero) o;
        return Double.compare(crucero.precio, precio) == 0 && numeroNoches == crucero.numeroNoches && Objects.equals(nombre, crucero.nombre) && Objects.equals(destinos, crucero.destinos) && Objects.equals(puertoSalida, crucero.puertoSalida) && Objects.equals(buque, crucero.buque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, destinos, precio, numeroNoches, puertoSalida, buque);
    }
}

