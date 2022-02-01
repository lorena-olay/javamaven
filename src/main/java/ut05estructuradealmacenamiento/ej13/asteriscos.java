package ut05estructuradealmacenamiento.ej13;
import java.util.InputMismatchException;
import java.util.Scanner;
public class asteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean seguir = false;
        do {
            do {
                try {
                    System.out.println("Introduce un numero: ");
                    num = sc.nextInt();
                    for (int i = 1; i <= num; i++) {
                        System.out.println("*");
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Introduce un valor numérico");
                    sc.nextLine();
                }
                seguir = true;
            } while (num != 0);
                seguir = false;
        }while (seguir);
        System.out.println("END GAME");
    }
}
