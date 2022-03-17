package EjerciciosUT06.ej11;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(10, 12)); // Base=10 Altura=12
        figuras.add(new Triangulo(10, 5)); // Base=10 Altura=5
        figuras.add(new Romboide(15, 5)); // Base=15, Altura=5
        //Figura figura = new Figura(1,2);
        // No podemos crear objetos de la clase abstracta,
        // aun así dejamos sus constructores para que las clases hijas lo usen
        for (Figura f : figuras) {
            System.out.println("Área: ");
            System.out.println(f.area());
        }


    }
}
