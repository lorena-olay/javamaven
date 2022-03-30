package EjerciciosUT06.Aerolinia;

import EjerciciosUT06.Tarea6CHospital.NIF;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static Pasajero crearPasajero(){
        Random r = new Random();
        String[] nombres = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String[] apellidos = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String numPasajero = RandomStringUtils.randomNumeric(6).toUpperCase();
        NIF nif = new NIF();
        return new Pasajero(nombres[r.nextInt(nombres.length)], apellidos[r.nextInt(apellidos.length)], nif, numPasajero);
    }
    public static ArrayList<Pasajero> crearlistaPasajero(){
        ArrayList<Pasajero> list = new ArrayList<>();
        list.add(crearPasajero());
        list.add(crearPasajero());
        list.add(crearPasajero());
        list.add(crearPasajero());
        return list;
    }
    public static Vuelo crearVuelo(){
        Random r = new Random();
        String[] ciudadOrigen = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String[] ciudadDestino = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        ArrayList<Pasajero> list=crearlistaPasajero();
        LocalDate fecha = LocalDate.now().plusWeeks(2);
        return new Vuelo(RandomStringUtils.randomNumeric(10),ciudadOrigen[r.nextInt(ciudadOrigen.length)],ciudadDestino[r.nextInt(ciudadDestino.length)],fecha, list);
    }
    public static ArrayList<Vuelo> crearListaVuelos(){
        ArrayList<Vuelo> lista = new ArrayList<>();
        lista.add(crearVuelo());
        lista.add(crearVuelo());
        lista.add(crearVuelo());
        lista.add(crearVuelo());
        return lista;
    }
    //- metodo estatico: return map - contiene, para cada destino el numero de pasajeros que llegan al destino
    //- metodo  estatico: return map - contiene, para cada destino el numero de pasajeros que llegan al destino - destinos ordenados alfabeticamente
    //- metodo estatico: saber por codigo de vuelo los pasajeros(lista) que hay en ese vuelo
    public static void main(String[] args) {

    }
}
