package Anexo.tarea1GUILorena;

import javax.swing.*;
import java.awt.*;

public class Test {

    public static void main(String[] args) {

        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Maximiliano Hoffmann Foyo");

        // Establecemos posición y tamaño
//        ventanaPrincipal.setBounds(200, 100, 400, 300);
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Añadimos un objeto MiPanel al JFrame
//        ventanaPrincipal.add(new MiPanel(Color.cyan)); // Este no se muestra
//        ventanaPrincipal.add(new MiPanel(Color.red));

//        ventanaPrincipal.pack();

        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadimos los paneles en cada posición del BorderLayout
        MiPanel panel1 = new MiPanel(Color.orange);
        MiPanel panel2 = new MiPanel(Color.blue);
        MiPanel panel3 = new MiPanel(Color.black);
        MiPanel panel4 = new MiPanel(Color.white);
        MiPanel panel5 = new MiPanel(Color.MAGENTA);
        panel1.getEtiqueta().setText("Naranja");
        panel2.getEtiqueta().setText("Mar");
        panel3.getEtiqueta().setText("Neumatico");
        panel4.getEtiqueta().setText("Papel");
        panel5.getEtiqueta().setText("Pincel");

        // Añadir panel amarillo en la posición superior (NORTH)
        ventanaPrincipal.add(panel1, BorderLayout.NORTH);

        // Añadir panel rojo en la posición inferior (SOUTH)
        ventanaPrincipal.add(panel2, BorderLayout.SOUTH);

        // Añadir panel gris en la posición central (CENTER)
        ventanaPrincipal.add(panel3, BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        ventanaPrincipal.add(panel4, BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
        ventanaPrincipal.add(panel5, BorderLayout.EAST);

        ventanaPrincipal.setResizable(false);

    }
}
