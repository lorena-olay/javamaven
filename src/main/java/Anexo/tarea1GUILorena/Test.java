package Anexo.tarea1GUILorena;

import javax.swing.*;

public class Test {
    //a . El color de los paneles sea diferente al del ejemplo.
    //b . El nombre de la ventana sea tu nombre y apellidos.
    //c . La ventana no sea redimensionable.
    //d . El texto que se muestre en cada uno de los cinco paneles de
    // color sea diferente (pista: crea los paneles de forma independiente,
    // accede a su etiqueta y cambia el texto de la misma usando el método
    // setText de la etiqueta).
    public static void main(String[] args) {
        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Lorena Olay Unciano");
        // Establecemos posición y tamaño
        //ventanaPrincipal.setBounds(250, 250, 800, 600);
        ventanaPrincipal.setBounds(250, 250, 800, 600);
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);
        // Acción por defecto al pulsar el botón de cierre
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
