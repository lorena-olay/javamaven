package EjerciciosUT06.ej13;

public class Direccion {
    private String nomCalle, nomCiudad, nompais;
    private int codPostal;

    public Direccion() {
    }

    public Direccion(String nomCalle, String nomCiudad, String nompais, int codPostal) {
        this.nomCalle = nomCalle;
        this.nomCiudad = nomCiudad;
        this.nompais = nompais;
        this.codPostal = codPostal;
    }

    public String getNomCalle() {
        return nomCalle;
    }

    public void setNomCalle(String nomCalle) {
        this.nomCalle = nomCalle;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    public String getNompais() {
        return nompais;
    }

    public void setNompais(String nompais) {
        this.nompais = nompais;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "nomCalle='" + nomCalle + '\'' +
                ", nomCiudad='" + nomCiudad + '\'' +
                ", nompais='" + nompais + '\'' +
                ", codPostal=" + codPostal +
                '}';
    }
}
