package ej2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lectura {
    public static void leer(String nombre) {
        List<String[]> datos = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(nombre),"us-ascii")) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                linea = linea.replaceAll("D", "diamante");
                linea = linea.replaceAll("P", "PICAS ");
                linea = linea.replaceAll("T", "TREBOLES ");
                linea = linea.replaceAll("C", "CORAZONES ");
                System.out.println("NAIPES");
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
