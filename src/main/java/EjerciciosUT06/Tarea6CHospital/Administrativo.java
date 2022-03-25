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
        if (getGrupo()==Grupo.C){
            return ((getSalario()*Grupo.C.getIrpf()/100)+getSalario());
        }else if(getGrupo()==Grupo.D){
            return ((getSalario()*Grupo.D.getIrpf()/100)+getSalario());
        }else if (getGrupo()==Grupo.E){
            return ((getSalario()*Grupo.E.getIrpf()/100)+getSalario());
        }
        return 0;//si no entra en ningun grupo devuelve 0
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return super.toString() + "Administrativo{" +
                "grupo=" + grupo +
                '}';
    }
}
