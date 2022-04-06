package EjerciciosUT06.p62Lorena;
import java.util.Objects;

public abstract class Ropa extends Producto implements SeEnvia{
    private String marca;
    public Ropa(double codigo, double precio, double iva, String descripcion, String marca) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }
    public Ropa(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return super.toString()+" Ropa{" +
                "marca='" + marca + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ropa)) return false;
        Ropa ropa = (Ropa) o;
        return Objects.equals(getMarca(), ropa.getMarca());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getMarca());
    }
}
