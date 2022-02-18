package ut05estructuradealmacenamiento;

public class Matrices {
    public static void recorrerFila(int z, int matriz[][]) {
        int y;
        for (y = 0; y < matriz[z].length; y++) {
            System.out.println(matriz[z][y]);
        }
        System.out.println();
    }

    public static void recorrerColumna(int z, int matriz[][]) {
        int x;
        for (x=0; x < matriz.length; x++) {
            System.out.println(matriz[x][z]);
        }
    }

    public static void recorrerVecinas(int c, int z, int matriz[][]) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println(matriz[x][y]);
            }
        }
    }
}
