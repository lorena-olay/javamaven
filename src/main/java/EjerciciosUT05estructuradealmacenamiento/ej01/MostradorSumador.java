package EjerciciosUT05estructuradealmacenamiento.ej01;

public class MostradorSumador {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("índice array: " + i);
            System.out.println("array: " + arr + " este es la direccion de memoria");
            sum+=arr[i];
            System.out.println("suma: " + sum);
        }
        System.out.println("Array Sum = "+sum);

    }
}



