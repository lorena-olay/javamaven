/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p81Lorena;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J. Carlos F. Vico <jcarlosvico@maralboran.es>
 */
public class Programa {

    public static void main(String[] args) {
        
        
        CartaDAO daoCarta = new CartaDAO();
        List<CartaVO> listaCartas = new ArrayList<>();
        listaCartas.add(new CartaVO(1,"Contenido1",false));
        listaCartas.add(new CartaVO(2,"Contenido2",false));
        listaCartas.add(new CartaVO(3,"Contenido3",true));
        listaCartas.add(new CartaVO(4,"Contenido4",true));
        listaCartas.add(new CartaVO(5,"Contenido5",true));
        
        try {
            
            System.out.println("Nº personas insertadas " + daoCarta.insertCarta(listaCartas));
            System.out.println("-----------------------------------------");
            System.out.println("Comprobamos en una nueva lista que se recogen los datos desde la tabla.");
            List<CartaVO> nuevaLista = daoCarta.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Carta con primary key 1: ");
            System.out.println(daoCarta.findByPk(1));
            System.out.println("-----------------------------------------");
            System.out.println("Se va a borrar la persona con pk 3");
            System.out.println("Nº personas borradas " + 
                    daoCarta.deleteCarta(new CartaVO(3,"Pablo Pérez", false)));
            System.out.println("-----------------------------------------");
            nuevaLista = daoCarta.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de borrar una persona -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Modificación de la persona con pk 5");
            System.out.println("Nº Cartas modificadas " + 
                    daoCarta.updateCarta(5, new CartaVO(7,"NuevoNombre", false)));
            System.out.println("-----------------------------------------");
            nuevaLista = daoCarta.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de modificar una persona -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Ejecución del procedimiento almacenado");
            System.out.println("Se cambia María Weston por Felipe Román");
            System.out.println("Nombres cambiados " + daoCarta.cambiarAOlvidado(5));
            System.out.println("-----------------------------------------");
            nuevaLista = daoCarta.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de ejecutar proced. -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
        } catch (SQLException sqle) {
            System.out.println("No se ha podido realizar la operación:");
            System.out.println(sqle.getMessage());
        }
        System.out.println();
        listaCartas.forEach(System.out::println);

    }

}
