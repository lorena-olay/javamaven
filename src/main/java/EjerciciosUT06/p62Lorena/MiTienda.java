package EjerciciosUT06.p62Lorena;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MiTienda {
    //Métodos para crear instancias de cada objeto de forma aleatoria
    public static Musica crearMusica(){
        Random r = new Random();
        return new Musica(Math.random()*1000,2,0.21,"Descripcion","Grupo");
    }
    public static Pantalon crearPantalon(){
        Random r = new Random();
        return new Pantalon( Math.random()*1000,2,0.21,"Descripcion","Marca",RandomStringUtils.randomNumeric(2));
    }
    public static LibroPapel crearLibroPapel(){
        Random r = new Random();
        return new LibroPapel( Math.random()*1000,1,0.21,"Descripcion",RandomStringUtils.randomNumeric(1),RandomStringUtils.randomNumeric(3));
    }
    public static LibroDigital crearLibroDigital(){
        Random r =new Random();
        return new LibroDigital( Math.random()*1000,5,0.21,"Descripcion",RandomStringUtils.randomNumeric(1),RandomStringUtils.randomNumeric(2));
    }
/*
    public static int busquedaBinariaRecursiva(ArrayList<String> arreglo, String busqueda, int izquierda, int derecha) {
        // Si izquierda es mayor que derecha significa que no encontramos nada
        if (izquierda > derecha) {
            return -1;
        }
        // Calculamos las mitades...
        int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
        String elementoDelMedio = (String) arreglo.get(indiceDelElementoDelMedio);
        // Primero vamos a comparar y luego vamos a ver si el resultado es negativo,
        // positivo o 0
        int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);
        // Si el resultado de la comparación es 0, significa que ambos elementos son iguales
        // y por lo tanto quiere decir que hemos encontrado la búsqueda
        if (resultadoDeLaComparacion == 0) {
            return indiceDelElementoDelMedio;
        }
        // Si no, entonces vemos si está a la izquierda o derecha
        if (resultadoDeLaComparacion < 0) {
            derecha = indiceDelElementoDelMedio - 1;
            return busquedaBinariaRecursiva(arreglo, busqueda, izquierda, derecha);
        } else {
            izquierda = indiceDelElementoDelMedio + 1;
            return busquedaBinariaRecursiva(arreglo, busqueda, izquierda, derecha);
        }
    }
 */
    public static void main(String[] args) {
        //Crea una lista de productos y añade dos objetos de cada tipo de producto distinto (de los posibles) a la misma.
        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(crearLibroDigital());
        lista.add(crearLibroDigital());
        lista.add(crearMusica());
        lista.add(crearMusica());
        lista.add(crearPantalon());
        lista.add(crearPantalon());
        lista.add(crearLibroPapel());
        lista.add(crearLibroPapel());
        //Muestra los datos de los productos usando un foreach y el método toString(). Contesta usando un comentario en el código: ¿es toString() un método polimórfico? Justifica la respuesta.
        for (Producto p: lista) {
            System.out.println(p.toString()); //toString es un método polimórfico porque es el mismo método en diferentes clases pero que puede darnos diferentes resultados ya que podemos sobreescribir su funcionamiento en cada clase
        }
        //Ordena la lista de productos según el precio, haciendo uso de <<Comparator>> y una expresión lambda.
        Collections.sort(lista,(p1,p2)-> (int) (p1.getPrecio()-p2.getPrecio()));
        //Muestra la lista de productos ordenados por precio.
        System.out.println("ORDEN POR PRECIO");
        for (Producto p: lista) {
            System.out.println(p.toString());
        }
        //Ordena la lista de productos según el código, haciendo uso de <<Comparator>> y una expresión lambda.
        Collections.sort(lista,(p1,p2)-> (int) (p1.getCodigo()-p2.getCodigo()));
        //Muestra la lista de productos ordenados por código.
        System.out.println("ORDENADO POR CÓDIGO");
        for (Producto p: lista) {
            System.out.println(p.toString());
        }
        //Realiza la búsqueda binaria según su código de algún producto que exista dentro de la lista y otro que no
        // exista, mostrando la posición que ocupa en la lista.
        Producto n = new LibroDigital(12,13,21,"D","1234","21");
        Collections.binarySearch(lista,n,(l1,l2)->l1.getDescripcion().compareTo(l2.getDescripcion()));

        //Recorre la lista de productos y guarda todos los libros en una lista de libros.
        ArrayList<Libro> biblioteca = new ArrayList<>();
        for (Producto p: lista) {
            if(p instanceof Libro){//conversion explicita
                biblioteca.add((Libro) p);
            }
        }
        //Muestra los datos de la lista de libros usando un foreach y el método toString().
        System.out.println("LISTA LIBROS");
        for (Libro l: biblioteca) {
            System.out.println(l.toString());//metodo polimorfico
        }
        //Ordena los libros según ISBN, haciendo uso de <<Comparable>>.!!
        System.out.println("ORDEN ISBN");
        for (Libro l: biblioteca) {
            l.compareTo(l);
            System.out.println(l.toString());//metodo polimorfico
        }
        //Muestra la lista de libros ordenada.
        System.out.println("ORDENADA");
        biblioteca.sort(Libro::compareTo);
        for (Libro l: biblioteca) {
            System.out.println(l.toString());//metodo polimorfico
        }
        //Recorre de nuevo la lista de libros y en cada iteración, ejecuta enviar() o descargar() en función del tipo de libro.
        System.out.println("BIBLIOTECA: ENVIAR Y DESCARGAR");
        for (Libro l: biblioteca) {
            if (l instanceof LibroDigital){//conversion explicita
                ((LibroDigital) l).descargar();
            }else if(l instanceof LibroPapel){//conversion explicita
                ((LibroPapel) l).enviar("Direccion");//metodo polimorfico, en ropa tmb está
            }
        }
        //Indica las líneas de código donde se realizan conversiones implícitas y/o explícitas, así como los métodos polimórficos que hay en la jerarquía.
        //Utiliza el método contains(Object) sobre la lista de libros para comprobar si existe un libro o no existe.
        for (Libro l: biblioteca) {
            if(biblioteca.contains(l)){
                System.out.println("Contiene");
            }else {
                System.out.println("No contiene");
            }
        }
        //Usando la lista de productos inicial, crea una nueva lista con todos los objetos del tipo <<SeEnvía>>.
        ArrayList<SeEnvia> paquete = new ArrayList<>();
        for (Producto p: lista) {
            if(p instanceof SeEnvia){
                paquete.add((SeEnvia) p);
            }
        }
        //Recorre la lista de objetos <<SeEnvía>> y llama al método de la interfaz.
        for (SeEnvia s : paquete){
            s.enviar("Direccion");
        }
        //Inventa un método abstracto en Libro que tenga comportamientos diferentes en las subclases. Implementa los métodos en las clases hijas.
        for (Libro l: biblioteca) {
            l.edicion();
        }


    }
}
