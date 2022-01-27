package ut05estructuradealmacenamiento.ej07;

import java.util.Random;
import java.util.Scanner;

public class leerDosArrays {
    public static void tamanioArray(){
        Scanner teclado = new Scanner(System.in);
        int i, tamanio;
        System.out.println("Introduce el tamaño del array: ");
        tamanio = teclado.nextInt();
        int[] numeros = new int[tamanio];
        for(i=0; i<numeros.length; i++)
        {
            System.out.printf("Introduzca número %d: ", i+1);
            numeros[i] = teclado.nextInt();
        }
        for(i=0; i<numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }

    }

    public int[] tamanioArrayAleatorio(){
        Random numAleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int i, tamanio, numeroAleatorio;
        final int INICIO_ARRAY = 1;
        final int FINAL_ARRAY = 100;

        System.out.println("Introduce el tamaño del array: ");
        tamanio = teclado.nextInt();
        int[] numeros = new int[tamanio];
        for(i=0; i<numeros.length; i++)
        {
            numeroAleatorio = numAleatorio.nextInt(FINAL_ARRAY - INICIO_ARRAY + 1) + INICIO_ARRAY;
            //System.out.println(numeroAleatorio);
        }
        return numeros;
    }

    public int[] maltiplicadorArray(int[] arr, int[] arr1) {
        int mul = 0;
        int mul1 = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("índice array: " + i);
            mul*=arr[i];
            System.out.println("multiplicacion: " + mul);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("índice array: " + i);
            mul1*=arr1[i];
            System.out.println("multiplicacion: " + mul1);
        }

        System.out.println("Array Multiplicacion = "+ mul);
        return arr;
    }

    //método para número aleatorio entre 2 números, el primero tiene que ser mayor que el segundo
    /*hacer que el mayor sea el primero, catch*/
    public static int numeroAleatorioEntre(int numero, int numero1) {
        Random numAleatorio = new Random();
        int numeroAleatorio;

        //System.out.println("Numero aleatorio " + numeroAleatorio);

        if (numero > numero1) {
            numeroAleatorio = numAleatorio.nextInt(numero - numero1 + 1) + numero1;
        } else {
            numeroAleatorio = numAleatorio.nextInt(numero1 - numero + 1) + numero;
        }

        return numeroAleatorio;
    }
    public void main(String[] args) {
        multiplicadorArray(tamanioArrayAleatorio(), tamanioArray());
        //tamanioArray();
        //numeroAleatorioEntre(100, 1);


    }
}
