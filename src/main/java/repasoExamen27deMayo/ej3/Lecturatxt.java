package repasoExamen27deMayo.ej3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lecturatxt {
    public static void leer(String nombre) {
        List<String[]> datos = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(nombre), "us-ascii")) {
            String[] tokens = new String[0];
            String[][] matrix = new String[5][5];
            int filaMatriz = 0;
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                tokens = linea.split(" ");
                for (int i = 0; i < tokens.length; i++) {
                    //System.out.println(tokens[i]);
                    matrix[filaMatriz][i] = tokens[i];
                }
                filaMatriz++;
            }
            //MUESTRA LA MATRIZ
            for (int z = 0; z < matrix.length; z++) {
                for (int j = 0; j < matrix[z].length; j++) {
                    System.out.println("[" + z + "," + j + "] = " + matrix[z][j]);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
