package repasoExamen27deMayo.ej1;

import java.util.*;
import java.util.stream.Collectors;

public class Programa {
    public static Map<String, ArrayList<String>> listaDestinos(List<Crucero> lista){
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (Crucero c: lista) {
            map.put(c.getNombre(), c.getDestinos());
        }
        return map;
    }

    public static void mostrarMap(Map<String, ArrayList<String>> map){
        map.forEach((key, value) -> System.out.println("Cruceros : " + key + ". Destinos : " + value));
    }

    public static void main(String[] args) {
        Comparator<Crucero> criterioPrecio = (Crucero c1, Crucero c2) -> (int) (c1.getPrecio() - c2.getPrecio());
        Comparator<Crucero> criterioNombre = (Crucero c1, Crucero c2) -> (c1.getNombre().compareTo(c2.getNombre()));

        List<Crucero> lista = LecturaJSON.leerArchivoJSON1("./cruceros.json");
        List<Crucero> listaordenada = lista.stream()
                                            .sorted(criterioPrecio.thenComparing(criterioNombre))
                                            .collect(Collectors.toList());
        System.out.println("*************************************** DESORDENADA *****************************************************");
        lista.forEach(System.out::println);
        System.out.println("*************************************** ORDENADA *****************************************************");
        listaordenada.forEach(System.out::println);
        System.out.println("*************************************** MAP *****************************************************");
        Programa.mostrarMap(Programa.listaDestinos(listaordenada));
    }
}
