package EjerciciosUT06.Tarea6CHospital;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Grupo {
    C(17.5),
    D(18),
    E(18.5);
    private double irpf;

    Grupo(double irpf) {
        this.irpf = irpf;
    }

    public double getIrpf() {
        return irpf;
    }
    private static final List<Grupo> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();
    public static Grupo randomLetter() { return VALUES.get(RANDOM.nextInt(SIZE)); }

}
