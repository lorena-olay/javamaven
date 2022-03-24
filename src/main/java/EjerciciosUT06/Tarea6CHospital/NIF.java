package EjerciciosUT06.Tarea6CHospital;

import java.time.LocalDate;

public class NIF {

    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NIF(String numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.letra = calcularLetra();
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    private char calcularLetra(){
        int numeroBueno = Integer.parseInt(numero);
        int resto = numeroBueno % 23;
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        return letras[resto];

    }

    public void renovar(LocalDate fechaSolicitudRenovacion){
        this.fechaCaducidad = fechaSolicitudRenovacion.plusYears(10);
    }
}