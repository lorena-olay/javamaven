package EjerciciosUT07Ficheros.ej03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheroLetras {
    public static String letraRandom(){
        String linea = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstivwxyz";
        char caracter = linea.charAt((int) (Math.random()*linea.length()));
        return String.valueOf(caracter);
    }
    public static void main(String[] args) {
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "75lineas.txt";
        final int NUMLINEAS = 71;
        int contador = 0;
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {
            do{
                String aux = letraRandom();
                if (aux.equals("g")||aux.equals("G")) {
                    flujo.write(aux + ";");
                    flujo.newLine();
                    contador++;
                }else {
                    flujo.write(aux + ";");
                }

            }while (contador!=NUMLINEAS);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
