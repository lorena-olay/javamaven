package EjerciciosUT07Ficheros.ExamenPruebaFicherosCRUD.ej3;

import EjerciciosUT07Ficheros.ExamenPruebaFicherosCRUD.ej2.RegistroJSON;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class RegistrosToAlumnado {

    public static List<Alumnado> jsonalist(List<RegistroJSON> lista) {
        List<Alumnado> alumnado = new ArrayList<>();
        TreeMap<String, String> map = new TreeMap<String, String>();
        for (RegistroJSON r : lista) {
            map.put("oACV", r.getoACV());
            map.put("eA", r.getcEAC());
            map.put("tII", r.gettII());
            map.put("tC", r.gettC());
            map.put("iNG", r.getiNG());
            map.put("fOL", r.getfOL());
            map.put("cEAC", r.getcEAC());
            Alumnado aux = new Alumnado(r.getAlumnoA(), map);
            alumnado.add(aux);
        }
        return alumnado;
    }
}





