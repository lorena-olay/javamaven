package EjerciciosUT07Ficheros.ExamenPruebaFicherosCRUD.ej1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LecturaCSV {
    //que contenga un método que permita la lectura del fichero CSV de la raíz de tu
    //proyecto. Este método recibe el nombre y ruta del fichero a leer y se encarga de devolver una estructura de tipo Map
    //ordenada de forma que las iniciales de los módulos sean las claves y el nombre completo de cada módulo sean los
    //valores asociados a dichas claves.

    public static Map<String, String> CSVaMap(String nombreFichero) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        String separador = ";";
        try (Scanner sc = new Scanner(new File(nombreFichero),"WINDOWS-1252")) {//formato del archivo
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                //System.out.println(linea);
                String[] datosLinea = linea.split(separador);
                map.put(datosLinea[0],datosLinea[1]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return map;
    }
/* MODULARIZAR LA LECTURA SEPARANDOLA DEL MAP
    public static <T> List<T> leerCsv(String nombre, String separador) {
        List<T> datos = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(nombre),"WINDOWS-1252")) {//formato del archivo
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                linea = linea.replaceAll(" ", "");
                linea = linea.replaceAll("\"", "");

                String[] datosLinea = linea.split(separador);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return datos;
    }

 */
}
