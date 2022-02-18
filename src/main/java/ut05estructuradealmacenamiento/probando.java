package ut05estructuradealmacenamiento;

import java.util.Random;

public class probando {
    public static void main(String[] args) {
        Random rand = new Random(100);
        final int FILAS = 3;
        final int COLUMNAS = 3;
        int[][] numero = new int[FILAS][COLUMNAS];
        int sumatoria = 0; // Aquí iremos sumando cada valor
        int cantidadDeElementos = 0; // Contar los elementos

        //Carga las numero en la matriz
        for (int f = 0; f < FILAS; f++) {
            for (int c = 0; c < COLUMNAS; c++) {
                numero[f][c] = rand.nextInt(100) + 1;
            }
        }
        Matrices.recorrerFila(0, numero);
    }
}
