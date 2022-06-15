package repasoExamen27deMayo.ej3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lecturatxt {
    public static String[][] leer(String nombre) {
        List<String[]> datos = new ArrayList<>();
        String[][] matrix;
        try (Scanner sc = new Scanner(new File(nombre), "us-ascii")) {
            String[] tokens = new String[0];
            matrix = new String[5][5];
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
                    System.out.print(matrix[z][j] + " ");
                }
                System.out.println("");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return matrix;
    }

    public static void vecinos(String[][] matriz) {
        for (int z = 0; z < matriz.length; z++) {
            for (int j = 0; j < matriz[z].length; j++) {
                if (matriz[z][j].equals("x")) {
                    if (matriz[z][j + 1].equals("a")
                            && matriz[z][j - 1].equals("a")
                            && matriz[z + 1][j].equals("a")
                            && matriz[z + 1][j + 1].equals("a")
                            && matriz[z + 1][j - 1].equals("a")){
                        System.out.println(z+j+matriz[z][j]);
                    }
                }
            }
            System.out.println("");
        }

    }
}
