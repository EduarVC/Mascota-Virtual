/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.JFrameMascotaVirtual;

import static com.mycompany.Controladores.ControladorComboBox.setmascotasMuertas;
import com.mycompany.Controladores.ControladorItems;
import static com.mycompany.Controladores.ControladorOro.precioRevivir;
import static com.mycompany.Controladores.ControladorOro.setOro;
import com.mycompany.Controladores.ControladorSeleccionTienda;
import com.mycompany.Personajes.Enemigo;
import com.mycompany.Personajes.Jugador;
import com.mycompany.mascotas.Mascota;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Vásquez
 */
public class JFramePrincipal extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    EstablecerImagenes estblecer;
    private Jugador jugador = new Jugador();
    private static ControladorItems controlador;
    private static Mascota[] mascotasJugador;
    private static int monedasOro;
    private static Mascota[] mascotasMuertas;

    public JFramePrincipal() {
        initComponents();
        controlador = new ControladorItems();//Se inicializa objeto
        estblecer = new EstablecerImagenes();//Se inicializa objeto
        this.setLocationRelativeTo(this);//Establecemos la ventana al centro de la
        jugador.obtenerMascotaPrincipal();//Se obtiene la mascota Principal
        setMascotasJugador(jugador.getMascotasAdquiridas());//Se establece el arreglo de las mascotas del jugador 
        setMonedaOro(100);//Se establecen las monedas de oro Iniciales 
        lblMonedasOro.setText(Integer.toString(getMonedasOro()));//Se muestran las monedas de oro iniciales 
        setOro(getMonedasOro());
        controlador.verificarNombreMascota(getMascotasJugador()[0].getNombreMascota(), lblImagen, getMascotasJugador(), lblInformacionMascota);//llamamos al metodo para establecer la imagen y datos del pokemon
        estblecer.establecerImagen(lblFondo, "src/main/java/com/mycompany/Imagenes/Fondoo.jpg");//Establemos la imagen de fondo
        estblecer.establecerImagen(lblFondo2, "src/main/java/com/mycompany/Imagenes/poke.png");//Establecemos la imagen del panel lateral
        estblecer.establecerImagen(lblOro, "src/main/java/com/mycompany/Imagenes/Oroo.png");//establecemos la imagen del Oro
        InicializarCbo();//llamamos al metodo para establecer datos del comboBox
    }

    public static Mascota[] getMascotasMuertas() {
        return mascotasMuertas;
    }

    public static void setMascotasMuertas(Mascota[] mascotasMuertas) {
        JFramePrincipal.mascotasMuertas = mascotasMuertas;
    }

    //metodo geter del arreglo de mascotas
    public static Mascota[] getMascotasJugador() {
        return mascotasJugador;
    }

    //Metodo seter del arreglo de mascotas
    public static void setMascotasJugador(Mascota[] mascotasJugador) {
        JFramePrincipal.mascotasJugador = mascotasJugador;
    }

    //metodo geter del oro
    public static int getMonedasOro() {
        return monedasOro;
    }

    //Metodo seter del oro
    public static void setMonedaOro(int monedasOro) {
        JFramePrincipal.monedasOro = monedasOro;
    }

    //Metodo para establecer datos principales del ComboBox 
    public void InicializarCbo() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbMascotasJugador.getModel();
        for (Mascota mascota : getMascotasJugador()) {
            model.addElement(mascota.getNombreMascota());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPanelPrincipal = new javax.swing.JPanel();
        lblBarra = new javax.swing.JLabel();
        jpExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        jpPanelLateral = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        JpFondoInfo = new javax.swing.JPanel();
        lblInformacionMascota = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();
        btAcercaDe = new javax.swing.JButton();
        btAyuda = new javax.swing.JButton();
        lblOro = new javax.swing.JLabel();
        jpFondoOro = new javax.swing.JPanel();
        lblMonedasOro = new javax.swing.JLabel();
        btnPaseo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cmbMascotasJugador = new javax.swing.JComboBox<>();
        jpFondoTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        cbTienda = new javax.swing.JComboBox<>();
        btnAcptarTienda = new javax.swing.JButton();
        cmbRevivir = new javax.swing.JComboBox<>();
        btnRevivir = new javax.swing.JButton();
        lblMisPokemons = new javax.swing.JLabel();
        lblPokMuertos = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
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

        JpFondoInfo.setBackground(new java.awt.Color(0, 0, 0));

        lblInformacionMascota.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblInformacionMascota.setForeground(new java.awt.Color(204, 204, 204));
        lblInformacionMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout JpFondoInfoLayout = new javax.swing.GroupLayout(JpFondoInfo);
        JpFondoInfo.setLayout(JpFondoInfoLayout);
        JpFondoInfoLayout.setHorizontalGroup(
            JpFondoInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpFondoInfoLayout.createSequentialGroup()
                .addComponent(lblInformacionMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JpFondoInfoLayout.setVerticalGroup(
            JpFondoInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInformacionMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        jpPanelLateral.add(JpFondoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 220));
        jpPanelLateral.add(lblFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 510));

        jpPanelPrincipal.add(jpPanelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 510));

        btAcercaDe.setBackground(new java.awt.Color(23, 26, 32));
        btAcercaDe.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btAcercaDe.setForeground(new java.awt.Color(204, 204, 204));
        btAcercaDe.setText("Acerca de");
        btAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btAcercaDeMousePressed(evt);
            }
        });
        jpPanelPrincipal.add(btAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 100, 30));

        btAyuda.setBackground(new java.awt.Color(23, 26, 32));
        btAyuda.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btAyuda.setForeground(new java.awt.Color(204, 204, 204));
        btAyuda.setText("Ayuda");
        btAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btAyudaMousePressed(evt);
            }
        });
        jpPanelPrincipal.add(btAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 90, 30));

        lblOro.setBackground(new java.awt.Color(0, 0, 0));
        lblOro.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblOro.setForeground(new java.awt.Color(0, 0, 0));
        lblOro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpPanelPrincipal.add(lblOro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 30, 30));

        jpFondoOro.setBackground(new java.awt.Color(0, 0, 0));

        lblMonedasOro.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblMonedasOro.setForeground(new java.awt.Color(255, 255, 255));
        lblMonedasOro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpFondoOroLayout = new javax.swing.GroupLayout(jpFondoOro);
        jpFondoOro.setLayout(jpFondoOroLayout);
        jpFondoOroLayout.setHorizontalGroup(
            jpFondoOroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMonedasOro, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jpFondoOroLayout.setVerticalGroup(
            jpFondoOroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMonedasOro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jpPanelPrincipal.add(jpFondoOro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 40, 20));

        btnPaseo.setBackground(new java.awt.Color(23, 26, 32));
        btnPaseo.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnPaseo.setForeground(new java.awt.Color(204, 204, 204));
        btnPaseo.setText("Pasear");
        btnPaseo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPaseoMousePressed(evt);
            }
        });
        jpPanelPrincipal.add(btnPaseo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 100, 30));

        btnLimpiar.setBackground(new java.awt.Color(23, 26, 32));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimpiarMousePressed(evt);
            }
        });
        jpPanelPrincipal.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 100, 30));

        cmbMascotasJugador.setBackground(new java.awt.Color(23, 26, 32));
        cmbMascotasJugador.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cmbMascotasJugador.setForeground(new java.awt.Color(204, 204, 204));
        cmbMascotasJugador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMascotasJugadorItemStateChanged(evt);
            }
        });
        cmbMascotasJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbMascotasJugadorMousePressed(evt);
            }
        });
        cmbMascotasJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMascotasJugadorActionPerformed(evt);
            }
        });
        jpPanelPrincipal.add(cmbMascotasJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 120, 30));

        jpFondoTitulo.setBackground(new java.awt.Color(0, 0, 0));

        lblTitulo.setBackground(new java.awt.Color(78, 76, 82));
        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MASCOTA VIRTUAL");

        javax.swing.GroupLayout jpFondoTituloLayout = new javax.swing.GroupLayout(jpFondoTitulo);
        jpFondoTitulo.setLayout(jpFondoTituloLayout);
        jpFondoTituloLayout.setHorizontalGroup(
            jpFondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        jpFondoTituloLayout.setVerticalGroup(
            jpFondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        jpPanelPrincipal.add(jpFondoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 290, 30));

        cbTienda.setBackground(new java.awt.Color(23, 26, 32));
        cbTienda.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cbTienda.setForeground(new java.awt.Color(204, 204, 204));
        cbTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tienda", "Restaurante", "Farmacia", "Pokemons" }));
        jpPanelPrincipal.add(cbTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 130, 30));

        btnAcptarTienda.setBackground(new java.awt.Color(23, 26, 32));
        btnAcptarTienda.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnAcptarTienda.setForeground(new java.awt.Color(204, 204, 204));
        btnAcptarTienda.setText("Aceptar");
        btnAcptarTienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcptarTiendaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAcptarTiendaMousePressed(evt);
            }
        });
        jpPanelPrincipal.add(btnAcptarTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 90, 30));

        cmbRevivir.setBackground(new java.awt.Color(23, 26, 32));
        cmbRevivir.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cmbRevivir.setForeground(new java.awt.Color(204, 204, 204));
        jpPanelPrincipal.add(cmbRevivir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 120, 30));

        btnRevivir.setBackground(new java.awt.Color(23, 26, 32));
        btnRevivir.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnRevivir.setForeground(new java.awt.Color(204, 204, 204));
        btnRevivir.setText("Revivir");
        btnRevivir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRevivirMousePressed(evt);
            }
        });
        jpPanelPrincipal.add(btnRevivir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 90, 30));

        lblMisPokemons.setBackground(new java.awt.Color(153, 153, 153));
        lblMisPokemons.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblMisPokemons.setForeground(new java.awt.Color(0, 0, 0));
        lblMisPokemons.setText("Mi Pokemon");
        jpPanelPrincipal.add(lblMisPokemons, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 120, 20));

        lblPokMuertos.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblPokMuertos.setForeground(new java.awt.Color(0, 0, 0));
        lblPokMuertos.setText("Pokemon Muerto");
        jpPanelPrincipal.add(lblPokMuertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 110, 20));

        btnReportes.setBackground(new java.awt.Color(23, 26, 32));
        btnReportes.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(204, 204, 204));
        btnReportes.setText("Reportes");
        jpPanelPrincipal.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 100, 30));
        jpPanelPrincipal.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 620, 510));

        getContentPane().add(jpPanelPrincipal, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMousePressed
        xMouse = evt.getX();//obtenemos la posicion del mouse en X
        yMouse = evt.getY();//obtenemos la posicion del mouse en Y
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

    private void cmbMascotasJugadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMascotasJugadorItemStateChanged
        // Se obtiene la mascota seleccionada del combobox
        String nombre = (String) cmbMascotasJugador.getSelectedItem();
        controlador.verificarNombreMascota(nombre, lblImagen, getMascotasJugador(), lblInformacionMascota);//llamamos al metodo para establecer la imagen y datos del pokemon
    }//GEN-LAST:event_cmbMascotasJugadorItemStateChanged

    private void btnAcptarTiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcptarTiendaMouseClicked

    }//GEN-LAST:event_btnAcptarTiendaMouseClicked

    private void cmbMascotasJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMascotasJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMascotasJugadorActionPerformed

    private void btnAcptarTiendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcptarTiendaMousePressed
        for (int i = 0; i < getMascotasJugador().length; i++) {
            System.out.println(getMascotasJugador()[i]);
        }
        ControladorSeleccionTienda controlTiendaS = new ControladorSeleccionTienda();//creamos e Inicializamos el objeto
        String nombreTienda = (String) cbTienda.getSelectedItem();//obtenemos el nombre de la tienda seleccionada del comboBox
        controlTiendaS.tiendaSeleccionada(nombreTienda, getMascotasJugador(), getMonedasOro());//llamamos al metodo que controla las tiendas

    }//GEN-LAST:event_btnAcptarTiendaMousePressed

    private void cmbMascotasJugadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMascotasJugadorMousePressed
        String nombre = (String) cmbMascotasJugador.getSelectedItem();
        controlador.verificarNombreMascota(nombre, lblImagen, getMascotasJugador(), lblInformacionMascota);//llamamos al metodo para establecer la imagen y datos del pokemon
    }//GEN-LAST:event_cmbMascotasJugadorMousePressed

    private void btnLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMousePressed
        if (cmbMascotasJugador.getSelectedItem() != null) {
            int salida = JOptionPane.showConfirmDialog(null, String.format("Esta seguro de limpiar a %s", cmbMascotasJugador.getSelectedItem()));
            if (salida == 0) {
                try {
                    for (int i = 0; i < getMascotasJugador().length; i++) {
                        if (getMascotasJugador()[i].getNombreMascota() == cmbMascotasJugador.getSelectedItem()) {
                            if (getMascotasJugador()[i].getConteoLimpiezaAcumulada() > 0) {
                                getMascotasJugador()[i].setConteoLimpiezaAcumulada(getMascotasJugador()[i].getConteoLimpiezaAcumulada() - 1);
                                JOptionPane.showMessageDialog(null, "Limpieza exitosa");
                            } else {
                                JOptionPane.showMessageDialog(null, "La mascota no necesita limpieza en este momento.");
                            }
                            break;
                        }
                    }
                } catch (HeadlessException e) {
                    System.out.println("Seleccione una mascota");
                }

            }
        }
    }//GEN-LAST:event_btnLimpiarMousePressed

    private void btnRevivirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevivirMousePressed

        try {

            for (int i = 0; i < getMascotasMuertas().length; i++) {
                if (getMascotasMuertas()[i].getNombreMascota() == cmbRevivir.getSelectedItem()) {
                    int precio = precioRevivir(getMascotasMuertas()[i]);
                    if (getMonedasOro() > precio) {
                        int salida = JOptionPane.showConfirmDialog(null, String.format("¿Esta seguro de revivir al pokemon %s por %d monedas de oro?", getMascotasMuertas()[i].getNombreMascota(), precio));
                        if (salida == 0) {
                            jugador.revivirMascota(getMascotasMuertas()[i], getMascotasJugador(), monedasOro, getMascotasMuertas());
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "No tienes Oro suficiente para revivir a los pokemons");
                    }
                    break;
                }
            }

        } catch (NullPointerException e) {

        }

    }//GEN-LAST:event_btnRevivirMousePressed

    private void btnPaseoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaseoMousePressed
      String nombre = (String) cmbMascotasJugador.getSelectedItem();
      Mascota mascotaPaseo = new Mascota();
        for (int i = 0; i < getMascotasJugador().length; i++) {
            if(getMascotasJugador()[i].getNombreMascota().equals(nombre)){
                mascotaPaseo = getMascotasJugador()[i];
                break;
            }
        }
        
        Paseo paseo = new Paseo(mascotaPaseo);
        paseo.setVisible(true);
    }//GEN-LAST:event_btnPaseoMousePressed

    private void btAcercaDeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAcercaDeMousePressed
        JOptionPane.showMessageDialog(null, "Desarrollador: Eduardo David Vásquez Cabrera \nEstudiante de Ingeniería en Ciencias y Sistemas \nCurso: Introducción a la Programación y Computación 1 \nCarné: 201632292", "Acerca de.",ICONIFIED);
    }//GEN-LAST:event_btAcercaDeMousePressed

    private void btAyudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAyudaMousePressed
        Ayuda ayuda = new Ayuda();
        ayuda.setVisible(true);
    }//GEN-LAST:event_btAyudaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpFondoInfo;
    private javax.swing.JButton btAcercaDe;
    private javax.swing.JButton btAyuda;
    private javax.swing.JButton btnAcptarTienda;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPaseo;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnRevivir;
    private javax.swing.JComboBox<String> cbTienda;
    public static javax.swing.JComboBox<String> cmbMascotasJugador;
    public static javax.swing.JComboBox<String> cmbRevivir;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpFondoOro;
    private javax.swing.JPanel jpFondoTitulo;
    private javax.swing.JPanel jpPanelLateral;
    private javax.swing.JPanel jpPanelPrincipal;
    private javax.swing.JLabel lblBarra;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondo2;
    public static javax.swing.JLabel lblImagen;
    public static javax.swing.JLabel lblInformacionMascota;
    private javax.swing.JLabel lblMisPokemons;
    public static javax.swing.JLabel lblMonedasOro;
    private javax.swing.JLabel lblOro;
    private javax.swing.JLabel lblPokMuertos;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
