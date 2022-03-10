package EjerciciosUT06.ej02;

public class Testing {
    public static void main(String[] args) {
        Turismo t1 = new Turismo("matricula0", "marcamarca", "modelomodelo", "colorcolor", 12.1, true, 2);
        System.out.println(t1.getAtributos());
        Deportivo d1 = new Deportivo("deportivo","marcadeportivo","deportivomodelo","rojoferrari",10,999,1);
        System.out.println(d1.getAtributos());
        Furgoneta furgo = new Furgoneta("furgoneta", "furgonetamarca", "furgonetamodelo", "blanco", 16, true);
        System.out.println(furgo.getAtributos());


    }
}
