package com.mycompany.JFrameMascotaVirtual;

public class JFrameMenuPrincipal extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    EstablecerImagenes estblecer;

    public JFrameMenuPrincipal() {
        initComponents();
        estblecer = new EstablecerImagenes();
        this.setLocationRelativeTo(this);
        estblecer.establecerImagen(lblImagenMenu, "src/main/java/com/mycompany/Imagenes/poke.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btJugar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblImagenMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(13, 13, 24));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 20));

        btJugar.setBackground(new java.awt.Color(23, 26, 32));
        btJugar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btJugar.setForeground(new java.awt.Color(204, 204, 204));
        btJugar.setText("JUGAR");
        btJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btJugarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btJugarMousePressed(evt);
            }
        });
        jPanel1.add(btJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 110, 50));

        btSalir.setBackground(new java.awt.Color(23, 26, 32));
        btSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btSalir.setForeground(new java.awt.Color(204, 204, 204));
        btSalir.setText("SALIR");
        btSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalirMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btSalirMousePressed(evt);
            }
        });
        jPanel1.add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 110, 50));

        lblTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Menú Principal");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 30));
        jPanel1.add(lblImagenMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 260));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirMouseClicked
        
    }//GEN-LAST:event_btSalirMouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void btJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJugarMouseClicked
       
    }//GEN-LAST:event_btJugarMouseClicked

    private void btJugarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJugarMousePressed
        JFramePrincipal principal = new JFramePrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btJugarMousePressed

    private void btSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirMousePressed
        System.exit(0);
    }//GEN-LAST:event_btSalirMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btJugar;
    private javax.swing.JButton btSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImagenMenu;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
