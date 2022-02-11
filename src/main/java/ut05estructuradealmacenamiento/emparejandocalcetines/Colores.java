package ut05estructuradealmacenamiento.emparejandocalcetines;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Colores {
    NEGRO,
    GRISCLARO,
    GRISOSCURO,
    ;

    private static final List<Colores> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Colores randomColores()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    Colores() {
    }
}

