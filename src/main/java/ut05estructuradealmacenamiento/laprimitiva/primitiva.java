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



        for (i=1; i<=arr.length; i++){
            joker = (int)(Math.random()*9 + 0);
            System.out.println(joker);
        }

        int[] arr1 = {1, 1, 1, 1, 1, 1, 1};


        /*
        int usuario = 0;
        for (i=1; i<=arr1.length;i++){
            usuario = (int)(Math.random()*9 + 0);
            System.out.println(usuario);
        }
        */

        boolean datosRepetidos = false;
        for (int k=0; i<arr.length; i++){
            for (int j=0; j<arr1.length; j++){
                if (arr[i]==arr1[j])
                    datosRepetidos = true;
                break; //Rompe la iteración puesto que, si determinó que un dato se repite, no es necesario seguir comparando.
            }
        }
        if(Arrays.equals(arr1, arr)){
            System.out.println("PREMIO, JOKER BUENO");
        }else if(datosRepetidos=true){
            System.out.println("JOKER MALO");
        }else{
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
