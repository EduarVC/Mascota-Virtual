
package com.mycompany.Controladores;

import com.mycompany.Personajes.Jugador;
import com.mycompany.mascotas.Mascota;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ControladorComboBox {
    private Jugador jugador;
    
    public ControladorComboBox(){
        jugador = new Jugador();
    }
    
    public void InicializarCbo(JComboBox cmbMascotasJugador) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbMascotasJugador.getModel();
        for (Mascota mascota : jugador.getMascotasAdquiridas()) {
            model.addElement(mascota.getNombreMascota());
        }
    } 
}
