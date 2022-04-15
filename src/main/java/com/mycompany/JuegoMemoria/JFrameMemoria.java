package com.mycompany.JuegoMemoria;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class JFrameMemoria extends javax.swing.JFrame {
    JButton [][] matriz;
    public JFrameMemoria() {
        initComponents();
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
        matriz = new JButton[5][8];
        int x = 20;
        int y = 20;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                matriz [i][j] = new JButton();
                matriz [i][j].setBackground(Color.DARK_GRAY);
                matriz [i][j].setBounds(y, x, 80, 80);
                matriz [i][j].setText("?");
                matriz [i][j].setFont(fuent);
                jPMemoria.add(matriz[i][j]);
                y +=80;
            }
            x+=80;
            y=20;
        }
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMemoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPMemoria;
    // End of variables declaration//GEN-END:variables
}
