package metodos;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class metodos {
    /*
    public String mostrarDato(String dato){

        JOptionPane.showMessageDialog(null, "Hello World");
    }

    metodo pedir datos joption
    pedir datos scanner

    */
    //COSAS ALEATORIAS
    //metodo que da una letra aleatoria de un string
    public static char letraAleatoria() {
        Random random = new Random();
        String letra = "FGHIJKLMNÑOPQRSTUVWX";
        int randomInt = random.nextInt(letra.length());
        char randomChar = letra.charAt(randomInt);
        return randomChar;
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

/*-------------------------------ARRAYS-----------------------------------------------------------*/
    public static int tamanioArrayAleatorio(){
        Random numAleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int i, tamanio, numeroAleatorio = 0;
        final int INICIO_ARRAY = 1;
        final int FINAL_ARRAY = 100;

        System.out.println("Introduce el tamaño del array: ");
        tamanio = teclado.nextInt();
        int[] numeros = new int[tamanio];
        for(i=0; i<numeros.length; i++)
        {
            numeroAleatorio = numAleatorio.nextInt(FINAL_ARRAY - INICIO_ARRAY + 1) + INICIO_ARRAY;
            System.out.println(numeroAleatorio);
        }
        return numeroAleatorio;
    }

    //metodo de clonacion
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //metodo que verifica si la suma de 2 numeros es impar
    public static boolean numeroImpar(int n1, int n4) {
        int suma = n1 + n4;
        int resto = suma % 2;
        boolean impar = resto == 0;
        return impar;
    }

    //metodo que verifica si la multiplicacion de 2 numeros es par
    public static boolean numeroPar(int n2, int n3) {
        int multiplicacion = n2 * n3;
        int resultado = multiplicacion % 2;
        boolean par = resultado != 0;
        return par;
    }



    //método para pedir un número entero y controla que si es un número entero
    public static int pedirNumeroEntero() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean seguir = true;
        do {
            try {
                System.out.println("Escribe un número");
                numero = sc.nextInt();
                seguir = false;
            } catch (InputMismatchException ime) {
                JOptionPane.showMessageDialog(null, "eso no es un número entero");
                sc.nextLine();
            }
        } while (seguir);
        return numero;

    }



    //método que comprueba q los 4 numeros metidos sean diferentes entre ellos
    public static boolean numerosDiferentes(int n1, int n2, int n3, int n4) {
        boolean okay = false;
        if (!(n1 != n2 && n1 != n3 && n1 != n4
                && n2 != n3 && n2 != n4
                && n3 != n4)) {
            okay = true;
        }

        return okay;

    }

    //arrays
    public static void tamanioArray() {
        Scanner teclado = new Scanner(System.in);
        int i, tamanio;
        System.out.println("Introduce el tamaño del array: ");
        tamanio = teclado.nextInt();
        int[] numeros = new int[tamanio];
        for (i = 0; i < numeros.length; i++) {
            System.out.printf("Introduzca número %d: ", i + 1);
            numeros[i] = teclado.nextInt();
        }
        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
