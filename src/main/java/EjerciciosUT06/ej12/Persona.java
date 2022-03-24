package EjerciciosUT06.ej12;

public abstract class Persona {
    private String nombre, apellidos, NIF;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String NIF) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", NIF='" + NIF + '\'' +
                '}';
    }
}
