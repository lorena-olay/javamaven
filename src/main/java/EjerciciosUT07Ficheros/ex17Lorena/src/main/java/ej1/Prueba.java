package ej1;

public class Prueba {
    public static void main(String[] args) {
       Baraja baraja = new Baraja();
       Baraja.crearCartas().forEach(System.out::println);
    }
}
