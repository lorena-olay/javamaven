package EjerciciosUT06.palindromos;

public class Palindromo {
    public static void esPalindromo(String palabra){
        int a=0;
        int z=palabra.length()-1;
        boolean diferente=false;
        while (a<z) {
            if (palabra.charAt(a) == palabra.charAt(z)) {
                a++;
                z--;
            } else {
                diferente = true;
            }
            esPalindromo(palabra);
        }
        if (!diferente){
            System.out.println("PALINDROMO");
        }else {
            System.out.println("NO PALINDROMO");
        }

    }
    public static void main(String[] args) {
        String x = "loco";
        esPalindromo(x);

    }
}
