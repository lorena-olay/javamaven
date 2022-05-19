/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendjavajson;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Programa {

    public static void main(String[] args) throws JsonProcessingException {
        String url1 = "https://jsonplaceholder.typicode.com/users";
        mostrarLibros(url1);
        System.out.println("-------------------");
    }
    

    public static void mostrarLibros(String url) {       
        String respuesta = "";
        ConexionHTTP conexion = new ConexionHTTP();
        Json mapeador = new Json();

        try {
            respuesta = conexion.peticionHttpGet(url);
            ArrayList<Empleado> lista = mapeador.stringToList(respuesta);
            lista.forEach(l -> System.out.println(l.getID() + " " + l.getName()));
        } catch (Exception e) {
            // Manejar excepción
            System.out.println("Error durante la conexión HTTP");
            e.printStackTrace();
        }
    }

}
