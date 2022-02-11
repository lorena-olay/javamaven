package ut05estructuradealmacenamiento.emparejandocalcetines;

public class Calcetin {
    private Colores color;
    private  Tallas talla;

    
    public static String crearCalcetin(){
        String calcetin = Colores.randomColores() + " " + Tallas.randomTallas();
        System.out.println(calcetin);
        return calcetin;
    }


}
