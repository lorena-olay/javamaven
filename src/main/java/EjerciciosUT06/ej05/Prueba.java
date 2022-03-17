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
        int contador = 0;
        for(int i=0;i<lista.size();i++){
            contador=0;
            for (int j=0;j<lista.size();j++){
                if(lista.get(i).equals(lista.get(j))){
                    contador++;
                }
            }
            if(contador>1&&!listaiguales.contains(lista.get(i))){
                listaiguales.add(lista.get(i));
            }
            if (contador==1){
                listadiferentes.add(lista.get(i));
            }
        }
        System.out.println("***IGUALES***");
        System.out.println(listaiguales);
        System.out.println("***DIFERENTES***");
        System.out.println(listadiferentes);
        System.out.println(c2.equals(null));

    }
}
