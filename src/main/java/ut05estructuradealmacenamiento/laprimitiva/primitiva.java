package ut05estructuradealmacenamiento.laprimitiva;
//import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class primitiva {
    public static void main(String[] args) {
        //Random rn = new Random();
        int[] arr = new int[7];
        int joker = 0;
        int i;
        int[] arr1 = {1, 1, 1, 1, 1, 1, 1};
        for (i = 1; i <= arr.length; i++) {
            joker = (int) (Math.random() * 9 + 0);
            System.out.println(joker);
        }
        /*
        int usuario = 0;
        for (i=1; i<=arr1.length;i++){
            usuario = (int)(Math.random()*9 + 0);
            System.out.println(usuario);
        }
        */
        if (Arrays.equals(arr1, arr)) {
            System.out.println("PREMIO, JOKER BUENO");

        } else {
            Arrays.sort(arr);
            Arrays.sort(arr1);
            if (arr == arr1) {
                System.out.println("JOKER MALO");
            } else {
                System.out.println("No hay premio");
            }

/*
        if(joker == usuario){
            System.out.println("PREMIO, JOKER BUENO");
        }else if(joker != usuario){
            System.out.println("NO PREMIO");
        }
        */

        }
    }
}
