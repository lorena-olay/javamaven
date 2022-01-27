package ut05estructuradealmacenamiento.ej03;
import java.util.Arrays;
public class mainCompararArrays {

    public static void main(String[] args) {
        double arr01[] = new double[] {7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5,};
        double arr02[] = Arrays.copyOf(arr01, arr01.length);
        System.out.println(arr01);
        System.out.println(arr02);

        for (int i = 0; i < arr02.length; i++) {
            System.out.println("array2 position " + i + ": " + arr02[i]);
        }
        if(arr01 == arr02){
            System.out.println("iguales");
        }else {
            System.out.println("diferentes");
        }

    }
}
