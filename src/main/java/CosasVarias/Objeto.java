package CosasVarias;

import java.time.LocalDate;

public class Objeto {
    private String nombre;
    private LocalDate fecha;
    private int numero;

    public Objeto(String nombre, LocalDate fecha, int numero) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", numero=" + numero +
                '}';
    }
}
