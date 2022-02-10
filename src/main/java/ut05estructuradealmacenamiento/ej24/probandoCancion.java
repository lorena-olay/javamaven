package ut05estructuradealmacenamiento.ej24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ut05estructuradealmacenamiento.ej24.Cancion.eliminaCancion;

public class probandoCancion {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>(Arrays.asList("I need some sleep", "mood", "Point of no return", "Courtesy call"));
        Cancion cancion = new Cancion(songs);
        ArrayList<String> aux = new ArrayList<>(Arrays.asList("mood"));

       /*
        Cancion.grabarCancion("canciongrabada");
        Cancion.numeroCanciones();
        Cancion.escucharCancion(1);
        Cancion.eliminaCancion(4);

        */
    }
}
