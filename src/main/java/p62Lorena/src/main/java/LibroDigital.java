import java.util.Objects;

public class LibroDigital extends Libro implements SeDescarga{
    private String numKBytes;

    public LibroDigital(double codigo, double precio, double iva, String descripcion, String isbn, String numKBytes) {
        super(codigo, precio, iva, descripcion, isbn);
        this.numKBytes = numKBytes;
    }

    public String getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(String numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public void edicion() {
        System.out.println("Edición: Audio Libro, Lenguaje de signos, Video y Animación");

    }

    @Override
    public String toString() {
        return super.toString()+" LibroDigital{" +
                "numKBytes=" + numKBytes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibroDigital)) return false;
        if (!super.equals(o)) return false;
        LibroDigital that = (LibroDigital) o;
        return Objects.equals(getNumKBytes(), that.getNumKBytes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumKBytes());
    }

    @Override
    public int compareTo(Libro o) {
        int resultado=0;
        if (this.getIsbn().equals(o.getIsbn())) {
            resultado = 1;
        } else  {
            resultado = -1;
        }
        return resultado;
    }

    @Override
    public void descargar() {
        System.out.println("http://tunombre.daw/"+hashCode());
    }

}
