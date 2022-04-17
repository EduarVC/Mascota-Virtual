/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.JFrameMascotaVirtual;

import com.mycompany.Controladores.ControladorPaseo;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.getMascotasJugador;
import com.mycompany.mascotas.Mascota;
import javax.naming.ldap.Rdn;

/**
 *
 * @author Eduardo Vásquez
 */
public class Paseo extends javax.swing.JFrame {

    private EstablecerImagenes establecer;
    private ControladorPaseo controlador;
    private Mascota mascota;

    public Paseo(Mascota mascota) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.mascota = mascota;
        establecer = new EstablecerImagenes();
        controlador = new ControladorPaseo(this.mascota);
        establecer.establecerImagen(lblImgFondo, "src/main/java/com/mycompany/Imagenes/bosque.jpg");
        controlador.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblImg1 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        lblImg3 = new javax.swing.JLabel();
        lblImgEnemigo = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblImgFondo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblImg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 30, 50));
        getContentPane().add(lblImg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 50, 70));
        getContentPane().add(lblImg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 70, 110));
        getContentPane().add(lblImgEnemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 70, 70));

        btnTerminar.setBackground(new java.awt.Color(23, 26, 32));
        btnTerminar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnTerminar.setForeground(new java.awt.Color(204, 204, 204));
        btnTerminar.setText("Terminar Paseo");
        btnTerminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTerminarMousePressed(evt);
            }
        });
        getContentPane().add(btnTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 140, 40));

        btnContinuar.setBackground(new java.awt.Color(23, 26, 32));
        btnContinuar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(204, 204, 204));
        btnContinuar.setText("Continuar");
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnContinuarMousePressed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 30));

        lblImgFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblImgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMousePressed
        
        for (int i = 0; i < getMascotasJugador().length; i++) {
            if (getMascotasJugador()[i].getNombreMascota().equals(this.mascota.getNombreMascota())) {
                if (getMascotasJugador()[i].getConteoPaseoAcumulado() > 0) {
                    getMascotasJugador()[i].setConteoPaseoAcumulado(getMascotasJugador()[i].getConteoPaseoAcumulado() - 1);
                }
            }

        }
        controlador = new ControladorPaseo(this.mascota);
        controlador.stop();
        this.dispose();
    }//GEN-LAST:event_btnTerminarMousePressed

    private void btnContinuarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMousePressed
        controlador = new ControladorPaseo(this.mascota);
        controlador.start();
    }//GEN-LAST:event_btnContinuarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel lblImg1;
    public static javax.swing.JLabel lblImg2;
    public static javax.swing.JLabel lblImg3;
    public static javax.swing.JLabel lblImgEnemigo;
    private javax.swing.JLabel lblImgFondo;
    // End of variables declaration//GEN-END:variables
}
