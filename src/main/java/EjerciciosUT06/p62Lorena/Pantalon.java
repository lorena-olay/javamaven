package EjerciciosUT06.p62Lorena;
import java.util.Objects;

public final class Pantalon extends Ropa{
    private String talla;
    public Pantalon(double codigo, double precio, double iva, String descripcion, String marca, String talla) {
        super(codigo, precio, iva, descripcion, marca);
        this.talla = talla;
    }
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }
    @Override
    public void enviar(String Direccion) {
        System.out.println("Descipción: "+getDescripcion()+"\nTipo: "+getClass()+"\nDirección: "+Direccion);

    }
    @Override
    public String toString() {
        return super.toString()+" Pantalon{" +
                "talla='" + talla + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pantalon)) return false;
        if (!super.equals(o)) return false;
        Pantalon pantalon = (Pantalon) o;
        return Objects.equals(getTalla(), pantalon.getTalla());
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTalla());
    }
}
