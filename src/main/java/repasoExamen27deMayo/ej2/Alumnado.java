package repasoExamen27deMayo.ej2;

import java.util.Objects;

public class Alumnado {
    private String codMunicipio;
    private String municipio;
    private Double a2016;
    private Double a2015;
    private Double a2014;
    private Double a2013;
    private Double a2011;
    private Double a2010;
    private Double a2006;
    private Double a2001;
    private Double a1996;

    public Alumnado() {
    }

    public Alumnado(String codMunicipio, String municipio, Double a2016, Double a2015, Double a2014, Double a2013, Double a2011, Double a2010, Double a2006, Double a2001, Double a1996) {
        this.codMunicipio = codMunicipio;
        this.municipio = municipio;
        this.a2016 = a2016;
        this.a2015 = a2015;
        this.a2014 = a2014;
        this.a2013 = a2013;
        this.a2011 = a2011;
        this.a2010 = a2010;
        this.a2006 = a2006;
        this.a2001 = a2001;
        this.a1996 = a1996;
    }

    public String getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(String codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Double getA2016() {
        return a2016;
    }

    public void setA2016(Double a2016) {
        this.a2016 = a2016;
    }

    public Double getA2015() {
        return a2015;
    }

    public void setA2015(Double a2015) {
        this.a2015 = a2015;
    }

    public Double getA2014() {
        return a2014;
    }

    public void setA2014(Double a2014) {
        this.a2014 = a2014;
    }

    public Double getA2013() {
        return a2013;
    }

    public void setA2013(Double a2013) {
        this.a2013 = a2013;
    }

    public Double getA2011() {
        return a2011;
    }

    public void setA2011(Double a2011) {
        this.a2011 = a2011;
    }

    public Double getA2010() {
        return a2010;
    }

    public void setA2010(Double a2010) {
        this.a2010 = a2010;
    }

    public Double getA2006() {
        return a2006;
    }

    public void setA2006(Double a2006) {
        this.a2006 = a2006;
    }

    public Double getA2001() {
        return a2001;
    }

    public void setA2001(Double a2001) {
        this.a2001 = a2001;
    }

    public Double getA1996() {
        return a1996;
    }

    public void setA1996(Double a1996) {
        this.a1996 = a1996;
    }

    @Override
    public String toString() {
        return "Alumnado{" +
                "codMunicipio='" + codMunicipio + '\'' +
                ", municipio='" + municipio + '\'' +
                ", a2016='" + a2016 + '\'' +
                ", a2015='" + a2015 + '\'' +
                ", a2014='" + a2014 + '\'' +
                ", a2013='" + a2013 + '\'' +
                ", a2011='" + a2011 + '\'' +
                ", a2010='" + a2010 + '\'' +
                ", a2006='" + a2006 + '\'' +
                ", a2001='" + a2001 + '\'' +
                ", a1996='" + a1996 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnado alumnado = (Alumnado) o;
        return Objects.equals(codMunicipio, alumnado.codMunicipio) && Objects.equals(municipio, alumnado.municipio) && Objects.equals(a2016, alumnado.a2016) && Objects.equals(a2015, alumnado.a2015) && Objects.equals(a2014, alumnado.a2014) && Objects.equals(a2013, alumnado.a2013) && Objects.equals(a2011, alumnado.a2011) && Objects.equals(a2010, alumnado.a2010) && Objects.equals(a2006, alumnado.a2006) && Objects.equals(a2001, alumnado.a2001) && Objects.equals(a1996, alumnado.a1996);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codMunicipio, municipio, a2016, a2015, a2014, a2013, a2011, a2010, a2006, a2001, a1996);
    }
}
