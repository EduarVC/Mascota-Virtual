/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.JFrameMascotaVirtual;

import java.awt.Color;

/**
 *
 * @author Eduardo Vásquez
 */
public class JFramePrincipal extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    EstablecerImagenes estblecer;

    public JFramePrincipal() {
        initComponents();
        estblecer = new EstablecerImagenes();
        this.setLocationRelativeTo(this);
        estblecer.establecerImagen(lblImagen, "src/main/java/com/mycompany/Imagenes/001Bulbasaur.png");
        estblecer.establecerImagen(lblFondo, "src/main/java/com/mycompany/Imagenes/Fondoo.jpg");
        estblecer.establecerImagen(lblFondo2, "src/main/java/com/mycompany/Imagenes/poke.png");
        estblecer.establecerImagen(lblOro, "src/main/java/com/mycompany/Imagenes/Oroo.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPanelPrincipal = new javax.swing.JPanel();
        lblBarra = new javax.swing.JLabel();
        jpExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        jpPanelLateral = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblInformacionMascota = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();
        btAcercaDe = new javax.swing.JButton();
        btAyuda = new javax.swing.JButton();
        lblOro = new javax.swing.JLabel();
        txOroJugador = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cmbMascotasJugador = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        cbTienda = new javax.swing.JComboBox<>();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jpPanelPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        jpPanelPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        jpPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBarraMouseDragged(evt);
            }
        });
        lblBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBarraMousePressed(evt);
            }
        });
        jpPanelPrincipal.add(lblBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 810, 30));

        jpExit.setBackground(new java.awt.Color(17, 17, 32));

        lblExit.setBackground(new java.awt.Color(255, 255, 255));
        lblExit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpExitLayout = new javax.swing.GroupLayout(jpExit);
        jpExit.setLayout(jpExitLayout);
        jpExitLayout.setHorizontalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpExitLayout.setVerticalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpPanelPrincipal.add(jpExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jpPanelLateral.setBackground(new java.awt.Color(0, 58, 39));
        jpPanelLateral.setForeground(new java.awt.Color(255, 255, 255));
        jpPanelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen.setBackground(new java.awt.Color(51, 0, 204));
        lblImagen.setForeground(new java.awt.Color(51, 0, 153));
        jpPanelLateral.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 90, 170, 130));

        lblInformacionMascota.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblInformacionMascota.setForeground(new java.awt.Color(204, 204, 204));
        lblInformacionMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformacionMascota.setText("Hola soy un pokemon");
        jpPanelLateral.add(lblInformacionMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 120));
        jpPanelLateral.add(lblFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        jpPanelPrincipal.add(jpPanelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        btAcercaDe.setBackground(new java.awt.Color(23, 26, 32));
        btAcercaDe.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btAcercaDe.setForeground(new java.awt.Color(204, 204, 204));
        btAcercaDe.setText("Acerca de");
        jpPanelPrincipal.add(btAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 100, 30));

        btAyuda.setBackground(new java.awt.Color(23, 26, 32));
        btAyuda.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btAyuda.setForeground(new java.awt.Color(204, 204, 204));
        btAyuda.setText("Ayuda");
        jpPanelPrincipal.add(btAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 90, 30));

        lblOro.setBackground(new java.awt.Color(0, 0, 0));
        lblOro.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblOro.setForeground(new java.awt.Color(0, 0, 0));
        lblOro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpPanelPrincipal.add(lblOro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 30, 30));

        txOroJugador.setBackground(new java.awt.Color(102, 102, 102));
        txOroJugador.setForeground(new java.awt.Color(0, 0, 0));
        jpPanelPrincipal.add(txOroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 40, -1));

        jButton1.setBackground(new java.awt.Color(23, 26, 32));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Pasear");
        jpPanelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 100, 30));

        jButton2.setBackground(new java.awt.Color(23, 26, 32));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Alimentar");
        jpPanelPrincipal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 100, 30));

        jButton3.setBackground(new java.awt.Color(23, 26, 32));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Limpiar");
        jpPanelPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 100, 30));

        jButton4.setBackground(new java.awt.Color(23, 26, 32));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Curar");
        jpPanelPrincipal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 100, 30));

        cmbMascotasJugador.setBackground(new java.awt.Color(23, 26, 32));
        cmbMascotasJugador.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cmbMascotasJugador.setForeground(new java.awt.Color(204, 204, 204));
        cmbMascotasJugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPanelPrincipal.add(cmbMascotasJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 120, 30));

        lblTitulo.setBackground(new java.awt.Color(78, 76, 82));
        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MASCOTA VIRTUAL");
        jpPanelPrincipal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 260, 27));

        cbTienda.setBackground(new java.awt.Color(23, 26, 32));
        cbTienda.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cbTienda.setForeground(new java.awt.Color(204, 204, 204));
        cbTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpPanelPrincipal.add(cbTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 100, 30));
        jpPanelPrincipal.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -2, 620, 510));

        getContentPane().add(jpPanelPrincipal, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lblBarraMousePressed

    private void lblBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblBarraMouseDragged

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
       System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        jpExit.setBackground(Color.red);
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        jpExit.setBackground(Color.BLACK);
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblExitMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcercaDe;
    private javax.swing.JButton btAyuda;
    private javax.swing.JComboBox<String> cbTienda;
    private javax.swing.JComboBox<String> cmbMascotasJugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpPanelLateral;
    private javax.swing.JPanel jpPanelPrincipal;
    private javax.swing.JLabel lblBarra;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblInformacionMascota;
    private javax.swing.JLabel lblOro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txOroJugador;
    // End of variables declaration//GEN-END:variables
}
