package ut05estructuradealmacenamiento.emparejandocalcetines;

import java.util.ArrayList;
import java.util.Objects;

public class Calcetin {
    private Colores color;
    private  Tallas talla;

    public Calcetin() {

    }

    public Calcetin(Colores color, Tallas talla) {
        this.color = color;
        this.talla = talla;
    }

    public Colores getColor() {
        return color;
    }

    public Tallas getTalla() {
        return talla;
    }

    @Override
    public String toString() {
        return "Calcetin{" +
                "color=" + color +
                ", talla=" + talla +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calcetin)) return false;
        Calcetin calcetin = (Calcetin) o;
        return color == calcetin.color && talla == calcetin.talla;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, talla);
    }

    public static Calcetin crearCalcetin(){
        Calcetin calcetin = new Calcetin(Colores.randomColores(), Tallas.randomTallas());
        System.out.println(calcetin);
        return calcetin;
    }


}
