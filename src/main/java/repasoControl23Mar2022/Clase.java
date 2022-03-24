package repasoControl23Mar2022;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Clase {
    public static long edad(){
        LocalDate today = LocalDate.now();
        LocalDate born = LocalDate.of(1995, Month.JUNE, 21);
        return ChronoUnit.YEARS.between(born, today);
    }

}
