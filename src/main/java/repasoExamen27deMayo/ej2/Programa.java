package repasoExamen27deMayo.ej2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {
    /*
    public static double promedio(List<Alumnado> lista){
        return lista.stream()
                .collect(averaginDouble(x->x.getA1996()));
    }
    
     */

    public static <T> void escribirCsv(String nombre, List<Alumnado> datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            //TODO: modificar segun sea conveniente
            bw.write("Municipio;2016;2015;2014;2013;2011;2010;2006;2001;1996;Promedio");
            bw.newLine();
            Comparator<Alumnado> porMunicipio = (Alumnado a1, Alumnado a2) -> a1.getMunicipio().compareTo(a2.getMunicipio());
            //Comparator<Alumnado> porPorcentaje1 = (Alumnado a1, Alumnado a2) -> (int) (a1.getA1996()-a2.getA1996());
            //Comparator<Alumnado> porMunicipio = (Alumnado a1, Alumnado a2) -> a1.getMunicipio().compareTo(a2.getMunicipio());
            Double n = Double.valueOf(0);
            Double promedio;
            List<Alumnado> listaordenada = datos.stream()
                    .sorted(porMunicipio)
                    .collect(Collectors.toList());
            for (Alumnado dato : listaordenada) {
                bw.write(dato.getMunicipio());
                bw.write(";");
                ArrayList<Double> lis1 = new ArrayList<>();

                lis1.add(dato.getA1996());
                lis1.add(dato.getA2001());
                lis1.add(dato.getA2006());
                lis1.add(dato.getA2010());
                lis1.add(dato.getA2011());
                lis1.add(dato.getA2013());
                lis1.add(dato.getA2014());
                lis1.add(dato.getA2015());
                lis1.add(dato.getA2016());
                List<Double> listaanios=
                lis1.stream().sorted((a1,a2)->a1.compareTo(a2)).collect(Collectors.toList());
                for (int i = 0 ; i< listaanios.size();i++){
                    bw.write(String.valueOf(listaanios.get(i)));
                    bw.write("%");
                    bw.write(";");
                }

                for (int i = 0; i < lis1.size(); i++) {
                    n += lis1.get(i);
                }
                promedio = n / lis1.size();
                if (promedio > 50) {
                    bw.write(String.valueOf(promedio));
                }
                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        LecturaCSV.leerCsv("./indicator.csv").forEach(System.out::println);
        Programa.escribirCsv("./csv.csv", LecturaCSV.leerCsv("./indicator.csv"));
    }
}
