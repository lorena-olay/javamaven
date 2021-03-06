package EjerciciosUT07Ficheros.ExamenPruebaFicherosCRUD.ej2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class LecturaJSON<T> {
    public static <T> ArrayList<T> leerArchivoJSON1(String nombre,Class<T> clase) {
        ArrayList<T> datos = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule()); //para poder manejar fechas
        try {
            datos.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, clase)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return datos;
    }

    public static ArrayList<RegistroJSON> leerFicheroJSON(String idFichero) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        ArrayList<RegistroJSON> calificaciones = mapeador.readValue(new File(idFichero),
                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class));
        return calificaciones;
    }
}
