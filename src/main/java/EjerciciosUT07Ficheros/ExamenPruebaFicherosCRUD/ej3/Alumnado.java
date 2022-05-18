package EjerciciosUT07Ficheros.ExamenPruebaFicherosCRUD.ej3;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Alumnado implements Comparable<String> {
    private String nombreAlumno;
    private TreeMap<String, String> map = new TreeMap<>();

    public Alumnado() {
    }

    public Alumnado(String nombreAlumno, TreeMap<String, String> map) {
        this.nombreAlumno = nombreAlumno;
        this.map = map;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public TreeMap<String, String> getMap() {
        return map;
    }

    public void setMap(TreeMap<String, String> map) {
        this.map = map;
    }

    public String convertWithStream(Map<String, String> map) {
        String mapAsString = map.keySet().stream()
                .map(key -> key + ":" + map.get(key))
                .collect(Collectors.joining("][", "", ""));
        return mapAsString;
    }

    @Override
    public String toString() {
        return "[" + nombreAlumno + "]\n" +
                "[" + convertWithStream(map) + "]";
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
