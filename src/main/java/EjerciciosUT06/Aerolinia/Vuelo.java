package EjerciciosUT06.Aerolinia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vuelo {
    private String codVuelo, ciudadOrigen, ciudadDestino;
    private LocalDate duracion;
    private ArrayList<Pasajero> lista = new ArrayList<>();

    public Vuelo() {
    }

    public Vuelo(String codVuelo, String ciudadOrigen, String ciudadDestino, LocalDate duracion, ArrayList<Pasajero> lista) {
        this.codVuelo = codVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.duracion = duracion;
        this.lista = lista;
    }


    public String getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public LocalDate getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalDate duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Pasajero> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pasajero> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "codVuelo='" + codVuelo + '\'' +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                ", ciudadDestino='" + ciudadDestino + '\'' +
                ", duracion=" + duracion +
                ", lista=" + lista +
                '}';
    }
}
