package EjerciciosUT06.Aerolinia;

import EjerciciosUT06.Tarea6CHospital.NIF;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static Pasajero crearPasajero(){
        Random r = new Random();
        String[] nombres = {"Arturo", "Mariano", "Luisa", "Gloria", "Mani"};
        String[] apellidos = {"Danphy", "Princhet", "Barrera", "Chavez", "Sanchez"};
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
        String[] ciudadOrigen = {"Madrid", "Paris", "Ucrania", "Lisboa", "Málaga"};
        String[] ciudadDestino = {"Barcelona", "Tokio", "Salvador", "Cancún", "Canadá"};
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
    public static Map<String,Integer> numPasajerosDestino(ArrayList<Vuelo> v){
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (Vuelo a:v) {
            map.put(a.getCiudadDestino(),a.getLista().size());
            map.put(a.getCiudadDestino(),a.getLista().size());
            map.put(a.getCiudadDestino(),a.getLista().size());

        }
        return map;
    }
    //- metodo  estatico: return map - contiene, para cada destino el numero de pasajeros que llegan al destino - destinos ordenados alfabeticamente
    public static TreeMap<String,Integer> ordenadoNumPasajerosDestino(ArrayList<Vuelo> v) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (Vuelo a : v) {
            map.put(a.getCiudadDestino(), a.getLista().size());
            map.put(a.getCiudadDestino(), a.getLista().size());
            map.put(a.getCiudadDestino(), a.getLista().size());

        }
        return map;
    }
    //- metodo estatico: saber por codigo de vuelo los pasajeros(lista) que hay en ese vuelo
    public static Map<String,ArrayList<Pasajero>> listaPasajerosEnVuelo(ArrayList<Vuelo> v){
        Map<String, ArrayList<Pasajero>> map = new HashMap<String, ArrayList<Pasajero>>();
        for (Vuelo a : v) {
            //map.put(a.getCiudadDestino(), a.getLista());
            map.put(a.getCodVuelo(), a.getLista());
            map.put(a.getCodVuelo(), a.getLista());

        }
        return map;
    }
    public static void main(String[] args) {
        //PRUEBAS
        /*
        System.out.println(crearPasajero());
        System.out.println(crearlistaPasajero());
        System.out.println(crearVuelo());
        System.out.println(crearListaVuelos());
        System.out.println(numPasajerosDestino(crearListaVuelos()));
        System.out.println(ordenadoNumPasajerosDestino(crearListaVuelos()));
        System.out.println(listaPasajerosEnVuelo(crearListaVuelos()));
         */
        //Iterator<String> it = numPasajerosDestino(crearListaVuelos()).keySet().iterator();
        System.out.println("***************************************LISTA DESORDENADA**********************************************");
        for (Map.Entry<String,Integer> pair : numPasajerosDestino(crearListaVuelos()).entrySet()) {
            System.out.println("Destino: "+pair.getKey() + " -> Número de pasajeros: "+pair.getValue());
        }
        System.out.println("***************************************LISTA ORDENADA**********************************************");
        for (Map.Entry<String,Integer> pair : ordenadoNumPasajerosDestino(crearListaVuelos()).entrySet()) {
            System.out.println("Destino: "+pair.getKey() + " -> Número de pasajeros: "+pair.getValue());
        }
        System.out.println("***************************************LISTA PASAJEROS EN CADA VUELO**********************************************");
        for (Map.Entry<String,ArrayList<Pasajero>> pair : listaPasajerosEnVuelo(crearListaVuelos()).entrySet()) {
            System.out.println("Código del vuelo: "+pair.getKey() + " -> Lista de pasajeros: "+pair.getValue());
        }







    }

    }

