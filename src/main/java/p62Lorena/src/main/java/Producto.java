import java.util.Objects;

public abstract class Producto {
    private double codigo;
    private double precio;
    private double iva;
    private String descripcion;

    public Producto() {
    }

    public Producto(double codigo, double precio, double iva, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.iva = iva;
        this.descripcion = descripcion;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", iva=" + iva +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.getIva(), getIva()) == 0 && Objects.equals(getCodigo(), producto.getCodigo()) && Objects.equals(getPrecio(), producto.getPrecio()) && Objects.equals(getDescripcion(), producto.getDescripcion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getPrecio(), getIva(), getDescripcion());
    }
}
