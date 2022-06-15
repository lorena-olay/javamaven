package repaso12May.ej2;

import repaso12May.ej1.Baraja;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leertxt {
    public static ArrayList<Baraja> leer(String nombre) {
        List<String[]> datos = new ArrayList<>();
        ArrayList<Baraja> rondas = new ArrayList<>();
        Baraja baraja = new Baraja();
        baraja.crearBaraja();
        try (Scanner sc = new Scanner(new File(nombre), "us-ascii")) {
            String[] tokens = new String[0];
            ArrayList<String> numero = new ArrayList<>();
            ArrayList<String> palo = new ArrayList<>();
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                System.out.println(linea);
                tokens = linea.split(" ");

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return rondas;
    }
}
