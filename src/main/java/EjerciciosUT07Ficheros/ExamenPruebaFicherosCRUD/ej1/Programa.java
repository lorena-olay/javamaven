package EjerciciosUT07Ficheros.ExamenPruebaFicherosCRUD.ej1;

public class Programa {
    public static void main(String[] args) {
        LecturaCSV.CSVaMap("./nombresModulos.csv").forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
