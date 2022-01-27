package relaciondeejerciciosc.ej15;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class Fecha{
    int dia, mes, ano;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2022;
    }


    public boolean comprobarFecha(Fecha fecha) {
        boolean diaCorrecto, mesCorrecto, anoCorrecto;
        anoCorrecto = fecha.getAno() > 0;
        mesCorrecto = fecha.getMes() >= 1 && fecha.getMes() <= 12;
        switch (fecha.getMes()) {
            case 2:
                if (esBisiesto(fecha)) {
                    diaCorrecto = fecha.getDia() >= 1 && fecha.getDia() <= 29;
                } else {
                    diaCorrecto = fecha.getDia() >= 1 && fecha.getDia() <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = fecha.getDia() >= 1 && fecha.getDia() <= 30;
                break;
            default:
                diaCorrecto = fecha.getDia() >= 1 && fecha.getDia() <= 31;
        }
        return diaCorrecto && mesCorrecto && anoCorrecto;
    }

    private boolean esBisiesto(Fecha fecha) { //año bisiesto
        boolean is;
        if ((fecha.getAno() % 4 == 0) && ((fecha.getAno() % 100 != 0) || (fecha.getAno() % 400 == 0))) {
            is = true;
        } else {
            is = false;
        }

        return is;
    }

    public Fecha(Fecha fecha) {
        if (comprobarFecha(fecha) == false) {
            throw new IllegalArgumentException();
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int diasMes(Fecha mes) {
        int dias;
        dias = mes.lengthOfMonth();
        return dias;
    }

    public String mostrarFechaCorta(Fecha fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MM yyyy");
        String fechaString = fecha.format(formato);
        return fechaString;
    }

    public String mostrarFechaLarga(Fecha fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaString = fecha.format(formato);
        return fechaString;
    }

    public MonthDay diaSemana(Fecha fecha) {
        MonthDay dia;
        dia = MonthDay.from(fecha);
        return dia;
    }

    public void setDia(int dia) {
        if (dia < 31 || dia > 31) {
            this.dia = Integer.parseInt(null);
        }
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            this.mes = Integer.parseInt(null);
        }
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1) {
            this.ano = Integer.parseInt(null);
        }
        this.ano = ano;
    }
}
