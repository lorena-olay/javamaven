package EjerciciosUT06.ej13;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Random;

public class Prueba {
    public static Direccion crearDireccion(){
        Random r = new Random();
        String[] calles={"Peral","Calvario","Calbario","Kalbario"};
        String[] ciudad={"Malaga","DeLocos","Estepona","Oh"};
        String[] pais={"NuncaJamas","China","Rusia","Portugal"};
        return new Direccion(calles[r.nextInt(calles.length)],ciudad[r.nextInt(ciudad.length)], RandomStringUtils.randomNumeric(5),pais[r.nextInt(pais.length)]);
    }
    public static Estudiante crearEstudiante(){
        Random r = new Random();
        String[] nombre={"Paulo","Arturo","Teresa","Fernando"};
        String[] apellidos={"Domingo","Nalgona","Hoffmann","Garcia"};
        return new Estudiante(nombre[r.nextInt(nombre.length)],apellidos[r.nextInt(apellidos.length)],RandomStringUtils.randomNumeric(9),crearDireccion(),RandomStringUtils.randomNumeric(9));
    }
    public static Profesor crearProfesor(){
        Random r = new Random();
        String[] nombre={"Paulo","Arturo","Teresa","Fernando"};
        String[] apellidos={"Domingo","Nalgona","Hoffmann","Garcia"};
        String[] especialidad={"Lengua","BBDD","Administracion","Sistemas"};
        return new Profesor(nombre[r.nextInt(nombre.length)],apellidos[r.nextInt(apellidos.length)],RandomStringUtils.randomNumeric(9),crearDireccion(),especialidad[r.nextInt(especialidad.length)]);
    }

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        ArrayList<Identificable> lista2 = new ArrayList<>();
        for (int i=0;i<4;i++){
            Estudiante e = crearEstudiante();
            lista.add(e);
        }
        for (int k=0;k<4;k++){
            Profesor p =  crearProfesor();
            lista.add(p);
        }
        System.out.println("*********************************LISTA PERSONA*******************************************");
        for (Persona p: lista) {
            System.out.println("*********IDENTIFICATE********");
            p.identificate();
            System.out.println("*********TO STRING********");
            System.out.println(p.toString());
            System.out.println("*********INTANCIANDO********");
            if (p instanceof Estudiante){
                System.out.println("ID del estudiante: "+((Estudiante) p).getID());
            }else if (p instanceof Profesor){
                System.out.println("Especialidad del profesor: "+((Profesor) p).getEspecialidad());
            }
        }
        //¿Puedes crear objetos de la clase Persona?
        //RESPUESTA: No porque no se puede intanciar objetos de una clase abstracta, solo se puede isntanciar de sus hijas
        //Repite el ejercicio pero usando una lista de objetos de tipo Identificable. ¿Por qué es posible?
        //RESPUESTA:??? Puedo ejecutarlo pero no aparece nada
        System.out.println("*********************************LISTA IDENTIFICABLE*******************************************");
        for (Identificable i: lista2) {
            System.out.println("*********IDENTIFICATE********");
            i.identificate();
            System.out.println("*********TO STRING********");
            System.out.println(i.toString());
            System.out.println("*********INTANCIANDO********");
            if (i instanceof Estudiante){
                System.out.println("ID del estudiante: "+((Estudiante) i).getID());
            }else if (i instanceof Profesor){
                System.out.println("Especialidad del profesor: "+((Profesor) i).getEspecialidad());
            }
        }
    }
}



























