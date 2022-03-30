package EjerciciosUT06.Tarea6CHospital;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class GestionHospital {
    //- En el main(),
    // debes crear un hospital,
    // contratar cinco empleados (2 médicos y 3 administrativos) e
    // ingresar a 5 pacientes.
    // De entre los médicos y los pacientes del hospital, elige un médico y un paciente, aleatoriamente,
    // para que ese medico trate a ese paciente con Pancetamol :).
    // Ejecuta el método abstracto de todos los empleados.
    // Renueva el NIF a un paciente cualquiera.
    public static Paciente crearPaciente(){
        Random r = new Random();
        String[] nombres = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String[] apellidos = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String numeroHisoria = RandomStringUtils.randomNumeric(6).toUpperCase();
        NIF nif = new NIF();
        return new Paciente(nombres[r.nextInt(nombres.length)], apellidos[r.nextInt(apellidos.length)], nif, numeroHisoria);
    }
    public static Medico crearMedico(){
        Random r = new Random();
        String[] nombres = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String[] apellidos = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String numeroSeguridadSocial = RandomStringUtils.randomNumeric(9).toUpperCase();
        Double salario = Double.valueOf(RandomStringUtils.randomNumeric(4).toUpperCase());
        String[] especialidad = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        NIF nif = new NIF();
        return new Medico(nombres[r.nextInt(nombres.length)], apellidos[r.nextInt(apellidos.length)], nif, numeroSeguridadSocial, salario, especialidad[r.nextInt(especialidad.length)]);
    }
    public static Administrativo crearPersonalPAS(){
        Random r = new Random();
        String[] nombres = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String[] apellidos = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String numeroSeguridadSocial = RandomStringUtils.randomNumeric(9).toUpperCase();
        Double salario = Double.valueOf(RandomStringUtils.randomNumeric(4).toUpperCase());
        NIF nif = new NIF();
        return new Administrativo(nombres[r.nextInt(nombres.length)], apellidos[r.nextInt(apellidos.length)],nif, numeroSeguridadSocial, salario, Grupo.randomLetter());
    }

    public static void main(String[] args) {
        ArrayList<Empleado> lista = new ArrayList<>();
        Hospital hospital = new Hospital("Hospital", "Direccion", "camas");
        for(int i=0; i<5;i++){
            Paciente p = crearPaciente();
            hospital.ingresarPaciente(p);
        }
        for(int z=0; z<2;z++){
            Medico m = crearMedico();
            hospital.contratarEmpleado(m);
            lista.add(m);
        }
        for(int j=0; j<3;j++){
            Administrativo a = crearPersonalPAS();
            hospital.contratarEmpleado(a);
            lista.add(a);
        }
        for (Empleado e : lista){
            System.out.println(String.format("%.2f",e.calcularIRPF())+" €");
        }
        crearPaciente().renovarNIF(LocalDate.now().plusWeeks(1));
        crearMedico().tratar(crearPaciente(), "Paracetamol");
    }
}
