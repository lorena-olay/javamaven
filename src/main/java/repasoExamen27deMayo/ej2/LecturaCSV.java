package repasoExamen27deMayo.ej2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LecturaCSV {
    public static <T> List<T> leerCsv(String nombre) {
        List<T> datos = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(nombre))) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                linea = linea.replaceAll(" ", "");
                linea = linea.replaceAll("\"", "");
                linea = linea.replaceAll(",", ".");

                String[] datosLinea = linea.split(";");

                Alumnado a1 = new Alumnado();
                a1.setCodMunicipio(datosLinea[0]);
                a1.setMunicipio(datosLinea[1]);
                a1.setA2016(Double.valueOf(datosLinea[2]));
                a1.setA2015(Double.valueOf(datosLinea[3]));
                a1.setA2014(Double.valueOf(datosLinea[4]));
                a1.setA2013(Double.valueOf(datosLinea[5]));
                a1.setA2011(Double.valueOf(datosLinea[6]));
                a1.setA2010(Double.valueOf(datosLinea[7]));
                a1.setA2006(Double.valueOf(datosLinea[8]));
                a1.setA2001(Double.valueOf(datosLinea[9]));
                a1.setA1996(Double.valueOf(datosLinea[10]));

                datos.add((T) a1);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return datos;
    }
}
