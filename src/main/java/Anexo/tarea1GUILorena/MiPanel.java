package Anexo.tarea1GUILorena;

import javax.swing.*;
import java.awt.*;

public class MiPanel extends JPanel {

    // Añadimos un componente de tipo etiqueta (JLabel)
    private JLabel etiqueta;

    // Constructor pasando un color, que llama al método initComponents(),
    public MiPanel(Color color){
        initComponents();
        cambiarColorFondo(color);
    }

    // Método que inicializa los elementos gráficos del formulario
    private void initComponents(){
        // Construimos la etiqueta con el texto que queremos que muestre
        etiqueta = new JLabel("Etiqueta de MiPanel");
        // Añade la etiqueta al contenedor MiPanel (al JPanel)
        this.add(etiqueta);
    }

    private void cambiarColorFondo(Color color){
        // Establece el color de fondo del panel
        this.setBackground(color);
    }

    // Método getter
    public JLabel getEtiqueta() {
        return etiqueta;
    }
}
