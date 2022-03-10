package ut05estructuradealmacenamiento.emparejandocalcetines.emparejandocalcetines;
import java.util.List;
import java.util.Random;
public enum Tallas {
        CUARENTA,
        CUARENTAYUNO,
        CUARENTAYDOS,
        CUARENTAYTRES,
    ;


    private static final List<Tallas> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Tallas randomTallas()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    Tallas() {
    }
}
