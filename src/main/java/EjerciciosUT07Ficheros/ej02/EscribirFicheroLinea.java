package EjerciciosUT07Ficheros.ej02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class EscribirFicheroLinea {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "teclado.txt";
        String escrito;
        // Array a escribir
        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {
            // Usamos metodo write() para escribir en el buffer
            do {
                System.out.printf("Escribe: ");
                escrito = entradaTeclado.nextLine();
                flujo.write(escrito);
                flujo.newLine();
            }while(!(escrito.equals("EOF")));

            // Metodo newLine() añade línea en blanco
            flujo.newLine();

            // Metodo flush() guarda cambios en disco
            flujo.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
