package EjerciciosUT07Ficheros.Tarea7aLorena;

import java.util.ArrayList;
import java.util.Collections;

public class Utils {
    //A partir de una lista de empleados y un nombre, indique si hay algún empleado con ese nombre.
    public void EmpleadoNombreExiste(ArrayList<Empleado> lista, String nombre) {
        if (lista.contains(nombre)) {
            System.out.println("Existen empleados con el nombre: " + nombre);
        }
    }

    //A partir de una lista de empleados y un nombre de departamento, indique el número de empleados Coordinadores de ese departamento.
    public void EmpleadosDepartmentoNumCoordinadores(ArrayList<Empleado> lista, String departamentoNombre) {
        int numero=0;
        for (Empleado e : lista) {
            if (e.getPuesto().equals(departamentoNombre)) {
                if (e.isCoordinador().equals("Sí")) {
                    numero++;
                }
            }
        }
        System.out.println("El número de empleados Coordinadores de "+departamentoNombre+" es "+numero);
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
