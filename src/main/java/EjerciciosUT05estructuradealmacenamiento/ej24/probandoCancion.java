package EjerciciosUT05estructuradealmacenamiento.ej24;

public class probandoCancion {
    public static void main(String[] args) {
        //ArrayList<String> songs = new ArrayList<>(Arrays.asList("I need some sleep", "mood", "Point of no return", "Courtesy call"));
        //Cancion cancion = new Cancion(songs);
        //ArrayList<String> aux = new ArrayList<>(Arrays.asList("mood"));

       /*
        Cancion.grabarCancion("canciongrabada");
        Cancion.numeroCanciones();
        Cancion.escucharCancion(1);
        Cancion.eliminaCancion(4);

        */

            final int FILAS = 3;
            final int COLUMNAS = 5;
            char[][] letras = new char[FILAS][COLUMNAS];
            char letraQueToca = 'A';

            //Carga las letras en la matriz
            for(int f=0; f<FILAS; f++) {
                for(int c=0; c<COLUMNAS; c++) {
                    letras[f][c] = letraQueToca;
                    letraQueToca++;
                }
            }

            //Mostrar en pantalla la matriz
            for(int f=0; f<FILAS; f++) {
                for(int c=0; c<COLUMNAS; c++) {
                    System.out.print(letras[f][c]+" ");
                }
                System.out.println();
            }
        }
    }

