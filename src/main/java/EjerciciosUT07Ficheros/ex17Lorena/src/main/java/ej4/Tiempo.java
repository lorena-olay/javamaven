package ej4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tiempo {
    private LocalDate fecha;
    private String estacionMeteorologica;
    private String provincia;
    private double precipitacion;

    public Tiempo() {
    }

    public Tiempo(LocalDate fecha, String estacionMeteorologica, String provincia, double precipitacion) {
        this.fecha = fecha;
        this.estacionMeteorologica = estacionMeteorologica;
        this.provincia = provincia;
        this.precipitacion = precipitacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstacionMeteorologica() {
        return estacionMeteorologica;
    }

    public void setEstacionMeteorologica(String estacionMeteorologica) {
        this.estacionMeteorologica = estacionMeteorologica;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(double precipitacion) {
        this.precipitacion = precipitacion;
    }

    @Override
    public String toString() {
        return "Tiempo{" +
                "fecha=" + fecha +
                ", estacionMeteorologica='" + estacionMeteorologica + '\'' +
                ", provincia='" + provincia + '\'' +
                ", precipitacion=" + precipitacion +
                '}';
    }
}
