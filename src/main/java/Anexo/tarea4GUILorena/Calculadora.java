package Anexo.tarea4GUILorena;

import javax.swing.*;

//LINK
//https://github.com/lorena-olay/javamaven/tree/master/src/main/java/Anexo/tarea4GUILorena
public class Calculadora {
    //En un nuevo proyecto, llamado tarea4GUI+tunombre y usando el ejemplo de la calculadora que hay en los apuntes,
    // implementa la aplicación para que al menos se puedan realizar las operaciones aritméticas básicas con dos operandos.
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora");
        frame.setBounds(250, 250, 0, 0);
        frame.add(new PanelPrincipal());

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

    }

}
