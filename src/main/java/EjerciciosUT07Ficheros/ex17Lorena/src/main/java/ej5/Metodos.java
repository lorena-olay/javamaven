package ej5;

import ej4.Tiempo;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Metodos {
    public static Map<String, Double> lluvias(List<Tiempo> lista) {
        Map<String, Double> map = (Map<String, Double>) lista.stream().collect(
                Collectors.toMap(Tiempo::getEstacionMeteorologica, Tiempo::getPrecipitacion));
        return map;
    }




}
