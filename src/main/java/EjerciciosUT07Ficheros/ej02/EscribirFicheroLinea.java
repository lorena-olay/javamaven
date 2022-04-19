package EjerciciosUT07Ficheros.ej02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class EscribirFicheroLinea {

    public static void main(String[] args)
    {
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "array.txt";

        // Array a escribir
        int numeros [][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

// Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))){

            for (int[] is : numeros) {
                for (int i : is) {
                    // Usamos metodo write() para escribir en el buffer
                    flujo.write(i + ",");
                }
                // Metodo newLine() añade línea en blanco
                flujo.newLine();
            }
            // Metodo flush() guarda cambios en disco
            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
