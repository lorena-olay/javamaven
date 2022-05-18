package p81Lorena;

public class CartaVO {
    private int pk;
    private String contenido;
    private boolean recordado;

    public CartaVO() {
    }

    public CartaVO(int pk, String contenido, boolean recordado) {
        this.pk = pk;
        this.contenido = contenido;
        this.recordado = recordado;
    }


    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }


    public boolean isRecordado() {
        return recordado;
    }

    public void setRecordado(boolean recordado) {
        this.recordado = recordado;
    }

    @Override
    public String toString() {
        return "CartaVO{" +
                "pk=" + pk +
                ", contenido='" + contenido + '\'' +
                ", recordado=" + recordado +
                '}';
    }
}
