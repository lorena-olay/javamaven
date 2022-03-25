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
        return new Paciente(nombres[r.nextInt(5)], apellidos[r.nextInt(5)], new NIF(), numeroHisoria);
    }
    public static Medico crearMedico(){
        Random r = new Random();
        String[] nombres = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String[] apellidos = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String numeroSeguridadSocial = RandomStringUtils.randomNumeric(9).toUpperCase();
        Double salario = Double.valueOf(RandomStringUtils.randomNumeric(4).toUpperCase());
        String[] especialidad = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        return new Medico(nombres[r.nextInt(2)], apellidos[r.nextInt(2)], new NIF(), numeroSeguridadSocial, salario, especialidad[r.nextInt(2)]);
    }
    public static Administrativo crearPersonalPAS(){
        Random r = new Random();
        String[] nombres = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String[] apellidos = {"NOMBRE", "NOMBRE1", "NOMBRE2", "NOMBRE3", "NOMBRE4"};
        String numeroSeguridadSocial = RandomStringUtils.randomNumeric(9).toUpperCase();
        Double salario = Double.valueOf(RandomStringUtils.randomNumeric(4).toUpperCase());
        return new Administrativo(nombres[r.nextInt(3)], apellidos[r.nextInt(3)], new NIF(), numeroSeguridadSocial, salario, Grupo.randomLetter());
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
            System.out.println(String.format("%.2f",e.calcularIRPF()));
        }

        crearPaciente().renovarNIF(LocalDate.now().plusWeeks(1));

        crearMedico().tratar(crearPaciente(), "Paracetamol");





        /*
        Hospital hospital = new Hospital("Hospital", "Direccion", "camas");
        NIF n1 = new NIF("NIF1",LocalDate.of(2023, 1,1));

        Empleado  medico1 = new Medico("Medico1", "ApellidosMedico1", n1, "NumeroSeguridadSocial1", 1000,
                "Cirujano");
        Empleado  medico2 = new Medico("Medico2", "ApellidosMedico2", new NIF("NIF2",
                LocalDate.of(2023, 1,1)), "NumeroSeguridadSocial1", 500,
                "traumatologo");
        Empleado admin1 = new Administrativo("Admin1", "ApellidosAdmin1", new NIF("NIF3",
                LocalDate.of(2023, 1,1)), "NumeroSeguridadSocial1", 5000,
                Grupo.E);
        Empleado admin2 = new Administrativo("Admin2", "ApellidosAdmin2", new NIF("NIF4",
                LocalDate.of(2023, 1,1)), "NumeroSeguridadSocial1", 5000,
                Grupo.C);
        Empleado admin3 = new Administrativo("Admin3", "ApellidosAdmin3", new NIF("NIF5",
                LocalDate.of(2023, 1,1)), "NumeroSeguridadSocial1", 5000,
                Grupo.D);
        Paciente paciente1 = new Paciente("Paciente1", "ApellidosPaciente1", new NIF("NIF6",
                LocalDate.of(2023, 1,1)), "NumeroHistorial1");
        Paciente paciente2 = new Paciente("Paciente1", "ApellidosPaciente1", new NIF("NIF6",
                LocalDate.of(2023, 1,1)), "NumeroHistorial1");
        Paciente paciente3 = new Paciente("Paciente1", "ApellidosPaciente1", new NIF("NIF6",
                LocalDate.of(2023, 1,1)), "NumeroHistorial1");
        Paciente paciente4 = new Paciente("Paciente1", "ApellidosPaciente1", new NIF("NIF6",
                LocalDate.of(2023, 1,1)), "NumeroHistorial1");
        Paciente paciente5 = new Paciente("Paciente1", "ApellidosPaciente1", new NIF("NIF6",
                LocalDate.of(2023, 1,1)), "NumeroHistorial1");

        hospital.ingresarPaciente(paciente1);
        hospital.ingresarPaciente(paciente2);
        hospital.ingresarPaciente(paciente3);
        hospital.ingresarPaciente(paciente4);
        hospital.ingresarPaciente(paciente5);
*/


    }
}
