/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.JFrameMascotaVirtual;

import com.mycompany.Personajes.Jugador;
import com.mycompany.Tienda.Tienda;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

/**
 *
 * @author Eduardo Vásquez
 */
public class Pokemon extends javax.swing.JFrame {
    private EstablecerImagenes establecer;
    private Jugador jugador;
    private Tienda tiendaPokemons;
   
    /**
     * Creates new form Pokemon
     */
    public Pokemon() {
        initComponents();
        tiendaPokemons = new Tienda();
        jugador = new Jugador();
         establecer = new EstablecerImagenes();
        this.setLocationRelativeTo(this);
         lblOroTiendaPokemons.setText(Integer.toString(jugador.getMonedasOro()));
         establecer.establecerImagen(lblTiendaOro, "src/main/java/com/mycompany/Imagenes/Oroo.png");
         tiendaPokemons.obtenerTiendaPokemons(tbPokemons);
         
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbPokemons = new javax.swing.JTable();
        lblNumMascota = new javax.swing.JLabel();
        txtNumeroMascota = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblTituloTiendaPokemons = new javax.swing.JLabel();
        lblTiendaOro = new javax.swing.JLabel();
        lblOroTiendaPokemons = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbPokemons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Nombre Pokemon", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbPokemons);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 500, 240));

        lblNumMascota.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        lblNumMascota.setText("Ingrese el número de la mascota que desea comprar:");
        getContentPane().add(lblNumMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 20));

        txtNumeroMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroMascotaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumeroMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 50, -1));

        jButton1.setText("Comprar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 90, 20));

        jButton2.setText("Regresar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 90, 20));

        lblTituloTiendaPokemons.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblTituloTiendaPokemons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloTiendaPokemons.setText("Tienda de Pokemons");
        getContentPane().add(lblTituloTiendaPokemons, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, 20));
        getContentPane().add(lblTiendaOro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));
        getContentPane().add(lblOroTiendaPokemons, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 40, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroMascotaActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            int numeroMascota = Integer.parseInt(txtNumeroMascota.getText());
            jugador.comprarMascota(numeroMascota);
        } catch (NumberFormatException e) {
            System.out.println("Dato Incorrecto");
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumMascota;
    private javax.swing.JLabel lblOroTiendaPokemons;
    private javax.swing.JLabel lblTiendaOro;
    private javax.swing.JLabel lblTituloTiendaPokemons;
    private javax.swing.JTable tbPokemons;
    private javax.swing.JTextField txtNumeroMascota;
    // End of variables declaration//GEN-END:variables
}
