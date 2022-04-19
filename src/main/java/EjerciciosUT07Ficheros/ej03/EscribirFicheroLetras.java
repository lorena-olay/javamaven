package EjerciciosUT07Ficheros.ej03;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class EscribirFicheroLetras {
    public static void main(String[] args)
    {
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "75lineas.txt";
        //String linea = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrsty";
        String linea;
        int contador = 0;
        final int limiteLineas = 75;
        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))){
            do {
                linea = RandomStringUtils.randomAlphabetic(1).toUpperCase(Locale.ROOT);
                if(linea.equals("g")||linea.equals("G")){
                    flujo.write(linea+"\n");
                    contador++;
                }else {
                    flujo.write(linea + ";");
                    contador++;
                }
            }while(contador!=limiteLineas);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
