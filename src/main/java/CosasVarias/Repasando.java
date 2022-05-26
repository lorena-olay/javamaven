package CosasVarias;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repasando {
    public static void main(String[] args) {
        List<Objeto> lista = new ArrayList<>();

       List<Objeto> listaFiltrada =  lista.stream() //filtra através de una condición
                                            .filter(objeto -> Repasando.getAge(objeto.getFecha()) >= 18)
                                            .collect(Collectors.toList());

       Repasando.printList(listaFiltrada);

       //el map sirve para transformar el tipo de dato, de tipo A a tipo B
        List<Integer> listaFiltrada2 =  lista.stream() //filtra através de una condición
                                            .map(objeto -> Repasando.getAge(objeto.getFecha()))
                                            .collect(Collectors.toList());

        //ordenar lista con sorted(comparator)
        Comparator<Objeto> porNombre = (Objeto o1, Objeto o2) -> o1.getNombre().compareTo(o2.getNombre());
        List<Objeto> listaFiltrada3 = lista.stream()
                                            .sorted(porNombre)
                                            .collect(Collectors.toList());

        //anymatch no evalua todo el stream termina en la coincidencia
        boolean resultado = lista.stream()
                .anyMatch(objeto -> objeto.getNombre().startsWith("j"));

        //evalua todo el stream bajo la cndicion
        boolean resultado1 = lista.stream()
                .allMatch(objeto -> objeto.getNombre().startsWith("j"));

        //que no coincida
        Predicate<Objeto> predicado = objeto -> objeto.getNombre().startsWith("j");

        boolean resultado3 = lista.stream()
                                    .noneMatch(predicado);

        //Limit/Skip - paginación
        List<Objeto> listafiltrada4= lista.stream()
                                            .skip(2)
                                            .limit(2)
                                            .collect(Collectors.toList());

        //groupby
       Map<Integer, List<Objeto>> collecion1 =  lista.stream()
                                                        .filter(objeto -> objeto.getNumero() >20)
                                                        .collect(Collectors.groupingBy(
                                                                Objeto::getNumero
                                                        ));

       //agrupando por nombre y sumando
        Map<String, Double> collecion2 =  lista.stream()
                .collect(Collectors.groupingBy(
                        Objeto::getNombre,
                        Collectors.summingDouble(Objeto::getNumero)
                ));
        //.counting()
    }


    //metodo para saber la edad
    public static int getAge(LocalDate fechNac) {
        return Period.between(fechNac, LocalDate.now()).getYears();
    }

    //metodo generico para imprimir listas
    public static void printList(List<?> list){
        list.forEach(System.out::println);
    }
}
