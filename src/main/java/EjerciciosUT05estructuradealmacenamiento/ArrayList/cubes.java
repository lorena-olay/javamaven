package EjerciciosUT05estructuradealmacenamiento.ArrayList;

import java.util.ArrayList;

public class cubes {
    ArrayList<String> cubes = new ArrayList<String>(); // Create an ArrayList object

    public cubes(ArrayList<String> cubes) {
        this.cubes = cubes;
    }

    public ArrayList<String> getCubes() {
        return cubes;
    }

    public void setCubes(ArrayList<String> cubes) {
        this.cubes = cubes;
    }

    @Override
    public String toString() {
        return "cubes{" +
                "cubes=" + cubes +
                '}';
    }
}
