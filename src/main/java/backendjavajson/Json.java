/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendjavajson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;

public class Json {

    public ArrayList<Empleado> stringToList(String json) throws JsonProcessingException {
        ObjectMapper mapeador = new ObjectMapper();

        ArrayList<Empleado> catalogo = mapeador.readValue(json,
                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Empleado.class));
        
        return catalogo;
    }
    
    public Empleado stringToPojo(String json) throws JsonProcessingException {
        ObjectMapper mapeador = new ObjectMapper();

        Empleado libro = mapeador.readValue(json,Empleado.class);
        
        return libro;
    }
}
