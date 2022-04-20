package EjerciciosUT07Ficheros.ej06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LeerFichero3 {
    public static void main(String[] args) {
        // Fichero a leer
        String idFichero = "75lineas.txt";
        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        System.out.println("Leyendo el fichero: " + idFichero);
        int contador = 0;
        ArrayList<Integer> ocurrencias=new ArrayList<>();
        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))){
            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Implementa un programa que lea el fichero del ejercicio 3 y muestre el contenido del fichero.
                // Además buscará la primera ocurrencia, en cada línea, de las letras seguidas ‘w’, ‘e’, ‘b’,
                // informando de la posición que ocupan en la línea, si es que existe esa ocurrencia.
                linea = datosFichero.nextLine(); //Se lee la línea
                contador++;
                if(linea.equals("w")||linea.equals("e")||linea.equals("b")){
                    ocurrencias.add(contador);
                }
                System.out.println(linea); // Se imprime en pantalla
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // El mismo ejemplo pero separando cada elemento
        // leído usando el método split() de la clase String */
    }
}
