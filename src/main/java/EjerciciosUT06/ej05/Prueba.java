package EjerciciosUT06.ej05;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Nombre2", "DNI2", 2);
        Cliente c3 = new Cliente("Nombre2", "DNI2", 2);
        Cliente c4 = new Cliente("Nombre2", "DNI2", 2);
        Cliente c5 = new Cliente("Nombre5", "DNI5", 5);
        ArrayList<Cliente> lista = new ArrayList<>();
        ArrayList<Cliente> listadiferentes = new ArrayList<>();
        ArrayList<Cliente> listaiguales = new ArrayList<>();

        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);
        for (Cliente c : lista){
            System.out.println(c.hashCode());
            if (c.equals(c)){
            listaiguales.add(c);
            }else {
                listadiferentes.add(c);
            }
        }
        System.out.println("***IGUALES***");
        System.out.println(listaiguales);
        System.out.println("***DIFERENTES***");
        System.out.println(listadiferentes);


    }
}
