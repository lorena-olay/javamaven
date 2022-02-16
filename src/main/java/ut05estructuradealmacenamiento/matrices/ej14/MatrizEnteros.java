package ut05estructuradealmacenamiento.matrices.ej14;

import java.util.Random;

public class MatrizEnteros {
    /*Escribe un programa que dada una matriz de 3x3 enteros y realice las siguientes funciones:
    Rellenar aleatoriamente todas las casillas de la matriz con números enteros entre 1 y 100
    Calcular la media de todos los valores
    Calcular el valor mínimo y el máximo de todos los valores
    */
    public static void main(String[] args) {
        Random rand = new Random(100);
        final int FILAS = 3;
        final int COLUMNAS = 3;
        int[][] numero = new int[FILAS][COLUMNAS];

        //Carga las numero en la matriz
        for (int f = 0; f < FILAS; f++) {
            for (int c = 0; c < COLUMNAS; c++) {
                numero[f][c] = letraQueToca;
                letraQueToca++;
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
