package EjerciciosUT06.ej13;

import java.util.ArrayList;
import java.util.Random;

public class Prueba {
    /*
    * Crea una lista de personas (con la clase ArrayList) y prueba a añadir varios alumnos y varios profesores a la lista.
    * Recorre la lista y llama al método identificate() de cada objeto. Muestra los datos de cada objeto. Usa el operador
    * instanceof en cada iteración para mostrar la clase de cada uno de los objetos y llamar al método getID si es un Estudiante
    * o llamar al método getEspecialidad si es un Profesor. ¿Puedes crear objetos de la clase Persona?
    * Repite el ejercicio pero usando una lista de objetos de tipo Identificable. ¿Por qué es posible?
    * */
    public static Direccion crearDireccion(){
        Random r = new Random();
        String[] calles={"Peral","Felicidad","Amor","Paz"};
        String[] ciudad={"Málaga","Marbella","Estepona","Madrid"};
        String[] pais={"México","España","Portugal","Francia"};
        int[] codpostal={29866,26844,4555,1242};
        return new Direccion(calles[r.nextInt(calles.length)],ciudad[r.nextInt(ciudad.length)],pais[r.nextInt(pais.length)],codpostal[r.nextInt(codpostal.length)] );
    }

    public static Profesor crearProfesor(){
        Random r = new Random();
        String[] nombres= {"Paula","Arturo","Fernanda","Luisa"};
        String[] apellidos={"de la Barrera", "Chavez","Hoffmann","Olay"};
        String[] NIF={"11111111","22222222","33333333","44444444"};
        return new Profesor(nombres[r.nextInt(nombres.length)],apellidos[r.nextInt(apellidos.length)],NIF[r.nextInt(NIF.length)],crearDireccion() );
    }


    public static void main(String[] args) {
        ArrayList<Persona> list = new ArrayList<>();
        System.out.println(crearDireccion());


    }
}
