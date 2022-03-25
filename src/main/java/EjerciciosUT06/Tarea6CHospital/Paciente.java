package EjerciciosUT06.Tarea6CHospital;

import java.util.Random;

public class Paciente extends Persona{
    private String numeroHistoria;

    public Paciente(String nombre, String apellidos, NIF nif, String numeroHistoria) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }

    public void tomarMedicina(String medicina){
        System.out.println("El médico Menganito trata a Fulanito con la medicina" + medicina );
        Random r = new Random();
        if(r.nextBoolean()==true){
            System.out.println("El paciente se curó");
        }else {
            System.out.println("El paciente no se curó");
        }
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    @Override
    public String toString() {
        return super.toString() + "Paciente{" +
                "numeroHistoria='" + numeroHistoria + '\'' +
                '}';
    }
}
