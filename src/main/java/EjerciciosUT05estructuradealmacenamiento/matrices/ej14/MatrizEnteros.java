package EjerciciosUT05estructuradealmacenamiento.matrices.ej14;

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
        int sumatoria = 0; // Aquí iremos sumando cada valor
        int cantidadDeElementos = 0; // Contar los elementos
        int z = 0;


        //Carga las numero en la matriz
        for (int f = 0; f < FILAS; f++) {
            for (int c = 0; c < COLUMNAS; c++) {
                numero[f][c] = rand.nextInt(100) + 1;
            }
        }

        //Mostrar en pantalla la matriz
        for (int f = 0; f < FILAS; f++) {
            for (int c = 0; c < COLUMNAS; c++) {
                System.out.print(numero[f][c] + " ");
            }
            System.out.println();
        }

        //Media
        for (int f = 0; f < numero.length; f++) {
            for (int c = 0; c < numero[z].length; c++) {
                int numactual = numero[f][c];
                sumatoria = sumatoria + numactual;
                cantidadDeElementos = cantidadDeElementos + 1;
            }
        }
        float promedio = (float) sumatoria / cantidadDeElementos;
        System.out.printf("La sumatoria es %d y el promedio es %f", sumatoria, promedio);
    }
}
