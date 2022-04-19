package EjerciciosUT05estructuradealmacenamiento.ej13;
import java.util.InputMismatchException;
import java.util.Scanner;
public class asteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int num = 0;
        boolean seguir;
        int i = 0;
        int[] numeros = new int[2];
        //int[] valores = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        do {
            do {
                try {
                    for(i=0; i<numeros.length; i++)
                    {
                        System.out.printf("Introduzca número %d: ", i+1);
                        numeros[i] = sc.nextInt();

                    }
                    System.out.println("fuera");
                    System.out.println(numeros[i]);

                    /*
                    for(i=0; i<numeros.length; i++)
                    {
                        System.out.println(numeros[i]);
                    }

                     */



                } catch (InputMismatchException ime) {
                    System.out.println("Introduce un valor numérico");
                    sc.nextLine(); //ACUERDATE DE LIMPIAR EL BUFFER
                }
                seguir = true;
            } while (numeros[i] != 0);
                seguir = false;
        }while (seguir);
        System.out.println("END GAME");
    }
}
