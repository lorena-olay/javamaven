/*package ej4;

import ej5.Metodos;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Prueba {
    public static void main(String[] args) {
        LecturaJSON.leerArchivoJSON("./precipitacionesBadajoz.json",Tiempo.class).forEach(System.out::println);
        Metodos.lluvias(LecturaJSON.leerArchivoJSON("./precipitacionesBadajoz.json",Tiempo.class)).forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));
        Stream<Tiempo> stream = LecturaJSON.leerArchivoJSON("./precipitacionesBadajoz.json",Tiempo.class).stream();
        DoubleStream doubleStream = stream.mapToDouble(Integer::doubleValue);
        OptionalDouble optionalDouble = doubleStream.average();


    }
}
*/