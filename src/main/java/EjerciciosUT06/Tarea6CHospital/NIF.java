package EjerciciosUT06.Tarea6CHospital;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;

public class NIF {
    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;
    private final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    public NIF() {
        this.numero= RandomStringUtils.randomNumeric(8);
        this.letra=calcularLetra();
        this.fechaCaducidad=LocalDate.now().plusYears(10);
    }

    public NIF(String numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        if(numero.length()<8){
            throw new IllegalArgumentException("El DNI tiene que tener 8 digitos");
        }
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
/*
    private char calcularLetra(){
        int numeroBueno = Integer.parseInt(numero);
        int resto = numeroBueno % 23;
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letras[resto];

    }*/
    public char calcularLetra(){
        int resto;
        resto = Integer.parseInt(numero) % 23;
        return letras[resto];
    }

    public void renovar(LocalDate fechaSolicitudRenovacion){
        setFechaCaducidad(fechaSolicitudRenovacion.plusYears(10));
    }
}