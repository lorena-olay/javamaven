package EjerciciosUT07Ficheros.Tarea7aLorena;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Fichero a leer con datos de ejemplo
        String idFichero = "RelPerCen.csv";
        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        ArrayList<Empleado> lista = new ArrayList<>();
        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {
            datosFichero.nextLine();
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
//                System.out.println(linea);
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split("\",\"");
                tokens[0] = tokens[0].substring(1);
                tokens[7] = tokens[7].substring(0, tokens[7].length() - 1);
                for (String token : tokens) {
//                    System.out.print(token + ";");
                }
                lista.add(new Empleado(tokens[0], tokens[1], tokens[2],
                        Main.convertirEnLocalDate(tokens[3]), Main.convertirEnLocalDate((tokens[4])),
                        tokens[5], tokens[6], tokens[7]));
//                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        //MOSTRAR DATOS
        //Lista optenida del fichero
        for (Empleado v : lista) {
            System.out.println(v.toString());
        }
        //Total de profesores
        System.out.println("\nEl total de profesores se de: " + lista.size() + "\n");
        //Mostrar map
        Main.mostrarContenidoMap(map(lista));
        //Guardar map en archivo .csv
        escribirMapEnFicheroCSV("profesoresPorDepartamento.csv", map(lista));
        Main.guardarElOtroFichero("trabajoMasDe100DiasCurso20-21.csv", lista);
    }

    //METODOS
    public static LocalDate convertirEnLocalDate(String fechaString) {
        LocalDate fecha;
        if (!fechaString.isBlank()) {
            String[] fechaArray = fechaString.split("/");
            fecha = LocalDate.of(Integer.parseInt(fechaArray[2]),
                    Integer.parseInt(fechaArray[1]), Integer.parseInt(fechaArray[0]));
        } else {
            fecha = null;
        }
//        System.out.println(fecha);
        return fecha;
    }

    //Convertir Arraylist en Map
    public static Map<String, Integer> map(ArrayList<Empleado> l) {
        Map<String, Integer> mapa = new TreeMap<>();
        int numero = 0;
        for (Empleado e : l) {
            mapa.put(e.getPuesto(), 0);
        }
        for (Empleado e : l) {
            mapa.replace(e.getPuesto(), mapa.get(e.getPuesto()) + 1);
        }
        return mapa;
    }

    public static void mostrarContenidoMap(Map<String, Integer> mapa) {
        for (String key : mapa.keySet()) {
            System.out.printf("%s -- %s %n", key, mapa.get(key));
        }
    }

    public static void escribirMapEnFicheroCSV(String idfichero, Map<String, Integer> mapa) {
        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {
            for (String key : mapa.keySet()) {
                // Usamos metodo write() para escribir en el buffer
                flujo.write(key + "\t" + mapa.get(key));
                // Metodo newLine() añade línea en blanco
                flujo.newLine();
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void guardarElOtroFichero(String idfichero, ArrayList<Empleado> l) {
        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            for (Empleado empleado : l) {
                if (empleado.getFechaDeToma().isAfter(LocalDate.of(2020, Month.SEPTEMBER, 10))
                        && empleado.getFechaDeToma().isBefore(LocalDate.of(2021, Month.JUNE, 24))) {
                    if (empleado.getFechaDeToma().plusDays(100).isBefore(empleado.getFechaDeCese())) {
                        if (empleado.getFechaDeToma().plusDays(100)
                                .isBefore(LocalDate.of(2021, Month.JUNE, 24))) {
                            // Usamos metodo write() para escribir en el buffer
                            flujo.write(empleado.getNombre() + ";" + empleado.getDni() + ";" + empleado.getPuesto()
                                    + ";" + empleado.getFechaDeToma() + ";" + empleado.getFechaDeCese() + ";" + empleado.getTeléfono()
                                    + ";" + empleado.isEvaluador() + ";" + empleado.isCoordinador());
                            // Metodo newLine() añade línea en blanco
                            flujo.newLine();
                        }
                    }
                }
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
