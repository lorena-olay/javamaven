package EjerciciosUT06.Tarea6CHospital;

import java.time.LocalDate;

public class GestionHospital {
    public static void main(String[] args) {
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



    }
}
