package ut05estructuradealmacenamiento.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class minecraftmain {
    public static ArrayList<String> obsidiana(ArrayList arr) {
        if (arr.contains("agua") && arr.contains("lava")) {
            arr.add("obsidiana");
        }

        return arr;
    }

    public static ArrayList<String> borrar(ArrayList arr) {
        if (arr.contains("obsidiana")) {
            arr.remove("lava");
            arr.remove("agua");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<String> cubos = new ArrayList<>();
        ArrayList<String> othercubos = new ArrayList<>(Arrays.asList("piedra", "madera", "diamante"));
        System.out.println(othercubos);
        cubos.add("agua"); //0
        cubos.add("lava");//1
        cubos.add("hielo");//2
        cubos.add("arenisca");//3
        System.out.println(cubos);
        System.out.println(obsidiana(cubos));
        System.out.println(borrar(cubos));
        System.out.println(cubos.get(1));//tiene q salir lava
        cubos.set(0, "piedra");
        System.out.println(cubos);
        cubos.remove(0);
        System.out.println(cubos);
        System.out.println(cubos.size());
        for (int i = 0; i < cubos.size(); i++) {
            System.out.println(cubos.get(i));
        }
        System.out.println("-----------------------------------------------");
        Collections.sort(cubos);
        for (String i : cubos) {
            System.out.println(i);
        }
        System.out.println("************************************************");
        System.out.println(cubos.hashCode());
        System.out.println(cubos.equals(othercubos));
        cubos.clear();
        System.out.println(cubos);
    }
}
