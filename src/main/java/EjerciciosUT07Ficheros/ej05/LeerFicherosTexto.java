package EjerciciosUT07Ficheros.ej05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeerFicherosTexto {

    public static void main(String[] args) {

        // Fichero a leer
        String idFichero = "vehículos.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))){

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); //Se lee la línea
                System.out.println(linea); // Se imprime en pantalla
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // El mismo ejemplo pero separando cada elemento
        // leído usando el método split() de la clase String */


        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))){

            System.out.println("Separando cada elemento del fichero: ");

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(",");

                for (String string : tokens) {
                    System.out.print(string + "\t");
                }

                System.out.println();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
