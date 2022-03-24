package EjerciciosUT06.Tarea6CHospital;

public class Administrativo extends Empleado{
    private Grupo grupo;

    public Administrativo(String nombre, String apellidos, NIF NIF, String numeroSeguridadSocial, double salario, Grupo grupo) {
        super(nombre, apellidos, NIF, numeroSeguridadSocial, salario);
        this.grupo = grupo;
    }

    public void registrarDocumento(String nombreDoc){
        System.out.println(getNombre()+ " "+ getApellidos()+ "\n Documento: "+ nombreDoc+ nombreDoc.hashCode());

    }

    @Override
    public double calcularIRPF() {
        return 0;
    }


}
