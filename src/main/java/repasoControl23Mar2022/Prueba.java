package repasoControl23Mar2022;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Prueba {
    public static void main(String[] args) {
        //System.out.println(Clase.edad());
        Locale spanishLocale = new Locale("es","ES");
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy", spanishLocale);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", spanishLocale);
        System.out.println(dateFormat.format(LocalDate.now()));

    }
}
