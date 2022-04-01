import java.util.Objects;

public abstract class Libro extends Producto implements Comparable<Libro>{
    private String isbn;

    public Libro(double codigo, double precio, double iva, String descripcion, String isbn) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    public abstract void edicion();

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return super.toString()+" Libro{" +
                "isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        if (!super.equals(o)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(getIsbn(), libro.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIsbn());
    }

    public abstract int compareTo(Libro o);
}
