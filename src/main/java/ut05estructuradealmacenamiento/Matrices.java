package ut05estructuradealmacenamiento;

public class Matrices {


    public static void recorrerFila(int z, int matriz[][]) {
        for (;z < matriz.length; z++) {
            System.out.println(matriz[z]);
        }
    }

    public static void recorrerColumna(int z, int matriz[][]) {
        int x = 0;
        for (int y = 0; y < matriz[x].length; y++) {
            System.out.println(matriz[x][y]);
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
