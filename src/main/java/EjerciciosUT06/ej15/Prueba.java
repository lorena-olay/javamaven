package EjerciciosUT06.ej15;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Legislador> lista = new ArrayList<>();
        lista.add(new Diputado("PrinciaLegislaor", "PartidoLegislador", 3));
        lista.add(new Senador("ProvinciaSenador", "PartidoSenador", 3.14));

        for (Legislador x:lista) {
            System.out.println(x.toString());
        }
    }
}
