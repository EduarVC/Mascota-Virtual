package com.mycompany.JFrameMascotaVirtual;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EstablecerImagenes {
     private ImageIcon imagen;
    private Icon icono;
    
     public final void establecerImagen(JLabel lbl, String ruta){
       this.imagen = new ImageIcon(ruta);
       this.icono = new ImageIcon(
               this.imagen.getImage().getScaledInstance(
                       lbl.getWidth(), 
                       lbl.getHeight(), 
                       Image.SCALE_DEFAULT));
       lbl.setIcon(this.icono);
//       this.repaint();
    }
}
