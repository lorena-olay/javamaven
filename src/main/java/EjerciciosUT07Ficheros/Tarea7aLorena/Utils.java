package EjerciciosUT07Ficheros.Tarea7aLorena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Utils {
    //A partir de una lista de empleados y un nombre, indique si hay algún empleado con ese nombre.
    public boolean EmpleadoNombreExiste(ArrayList<Empleado> lista, String nombre) {
        Stream<ArrayList<Empleado>> s = Stream.of(lista);
        return s.anyMatch(empleados -> lista.contains(nombre)); //???
    }

    //A partir de una lista de empleados y un nombre de departamento, indique el número de empleados Coordinadores de ese departamento.
    public int EmpleadosDepartmentoNumCoordinadores(ArrayList<Empleado> lista, String departamentoNombre) {
        Stream<ArrayList<Empleado>> s = Stream.of(lista);
        return s.;
    }
    //A partir de una lista de empleados y una letra del NIF (char), obtener una nueva lista ordenada alfabéticamente
    // SOLO con los apellidos de los empleados cuyo NIF contenga esa letra.
    public ArrayList<Empleado> EmpleadoLetra(ArrayList<Empleado> lista, CharSequence letra){
        ArrayList<Empleado> listaOrdenada = new ArrayList<>();
        for (Empleado e:lista){
            if (e.getDni().contains(letra)){
                listaOrdenada.add(e);
            }
        }
        Collections.sort(listaOrdenada,(Empleado o1, Empleado o2)->o1.getNombre().compareTo(o2.getNombre()));
        return listaOrdenada;
    }
    //A partir de una lista de empleados y una fecha, obtener una nueva lista con los NIF (ordenados de forma inversa)
    // de todos los empleados cuya toma de posesión coincida con esa fecha.
    //public
}
