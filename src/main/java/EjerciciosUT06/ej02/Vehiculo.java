package EjerciciosUT06.ej02;

import java.util.Random;

public class Vehiculo { private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;


    private static String [] marcas = {"audi","ford","tesla","jeep","renolt"};
    private static String [] modelos = {"golf","grande","cuadrado","hueco","todo incluido"};
    private static String [] colores = {"celeste","naranja","negro","blanco","magenta"};

    public Vehiculo() {
        Random aleatorio = new Random();
        this.color = colores[aleatorio.nextInt(colores.length)];
        this.marca = marcas[aleatorio.nextInt(marcas.length)];
        this.modelo = modelos[aleatorio.nextInt(modelos.length)];
    }

    public static Vehiculo [] generar100VehiculosAleatoriamente(){
        Vehiculo [] coches = new Vehiculo[100];
        for (int i = 0; i < 100; i++) {
            coches[i] = new Vehiculo();
        }
        return coches;
    }
    public static void mostrar100Vehiculos(Vehiculo [] coches){
        for (int i = 0; i < 100; i++) {
            System.out.println(coches[i].toString());
        }
    }

    // el método constructor de la clase Vehiculo
    public Vehiculo(String matricula,
                    String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }

    public String getAtributos(){
        return ("Matricula "+this.matricula+"\n Marca "+this.marca+"\n Modelo "+this.modelo+"\n Color "+this.color+"\n Tarifa "+this.tarifa+"\n Disponible "+this.disponible);
    }

// los métodos ‘get’ y ‘set’ de la clase Vehiculo

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void aplicarDescuentoTarifa(double descuento) {
        this.tarifa -= descuento;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }



}
