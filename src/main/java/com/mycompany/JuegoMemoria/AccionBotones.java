package com.mycompany.JuegoMemoria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class AccionBotones implements ActionListener{

    private JButton [][] arregloBotones;
    private int columas;
    private int filas;
    
    public  AccionBotones(JButton [][] botones , int columnas, int Filas){
        this.arregloBotones = botones;
        this.columas = columnas;
        this.filas = Filas;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columas; j++) {
                if(e.getSource().equals(this.arregloBotones[i][j])){
                    
                }
            }
        }
    }
    
}
