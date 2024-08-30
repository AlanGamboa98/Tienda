/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel con la imagen del banner.
 */
@SuppressWarnings("serial")
public class PanelImagen extends JPanel {
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel. <br>
     * <b>post: </b> Panel qued� inicializado.
     */
    public PanelImagen() {
        JLabel imagen = new JLabel();
        ImageIcon icono = new ImageIcon("./data/Encabezado.png");
        imagen = new JLabel("");
        imagen.setIcon(icono);
        add(imagen);
    }

}
