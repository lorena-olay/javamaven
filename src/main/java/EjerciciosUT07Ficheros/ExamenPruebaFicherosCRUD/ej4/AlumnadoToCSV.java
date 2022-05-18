package EjerciciosUT07Ficheros.ExamenPruebaFicherosCRUD.ej4;

import EjerciciosUT07Ficheros.ExamenPruebaFicherosCRUD.ej3.Alumnado;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;

public class AlumnadoToCSV {
    public void generarFicheroAlumno(Alumnado obj, TreeMap<String, String> map){

    }
    //Metodo para crear directorios
    //Ej: si pones una ruta "./ej1/ejercicios" te crea dos carpetas
    //Ej: si has creado anteriormente "./ej1" y pones "./ej1/ejemplo" te crea dentro de ej1 un carpeta llamada ejemplo
    public static void crearCarpetas(String nombreCarpeta) {
        Path directorio = Paths.get(nombreCarpeta);

        try {
            if (!Files.exists(directorio)) {
                Files.createDirectories(directorio);
                System.out.println("Se ha creado el directorio");
            }

        } catch (AccessDeniedException ade) {
            System.out.println("No tienes permisos");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
