package repasoExamen27deMayo.ej3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EscribirJSON {
    public static <T> void escribirJSON(String nombre, List<T> datos) {
        ObjectMapper mappeador = new ObjectMapper();

        mappeador.registerModule(new JavaTimeModule()); //Formato fechas

        mappeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        try {
            mappeador.writeValue(new File(nombre), datos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
