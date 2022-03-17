package EjerciciosUT06.ej07;

import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {
        //cree una lista de cuatro Trabajadores.
        // Añade en la lista dos objetos Camarero y dos objetos del tipo inventado por ti.  Finalmente recorre la lista
        // y llama al método cotizar() de cada uno de los trabajadores, comprobando el comportamiento polimórfico de dicho método.
        ArrayList<Trabajador> lista = new ArrayList<>();
        Camarero c1 = new Camarero();
        Camarero c2 = new Camarero();
        lista.add(c1);
        lista.add(c2);
        lista.add(new Cocinero());
        lista.add(new Cocinero());
        for (Trabajador t : lista){
            t.cotizar();
        }
    }
}
