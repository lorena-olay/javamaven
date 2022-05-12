package ej3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void cartaPoker(String nombre) {
        List<String[]> datos = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(nombre),"us-ascii")) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                linea = linea.replaceAll("D", "diamante");
                linea = linea.replaceAll("P", "PICAS ");
                linea = linea.replaceAll("T", "TREBOLES ");
                linea = linea.replaceAll("C", "CORAZONES ");
                System.out.println("carta necesaria para poker: ");
                //if(linea.)
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
