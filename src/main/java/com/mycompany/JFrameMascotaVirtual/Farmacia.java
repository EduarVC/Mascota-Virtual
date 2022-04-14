package com.mycompany.JFrameMascotaVirtual;

import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.cmbMascotasJugador;
import com.mycompany.Personajes.Jugador;
import com.mycompany.Tienda.Tienda;
import com.mycompany.mascotas.Mascota;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Farmacia extends javax.swing.JFrame {

    private EstablecerImagenes establecer;
    private Jugador jugador;
    private Mascota[] mascotasJugador;
    private int monedasOro;
    private Tienda tiendaMedicina;

    public Farmacia(Mascota[] mascotasJugador, int monedasOro) {
        initComponents();
        tiendaMedicina = new Tienda();
        this.mascotasJugador = mascotasJugador;
        this.monedasOro = monedasOro;
        jugador = new Jugador();
        establecer = new EstablecerImagenes();
        this.setLocationRelativeTo(this);
        lblCantidadOroo.setText(Integer.toString(this.monedasOro));
        establecer.establecerImagen(lblImgOro, "src/main/java/com/mycompany/Imagenes/Oroo.png");
        tiendaMedicina.obtenerMedicinaTienda(tbMedicina);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImgOro = new javax.swing.JLabel();
        lblCantidadOroo = new javax.swing.JLabel();
        txtTituloFarmacia = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMedicina = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroMedicamento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtTituloFarmacia.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtTituloFarmacia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTituloFarmacia.setText("Farmacia");

        btnComprar.setText("Comprar");
        btnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnComprarMousePressed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegresarMousePressed(evt);
            }
        });

        tbMedicina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Nombre Medicamento", "Descripción", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbMedicina);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("Ingrese el numero del medicamento que desee Comprar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblImgOro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCantidadOroo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(txtTituloFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImgOro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTituloFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnComprar))
                    .addComponent(lblCantidadOroo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMousePressed
        this.dispose();
    }//GEN-LAST:event_btnRegresarMousePressed

    private void btnComprarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMousePressed
        String nombreMascotaSeleccionada = (String) cmbMascotasJugador.getSelectedItem();
        boolean aplica = false;
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].getNombreMascota().equals(nombreMascotaSeleccionada)) {
                aplica = mascotasJugador[i].isEnferma();
            }
        }
        if (aplica == true) {
            if (this.monedasOro >= 20) {
                try {
                    int numeroSeleccionado = Integer.parseInt(txtNumeroMedicamento.getText());
                    if (numeroSeleccionado == 3 && this.monedasOro >= 80) {
                        int salida = JOptionPane.showConfirmDialog(null, String.format("¿Está seguro de darle %s al pokemon seleccionado?", tiendaMedicina.getMedicinaTienda()[numeroSeleccionado - 1].getNombreMedicina()));
                        if (salida == 0) {
                            jugador.ComprarMedicina(numeroSeleccionado, mascotasJugador, monedasOro);//modificar
                            this.dispose();
                        }
                    } else if (numeroSeleccionado == 2 && this.monedasOro >= 50) {
                        int salida = JOptionPane.showConfirmDialog(null, String.format("¿Está seguro de darle %s al pokemon seleccionado?", tiendaMedicina.getMedicinaTienda()[numeroSeleccionado - 1].getNombreMedicina()));
                        if (salida == 0) {
                            jugador.ComprarMedicina(numeroSeleccionado, mascotasJugador, monedasOro);//modificar
                            this.dispose();
                        }

                    } else if (numeroSeleccionado == 1 && this.monedasOro >= 20) {
                        int salida = JOptionPane.showConfirmDialog(null, String.format("¿Está seguro de darle %s al pokemon seleccionado?", tiendaMedicina.getMedicinaTienda()[numeroSeleccionado - 1].getNombreMedicina()));
                        if (salida == 0) {
                            jugador.ComprarMedicina(numeroSeleccionado, mascotasJugador, monedasOro);//modificar
                            this.dispose();
                        }
                    } else {
                        if (numeroSeleccionado == 3 || numeroSeleccionado == 2) {
                            JOptionPane.showMessageDialog(null, "No tienes monedas de oro suficientes para comprar esta medicina");
                        } else {
                            JOptionPane.showMessageDialog(null, "Dato Incorrecto");
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Dato Incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No tienes monedas de oro suficientes para comprar medicamentos");
            }
        } else if ("".equals(txtNumeroMedicamento.getText())) {
            JOptionPane.showMessageDialog(null, "Dato Incorrecto");
        } else if (aplica == false) {
            JOptionPane.showMessageDialog(null, "La mascota seleccionada no esta enferma");
        }
        //vamos aca ponete vivo
    }//GEN-LAST:event_btnComprarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblCantidadOroo;
    private javax.swing.JLabel lblImgOro;
    private javax.swing.JTable tbMedicina;
    private javax.swing.JTextField txtNumeroMedicamento;
    private javax.swing.JLabel txtTituloFarmacia;
    // End of variables declaration//GEN-END:variables
}
