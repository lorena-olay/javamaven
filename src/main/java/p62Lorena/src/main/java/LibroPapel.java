import java.util.Objects;

public final class LibroPapel extends Libro implements SeEnvia{
    private String numPaginas;

    public LibroPapel(double codigo, double precio, double iva, String descripcion, String isbn, String numPaginas) {
        super(codigo, precio, iva, descripcion, isbn);
        this.numPaginas = numPaginas;
    }

    @Override
    public void enviar(String Direccion) {
        System.out.println("Descipción: "+getDescripcion()+"\nTipo: "+getClass()+"\nDirección: "+Direccion);

    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = String.valueOf(numPaginas);
    }

    @Override
    public void edicion() {
        System.out.println("Edicion: Tapa Dura, Tapa Blanda, Edición Bolsillo, Edición Especial");

    }

    @Override
    public String toString() {
        return super.toString()+" LibroPapel{" +
                "numPaginas=" + numPaginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibroPapel)) return false;
        if (!super.equals(o)) return false;
        LibroPapel that = (LibroPapel) o;
        return getNumPaginas() == that.getNumPaginas();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumPaginas());
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

}
