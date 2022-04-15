package com.mycompany.JuegoMemoria;

import static com.mycompany.JuegoMemoria.AccionBotones.setArregloBotones;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JFrameMemoria extends javax.swing.JFrame {
    JButton [][] matriz;
    private int columnas;
    private int filas;
    public JFrameMemoria(int columnas, int filas) {
        initComponents();
        this.columnas = columnas;
        this.filas = filas;
        this.setLocationRelativeTo(this);
        setMatriz();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMemoria = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPMemoria.setBackground(new java.awt.Color(51, 51, 51));
        jPMemoria.setForeground(new java.awt.Color(102, 102, 102));
        jPMemoria.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setMatriz(){
        Font fuent = new Font("Arial",Font.BOLD,16);
        matriz = new JButton[filas][columnas];
        int x = 20;
        int y = 20;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz [i][j] = new JButton();
                matriz [i][j].setBackground(Color.DARK_GRAY);
                matriz [i][j].setBounds(y, x, 80, 80);
                matriz [i][j].setText("?");
                matriz [i][j].setFont(fuent);
                AccionBotones accion = new AccionBotones(filas, columnas);
                try {
                    matriz[i][j].addActionListener(accion);
                } catch (ClassCastException e) {
                    JOptionPane.showMessageDialog(null, "Algo salio mal");
                }
                
                jPMemoria.add(matriz[i][j]);
                y +=80;
            }
            x+=80;
            y=20;
        }
        setArregloBotones(matriz);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPMemoria;
    // End of variables declaration//GEN-END:variables
}
