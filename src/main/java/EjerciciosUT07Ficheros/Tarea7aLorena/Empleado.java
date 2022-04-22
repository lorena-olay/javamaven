package EjerciciosUT07Ficheros.Tarea7aLorena;

import java.time.LocalDate;

public class Empleado {

    private String nombre;
    private String dni;
    private String puesto;
    private LocalDate fechaDeToma;
    private LocalDate FechaDeCese;
    private String Teléfono;
    private String Evaluador;
    private String Coordinador;

    public Empleado() {
    }

    public Empleado(String nombre, String dni, String puesto, LocalDate fechaDeToma, LocalDate FechaDeCese, String Teléfono, String Evaluador, String Coordinador) {
        this.nombre = nombre;
        this.dni = dni;
        this.puesto = puesto;
        this.fechaDeToma = fechaDeToma;
        this.FechaDeCese = FechaDeCese;
        this.Teléfono = Teléfono;
        this.Evaluador = Evaluador;
        this.Coordinador = Coordinador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFechaDeToma() {
        return fechaDeToma;
    }

    public void setFechaDeToma(LocalDate fechaDeToma) {
        this.fechaDeToma = fechaDeToma;
    }

    public LocalDate getFechaDeCese() {
        return FechaDeCese;
    }

    public void setFechaDeCese(LocalDate FechaDeCese) {
        this.FechaDeCese = FechaDeCese;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String Teléfono) {
        this.Teléfono = Teléfono;
    }

    public String isEvaluador() {
        return Evaluador;
    }

    public void setEvaluador(String Evaluador) {
        this.Evaluador = Evaluador;
    }

    public String isCoordinador() {
        return Coordinador;
    }

    public void setCoordinador(String Coordinador) {
        this.Coordinador = Coordinador;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + ", puesto=" + puesto + ", fechaDeToma=" + fechaDeToma + ", FechaDeCese=" + FechaDeCese + ", Tel\u00e9fono=" + Teléfono + ", Evaluador=" + Evaluador + ", Coordinador=" + Coordinador + '}';
    }

}
