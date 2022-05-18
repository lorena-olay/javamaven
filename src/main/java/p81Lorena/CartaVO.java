package p81Lorena;

import java.time.LocalDate;

public class CartaVO {
    private int pk;
    private String contenido;
    private LocalDate fecha;
    private boolean recordado;

    public CartaVO() {
    }

    public CartaVO(int pk, String contenido, LocalDate fecha, boolean recordado) {
        this.pk = pk;
        this.contenido = contenido;
        this.fecha = fecha;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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
                ", fecha=" + fecha +
                ", recordado=" + recordado +
                '}';
    }
}
