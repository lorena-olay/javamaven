package EjerciciosUT07Ficheros.ej09;

import EjerciciosUT06.ej02.Vehiculo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LeerFicheroVehiculo {
    public static void main(String[] args) throws FileNotFoundException {
        //7.- Realiza un programa que lea los datos del ejercicio 4. Para ello creará una lista de objetos de
        // tipo Vehículo. El programa irá almacenando en la lista los objetos leídos desde el archivo de texto
        // “vehículos.txt”. Una vez cargados todos los datos en la lista, ordena los vehículos por Marca y muestra
        // el resultado por consola.
        String idFichero = "vehículos.txt";
        String linea;
        String[] token;
        ArrayList<Vehiculo> listavehiculo = new ArrayList<>();
        Vehiculo auxvehiculo;
        System.out.println("Leyendo el fichero: " + idFichero);
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                token = linea.split(":");
                auxvehiculo = new Vehiculo(token[0],token[1],token[2],token[3],Double.parseDouble(token[4]));
                //if ()
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

