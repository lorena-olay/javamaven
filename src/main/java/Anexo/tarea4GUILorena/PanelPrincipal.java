package Anexo.tarea4GUILorena;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel implements ActionListener {

    // Atributos de la clase (privados)
    private PanelBotones botonera;
    private JTextArea areaTexto;
    private int tipoOperacion;

    // Constructor
    public PanelPrincipal(){
        initComponents();
        tipoOperacion = -1; // No hay operaciones en la calculadora
    }

    // Se inicializan los componentes gráficos y se colocan en el panel
    private void initComponents(){
        // Creamos el panel de botones
        botonera = new PanelBotones();
        // Creamos el área de texto
        areaTexto = new JTextArea(10,50);
        areaTexto.setEditable(false);
        areaTexto.setBackground(Color.white);

        //Establecemos layout del panel principal
        this.setLayout(new BorderLayout());
        // Colocamos la botonera y el área texto
        this.add(areaTexto, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);

        for (JButton boton: this.botonera.getgrupoBotones()){
            boton.addActionListener(this);
        }


    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Se obtiene el objeto que desencadena el evento
        Object o = ae.getSource();
        // Si es un botón
        if (o instanceof JButton){
            System.out.println(((JButton) o).getText());
            areaTexto.setText(((JButton) o).getText());
        }

        // RESTO DEL CÓDIGO DE LA LÓGICA DE LA CALCULADORA
    }

}

