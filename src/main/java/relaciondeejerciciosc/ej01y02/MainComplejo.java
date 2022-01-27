package relaciondeejerciciosc.ej01y02;

import static relaciondeejerciciosc.ej01y02.Complejo.*;

public class MainComplejo {



        public static void main(String[] args) {
            Complejo Z1;
            Complejo Z2;
            String resultadosuma, resultadoresta, resultadomultiplicacion;
            Z1 = new Complejo(2, -1);
            Z2 = new Complejo(4, 3);
            resultadosuma = suma(Z1, Z2);
            resultadoresta = resta(Z1, Z2);
            resultadomultiplicacion = multiplicacion(Z1, Z2);
            System.out.println(resultadosuma);
            System.out.println(resultadoresta);
            System.out.println(resultadomultiplicacion);
        }
    }

