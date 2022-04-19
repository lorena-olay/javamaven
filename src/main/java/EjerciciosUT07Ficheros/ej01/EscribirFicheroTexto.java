package EjerciciosUT07Ficheros.ej01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class EscribirFicheroTexto {

    public static void main(String[] args)
    {
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "array.txt";

        // Array a escribi
        int fila = 4;
        int columna = 4;
        int numeros [][] = new int[fila][columna];
        int l = 0;
        int n = 0;

        for (int i=0;i<numeros.length;i++){
            l+=100;
            for (int j=0;j<numeros[i].length;j++){
                numeros[i][j] = l+n;
                n+=1;
            }
            l-=numeros[i].length;
        }

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


