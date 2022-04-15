/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.JFrameMascotaVirtual;

import com.mycompany.Personajes.Jugador;
import com.mycompany.Tienda.Tienda;
import com.mycompany.mascotas.Mascota;
import com.mycompany.mascotavirtual.MascotasExistentes;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Vásquez
 */
public class Pokemon extends javax.swing.JFrame {

    private EstablecerImagenes establecer;
    private Jugador jugador;
    private Tienda tiendaPokemons;
    private Mascota[] mascotasAdquiridas;
    private int monedasOro;

    public Pokemon(Mascota[] mascotasJugador, int monedasOro) {
        initComponents();
        this.monedasOro = monedasOro;
        this.mascotasAdquiridas = mascotasJugador;
        tiendaPokemons = new Tienda();
        jugador = new Jugador();
        establecer = new EstablecerImagenes();
        this.setLocationRelativeTo(this);
        lblOroTiendaPokemons.setText(Integer.toString(this.monedasOro));
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
        btnComprar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
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

        btnComprar.setText("Comprar");
        btnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnComprarMousePressed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 90, 20));

        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegresarMousePressed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 90, 20));

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

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked

    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseClicked

    }//GEN-LAST:event_btnComprarMouseClicked

    private void btnRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMousePressed
        this.dispose();
    }//GEN-LAST:event_btnRegresarMousePressed

    private void btnComprarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMousePressed
        boolean yaAdquirida = false;
        Mascota verificar = new Mascota();
        MascotasExistentes mascotaAdquirida = new MascotasExistentes();

        if (this.monedasOro >= 50 && mascotasAdquiridas.length < 10) {
            try {
                int numeroMascota = Integer.parseInt(txtNumeroMascota.getText());
                verificar = mascotaAdquirida.obtenerMascota(numeroMascota);
                if (numeroMascota > 0 && numeroMascota < 152) {
                    for (int i = 0; i < mascotasAdquiridas.length; i++) {
                        if (mascotasAdquiridas[i].getNombreMascota().equals(verificar.getNombreMascota())) {
                            yaAdquirida = true;
                            break;
                        } else {
                            yaAdquirida = false;
                        }
                    }
                    if (yaAdquirida == false) {
                        int salida = JOptionPane.showConfirmDialog(null, String.format("¿Está seguro de comprar al pokémon No. %d llamado %s?", numeroMascota, tiendaPokemons.getMascotasTienda()[numeroMascota - 1].getNombreMascota()));
                        if (salida == 0) {
                            jugador.comprarMascota(numeroMascota, mascotasAdquiridas, monedasOro);
                            this.dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya tienes a este pokemon, seleccione a otro");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Dato Incorrecto");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Dato Incorrecto");
            }
        } else if (this.monedasOro < 50) {
            JOptionPane.showMessageDialog(null, "No tiene Oro suficiiente para comprar Pokemons");
        } else {
            JOptionPane.showMessageDialog(null, "No puede tener mas de 10 pokemons");
        }
    }//GEN-LAST:event_btnComprarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumMascota;
    public static javax.swing.JLabel lblOroTiendaPokemons;
    private javax.swing.JLabel lblTiendaOro;
    private javax.swing.JLabel lblTituloTiendaPokemons;
    private javax.swing.JTable tbPokemons;
    private javax.swing.JTextField txtNumeroMascota;
    // End of variables declaration//GEN-END:variables
}
