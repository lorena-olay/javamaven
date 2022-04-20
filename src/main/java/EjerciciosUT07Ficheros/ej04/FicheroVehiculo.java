package EjerciciosUT07Ficheros.ej04;

import EjerciciosUT06.ej02.Deportivo;
import EjerciciosUT06.ej02.Furgoneta;
import EjerciciosUT06.ej02.Turismo;
import EjerciciosUT06.ej02.Vehiculo;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
//Guarda los vehículos en un fichero de texto llamado “vehículos.txt”, haciendo uso del método polimórfico toString(), teniendo en cuenta que el string devuelto lleve separados
// los campos del objeto por el carácter dos puntos (:).
//Cada línea del fichero estará compuesta por un número, un espacio, un guión, un espacio y los datos del vehículo en cuestión. El número de cada línea será 0, 1 o 2 si el objeto
// es un Turismo, un Deportivo o una Furgoneta, respectivamente.
public class FicheroVehiculo {
    static Random r = new Random();
    static String[] marcas = {"audi", "ford", "tesla", "jeep", "renolt"};
    static String[] modelos = {"golf", "grande", "cuadrado", "hueco", "todo incluido"};
    static String[] colores = {"celeste", "naranja", "negro", "blanco", "magenta"};
    //Crea 30 vehículos (10 Turismos, 10 Deportivos y 10 Furgonetas) con valores de tu elección y guárdalos en una lista de objetos tipo Vehiculo.
    public static Turismo crearTurismo() {
        return new Turismo(RandomStringUtils.randomAlphanumeric(5).toUpperCase(Locale.ROOT),marcas[r.nextInt(marcas.length)],modelos[r.nextInt(modelos.length)],colores[r.nextInt(colores.length)],Math.rint(5),r.nextBoolean(),(int)Math.random()*4);
    }
    public static Deportivo crearDeportivo() {
        return new Deportivo(RandomStringUtils.randomAlphanumeric(5).toUpperCase(Locale.ROOT),marcas[r.nextInt(marcas.length)],modelos[r.nextInt(modelos.length)],colores[r.nextInt(colores.length)],Math.rint(5),(int)Math.random()*3,(int)Math.random()*2);
    }
    public static Furgoneta crearFurgoneta() {
        return new Furgoneta(RandomStringUtils.randomAlphanumeric(5).toUpperCase(Locale.ROOT),marcas[r.nextInt(marcas.length)],modelos[r.nextInt(modelos.length)],colores[r.nextInt(colores.length)],Math.rint(5),r.nextBoolean());
    }
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        for(int i=0;i<10;i++){
            listaVehiculos.add(crearTurismo());
        }
        for(int i=0;i<10;i++){
            listaVehiculos.add(crearDeportivo());
        }
        for(int i=0;i<10;i++){
            listaVehiculos.add(crearFurgoneta());
        }

        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "vehículos.txt";
        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))){
            for (Vehiculo v: listaVehiculos) {
                if(v instanceof Turismo){
                    flujo.write( 0 + " - " + v.getMatricula()+":"+v.getMarca()+":"+v.getModelo()+":"+v.getColor()+":"+v.getTarifa()+":"+((Turismo) v).isMarchaAutomatica()+":"+((Turismo) v).getPuertas()+":");//Cada vehículo irá en una línea distinta del fichero.
                    flujo.newLine();//cuanto menos toquemos las clases modelo mejor
                }else if(v instanceof Deportivo){
                    flujo.write( 1 + " - " + v.toString());
                    flujo.newLine();
                }else {
                    flujo.write( 2 + " - " + v.toString());
                    flujo.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
