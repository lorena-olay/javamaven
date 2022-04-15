package Anexo.tarea2GUILorena;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


// Se implementa la interfaz
public class Saludo extends JPanel {
    //a. Incluye un botón nuevo, con el texto "Generar Aleatorio".
    private JButton botonrandom;
    //b. Incluye una etiqueta (JLabel) en la que inicialmente se muestre el texto "Número"
    private JTextArea numero;
    //c. Añade al botón "Generar Aleatorio" un controlador de eventos, usando clases internas anónimas, de forma que al
    // pulsar sobre él, se genere un número aleatorio entre 0 y 10 y se muestre en la etiqueta (JLabel).

    private JButton botonSaludar, botonDespedir;
    private JTextArea texto;

    public Saludo() {
        initComponents();
    }

    private void initComponents() {

        botonSaludar = new JButton("Nombre");
        botonDespedir = new JButton("Apellidos");
        botonrandom = new JButton("Generar Aleatorio");
        texto = new JTextArea(1, 25);
        numero = new JTextArea(1, 25);
        this.setLayout(new FlowLayout());
        this.add(botonSaludar);
        this.add(botonDespedir);
        this.add(texto);
        this.add(botonrandom);
        this.add(numero);
// Se le indica al objeto boton que escuche eventos tipo click
// y se pasa como argumento una referencia de tipo ActionListener
// En este caso se pasa this que es el panel sobre el
// que está el botón y que implementa la interfaz ActionListener
        // Clase anónima (sin nombre) anidada (dentro de un método)

        //d. Añade al botón "Generar Aleatorio" un controlador de eventos del tipo MouseListener, implementado solamente los
        // métodos mouseEntered y mouseExited, de forma que cuando el ratón se sitúe sobre el botón cambie de color (elige
        // uno que te guste) y cuando el ratón salga de la zona del botón, vuelva a su color original.
        botonrandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero.setText("Numero "+Math.floor(Math.random()*10));
            }
        });
        botonrandom.addMouseListener(new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent e) {
                botonrandom.setBackground(Color.PINK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botonrandom.setBackground(getForeground());//primer plano
            }

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }


        });



        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setBackground(Color.WHITE);
                texto.setText("Lorena");
            }
        });

        botonDespedir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonDespedirActionPerformed(e);
            }
        });


    }

    private void botonDespedirActionPerformed(ActionEvent e) {

        // Código a ejecutar
        texto.setBackground(Color.BLUE);
        texto.setText("Olay Unciano");
    }


}
