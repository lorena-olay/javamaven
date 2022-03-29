package EjerciciosUT06.ej14;

import java.util.ArrayList;

public class Prueba {
    //18.- Implementa la interfaz Comparable en las clases Frigorífico y Microondas del ejercicio 14.
    public static void main(String[] args) {
        ArrayList<Silencioso> lista = new ArrayList<>();
        //Crea una lista de objetos de tipo Silencioso. ¿Por qué no puedes incluir en esta lista los objetos de tipo CampanaExtractora?
        //Sí puedo ???!!!
        lista.add(new Frigorifico(22,"Frigo",50));
        lista.add(new Microondas(1, "Micro", 20));
        lista.add(new CampanaExtractora(12,"Campana",60));
        for (Silencioso s: lista) {
            System.out.println(s.toString());
        }

    }
}
