package ut05estructuradealmacenamiento.matrices.ej12;

public class MatrizCaracteres {
    /*Declara e inicializa una matriz de caracteres de 2x3,
    con los valores que tú quieras. Implementa un método,
    en la misma clase que el método main(), que reciba una
    matriz de caracteres y la imprima por consola.*/


    public static void mostrar(char[][] matriz, char contenido) {
        //Carga las letras en la matriz
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = contenido;
                contenido++;
            }
        }

        //Mostrar en pantalla la matriz
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();

        }


    }

    public static void main(String[] args) {
        final int FILAS = 3;
        final int COLUMNAS = 5;
        char[][] letras = new char[FILAS][COLUMNAS];
        char letraQueToca = 'A';
        mostrar(letras, letraQueToca);
    }
}
