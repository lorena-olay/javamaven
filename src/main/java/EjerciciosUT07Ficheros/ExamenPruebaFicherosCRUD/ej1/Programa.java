package EjerciciosUT07Ficheros.ExamenPruebaFicherosCRUD.ej1;

import EjerciciosUT07Ficheros.ExamenPruebaFicherosCRUD.ej2.LecturaJSON;
import EjerciciosUT07Ficheros.ExamenPruebaFicherosCRUD.ej2.RegistroJSON;
import EjerciciosUT07Ficheros.ExamenPruebaFicherosCRUD.ej3.RegistrosToAlumnado;

import java.io.IOException;

public class Programa {
    public static void main(String[] args) throws IOException {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++LECTURA CSV+++++++++++++++++++++++++++++++++++++++++++++++++\n");
        LecturaCSV.CSVaMap("./nombresModulos.csv").forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++LECTURA JSON+++++++++++++++++++++++++++++++++++++++++++++++++\n");
        LecturaJSON.leerFicheroJSON("./calificacionesGrupo.json").forEach(System.out::println);
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++LISTA DE X OBJ A LISTA DE Y OBJ+++++++++++++++++++++++++++++++++++++++++++++++++\n");
        RegistrosToAlumnado.jsonalist(LecturaJSON.leerArchivoJSON1("./calificacionesGrupo.json", RegistroJSON.class)).forEach(System.out::println);

    }
}
