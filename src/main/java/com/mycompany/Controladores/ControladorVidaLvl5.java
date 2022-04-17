package com.mycompany.Controladores;

import com.mycompany.mascotas.Mascota;
import javax.swing.JOptionPane;

public class ControladorVidaLvl5 extends Thread{
    private Mascota mascota;
    public ControladorVidaLvl5(Mascota mascota){
        this.mascota = mascota;
    }
     @Override
    public void run() {
        int tiempoMuerte = 30000;
                try {
                    Thread.sleep(tiempoMuerte);
                } catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null, "Error en el Hilo de almientos");
                }
        mascota.setMuere(true);
    }
}
