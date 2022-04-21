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
        String linea;
        System.out.println("Leyendo el fichero: " + idFichero);
        int contador = 0;
        ArrayList<String> ocurrencias=new ArrayList<>();
        final String W="w";
        final String E="e";
        final String B="b";
        String posicionW;

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
                if(linea.contains(W)){
                    if (linea.indexOf(W)>0){
                        posicionW=("W -> "+"Linea: "+String.valueOf(contador)+"; Posición: "+linea.indexOf(W));
                        ocurrencias.add(posicionW);
                    }
                }
                if(linea.contains(E)){
                    if (linea.indexOf(E)>0){
                        posicionW=("E -> "+"Linea: "+String.valueOf(contador)+"; Posición: "+linea.indexOf(E));
                        ocurrencias.add(posicionW);
                    }
                }
                if(linea.contains(B)){
                    if (linea.indexOf(B)>0){
                        posicionW=("B -> "+"Linea: "+String.valueOf(contador)+"; Posición: "+linea.indexOf(B));
                        ocurrencias.add(posicionW);
                    }
                }
                System.out.println(linea); // Se imprime en pantalla
            }
            System.out.printf("OCURRENCIAS: \n");
            ocurrencias.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // El mismo ejemplo pero separando cada elemento
        // leído usando el método split() de la clase String */
    }
}
