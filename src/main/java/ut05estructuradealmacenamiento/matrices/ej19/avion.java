package ut05estructuradealmacenamiento.matrices.ej19;

import java.util.Random;

public class avion {
    /*Crear un programa que mediante un menú permita reservar
    o cancelar asientos de un avión, así como mostrar qué
    asientos están ocupados y libres actualmente. El avión
    tendrá 25 filas de 4 asientos cada una.
     */
    public static void main(String[] args) {
        Random rand = new Random(100);
        final int FILAS = 25;
        final int COLUMNAS = 4;
        int[][] numero = new int[FILAS][COLUMNAS];
        int num = 1;

        //Carga las numero en la matriz
        for (int f = 0; f < FILAS; f++) {
            for (int c = 0; c < COLUMNAS; c++) {
                numero[f][c] = num;
                num++;
            }
        }

        //Mostrar en pantalla la matriz
        for (int f = 0; f < FILAS; f++) {
            for (int c = 0; c < COLUMNAS; c++) {
                System.out.print(numero[f][c] + " ");
            }
            System.out.println();

        }
    }
}
