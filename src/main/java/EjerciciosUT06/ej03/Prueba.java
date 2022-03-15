package EjerciciosUT06.ej03;

public class Prueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Nombre", "NIF", 21);
        Empleado empleado = new Empleado("Empleado", "NIFEMPLEADO", 24, 1000);
        Programador programador = new Programador("Programador", "NIFPROGRAMADOR", 30, 2000, Categoria.JUNIOR);

        System.out.println(persona.toString());
        //persona. NO PODEMOS ACCEDER A GETSALARIO()
        programador.getSalario();
        System.out.println("******************");
        System.out.println(empleado.toString());
        System.out.println("******************");
        System.out.println(programador.toString());
        System.out.println(programador.getNombre());
    }
}
