/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Include;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author LAB-USR-CAQP-C0201
 */
public class Cargarimagenes extends javax.swing.JFrame {
    private Cargarimagenes jPanelConFondo1 = new Cargarimagenes();
    private Cargarimagenes jPanelConFondo2 = new Cargarimagenes();   
 
//    public CargaImagenes1() {
//        //...
//        cargarImagenes();
//    }
// 
    private void cargarImagenes() {
        Image imagenInterna = new ImageIcon(
           getClass().getResource("satelite.jpg")).getImage();
        jPanelConFondo1.setIconImage(imagenInterna);
 
        Image imagenExterna = 
            new ImageIcon("tierra.jpg").getImage();
        jPanelConFondo2.setIconImage(imagenExterna);
    }
 
    //...     
}
