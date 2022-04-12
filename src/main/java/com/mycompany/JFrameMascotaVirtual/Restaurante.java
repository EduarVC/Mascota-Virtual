package com.mycompany.JFrameMascotaVirtual;
import com.mycompany.Personajes.Jugador;
import com.mycompany.Tienda.Tienda;
import com.mycompany.mascotas.Mascota;
import javax.swing.JOptionPane;

public class Restaurante extends javax.swing.JFrame {

    private EstablecerImagenes establecer;
    private Jugador jugador;
    private Tienda tiendaAlimentos;
    private Mascota[] mascotasAdquiridas;
    private int monedasOro;

    public Restaurante(Mascota[] mascotasJugador, int monedasOro) {
        initComponents();
        this.mascotasAdquiridas = mascotasJugador;
        this.monedasOro = monedasOro;
        tiendaAlimentos = new Tienda();
        jugador = new Jugador();
        establecer = new EstablecerImagenes();
        this.setLocationRelativeTo(this);
        lblCantidadOro.setText(Integer.toString(this.monedasOro));
        establecer.establecerImagen(lblImgOro, "src/main/java/com/mycompany/Imagenes/Oroo.png");
        tiendaAlimentos.obtenerAlimentosTienda(tbAlimentos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImgOro = new javax.swing.JLabel();
        lblCantidadOro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlimentos = new javax.swing.JTable();
        lblTituloRestaurante = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblIndicador = new javax.swing.JLabel();
        txtNumeroAlimento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        tbAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Nombre Alimento", "Beneficio", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tbAlimentos);

        lblTituloRestaurante.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblTituloRestaurante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloRestaurante.setText("Restaurante");

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

        lblIndicador.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblIndicador.setText("Ingrese el numero del alimento que desee comprar: ");

        txtNumeroAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroAlimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgOro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblIndicador, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCantidadOro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(lblTituloRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblImgOro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTituloRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addComponent(lblCantidadOro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnComprar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIndicador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar)
                    .addComponent(txtNumeroAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroAlimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroAlimentoActionPerformed

    private void btnRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMousePressed
        this.dispose();
    }//GEN-LAST:event_btnRegresarMousePressed

    private void btnComprarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMousePressed
        if (this.monedasOro >= 10) {
            try {
                int numeroSeleccionado = Integer.parseInt(txtNumeroAlimento.getText());
                if (numeroSeleccionado == 3 && this.monedasOro >= 50) {
                    int salida = JOptionPane.showConfirmDialog(null, String.format("¿Está seguro de darle %s al pokemon seleccionado?", tiendaAlimentos.getAlimentosTienda()[numeroSeleccionado - 1].getNombreAlimento()));
                    if (salida == 0) {
                        jugador.comprarAlimento(numeroSeleccionado, mascotasAdquiridas, monedasOro);
                        this.dispose();
                    }
                }else if(numeroSeleccionado == 2 && this.monedasOro >= 30){
                    int salida = JOptionPane.showConfirmDialog(null, String.format("¿Está seguro de darle %s al pokemon seleccionado?", tiendaAlimentos.getAlimentosTienda()[numeroSeleccionado - 1].getNombreAlimento()));
                    if (salida == 0) {
                        jugador.comprarAlimento(numeroSeleccionado, mascotasAdquiridas, monedasOro);
                        this.dispose();
                    }
                }else if(numeroSeleccionado == 1 && this.monedasOro >= 10){
                    int salida = JOptionPane.showConfirmDialog(null, String.format("¿Está seguro de darle %s al pokemon seleccionado?", tiendaAlimentos.getAlimentosTienda()[numeroSeleccionado - 1].getNombreAlimento()));
                    if (salida == 0) {
                        jugador.comprarAlimento(numeroSeleccionado, mascotasAdquiridas, monedasOro);
                        this.dispose();
                    }
                }else {
                    if(numeroSeleccionado == 3 || numeroSeleccionado == 2){
                        JOptionPane.showMessageDialog(null, "No tienes monedas de oro suficientes para comprar este alimento");
                    }else{
                    JOptionPane.showMessageDialog(null, "Dato Incorrecto");
                    } 
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Dato Incorrecto");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No tienes monedas de oro suficientes para comprar alimentos");
        }
    }//GEN-LAST:event_btnComprarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblCantidadOro;
    private javax.swing.JLabel lblImgOro;
    private javax.swing.JLabel lblIndicador;
    private javax.swing.JLabel lblTituloRestaurante;
    private javax.swing.JTable tbAlimentos;
    private javax.swing.JTextField txtNumeroAlimento;
    // End of variables declaration//GEN-END:variables
}
