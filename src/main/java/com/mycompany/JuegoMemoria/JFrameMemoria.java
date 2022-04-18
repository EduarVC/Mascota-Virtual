package com.mycompany.JuegoMemoria;

import com.mycompany.Controladores.ControladorPaseo;
import static com.mycompany.Controladores.ControladorPaseo.setSalir;
import static com.mycompany.JFrameMascotaVirtual.Paseo.btnContinuar;
import static com.mycompany.JFrameMascotaVirtual.Paseo.btnTerminar;
import static com.mycompany.JuegoMemoria.AccionBotones.getArregloBotones;
import static com.mycompany.JuegoMemoria.AccionBotones.setArregloBotones;
import com.mycompany.mascotas.Mascota;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JFrameMemoria extends javax.swing.JFrame {

    static JButton[][] matriz;
    private int columnas;
    private int filas;
    private static JButton botonAnterior;
    private static Mascota mascotaAnterior;
    private static boolean turnoJugador;
    private static int parejasJugador;
    private static int parejasEnemigo;
    private static int contadorClik;
    private static Mascota mascota;

    public JFrameMemoria(int columnas, int filas) {
        initComponents();
        this.columnas = columnas;
        this.filas = filas;
        this.setLocationRelativeTo(this);
        mascota = new Mascota();
        setParejasEnemigo(0);
        setParejasJugador(0);
        setContadorClik(0);
        lblParesEn.setText("Pares Pokemon Salvaje: " + getParejasEnemigo());
        lblParesPk.setText("Pares Pokemon Salvaje: " + getParejasJugador());
        lblTurno.setText("Turno: Mi pokemon");
        botonAnterior = null;
        mascotaAnterior = null;
        setTurnoJugador(true);
        setMatriz();
    }

    public static Mascota getMascota() {
        return mascota;
    }

    public static void setMascota(Mascota mascota) {
        JFrameMemoria.mascota = mascota;
    }

    public static int getContadorClik() {
        return contadorClik;
    }

    public static void setContadorClik(int contadorClik) {
        JFrameMemoria.contadorClik = contadorClik;
    }

    public static int getParejasEnemigo() {
        return parejasEnemigo;
    }

    public static void setParejasEnemigo(int parejasEnemigo) {
        JFrameMemoria.parejasEnemigo = parejasEnemigo;
    }

    public static int getParejasJugador() {
        return parejasJugador;
    }

    public static void setParejasJugador(int parejasJugador) {
        JFrameMemoria.parejasJugador = parejasJugador;
    }

    public static boolean isTurnoJugador() {
        return turnoJugador;
    }

    public static void setTurnoJugador(boolean turnoJugador) {
        JFrameMemoria.turnoJugador = turnoJugador;
    }

    public static Mascota getMascotaAnterior() {
        return mascotaAnterior;
    }

    public static void setMascotaAnterior(Mascota mascotaAnterior) {
        JFrameMemoria.mascotaAnterior = mascotaAnterior;
    }

    public static JButton getBotonAnterior() {
        return botonAnterior;
    }

    public static void setBotonAnterior(JButton botonAnterior) {
        JFrameMemoria.botonAnterior = botonAnterior;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        jPMemoria = new javax.swing.JPanel();
        lblParesPk = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblParesEn = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        LblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("POKEMON JUEGO DE MEMORIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        jPMemoria.setBackground(new java.awt.Color(51, 51, 51));
        jPMemoria.setForeground(new java.awt.Color(102, 102, 102));
        jPMemoria.setLayout(null);

        lblParesPk.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblParesPk.setForeground(new java.awt.Color(204, 204, 204));
        lblParesPk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnRegresar.setBackground(new java.awt.Color(23, 26, 32));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(204, 204, 204));
        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegresarMousePressed(evt);
            }
        });
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblParesEn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblParesEn.setForeground(new java.awt.Color(204, 204, 204));
        lblParesEn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTurno.setBackground(new java.awt.Color(204, 204, 204));
        lblTurno.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(204, 204, 204));
        lblTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMemoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblParesPk, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(lblParesEn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(280, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(281, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblParesPk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParesEn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(530, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMousePressed
        ControladorPaseo controlador = new ControladorPaseo(getMascota());
        setSalir(true);
        btnTerminar.setEnabled(true);
        btnContinuar.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMousePressed

    public void setMatriz() {
        Font fuent = new Font("Arial", Font.BOLD, 16);
        matriz = new JButton[filas][columnas];
        int x = 20;
        int y = 20;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = new JButton();
                matriz[i][j].setBackground(Color.DARK_GRAY);
                matriz[i][j].setBounds(y, x, 80, 80);
                ImageIcon im = new ImageIcon("src/main/java/com/mycompany/Imagenes/pokebll.jpg");
                Icon imag = new ImageIcon(im.getImage().getScaledInstance(matriz[i][j].getWidth(), matriz[i][j].getHeight(), Image.SCALE_DEFAULT));
                AccionBotones accion = new AccionBotones();
                matriz[i][j].setIcon(imag);
                try {
                    matriz[i][j].addActionListener(accion);
                } catch (ClassCastException e) {
                    JOptionPane.showMessageDialog(null, "Algo salio mal");
                }

                jPMemoria.add(matriz[i][j]);
                y += 80;
            }
            x += 80;
            y = 20;
        }
        setArregloBotones(matriz);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPMemoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lblParesEn;
    public static javax.swing.JLabel lblParesPk;
    public static javax.swing.JLabel lblTurno;
    // End of variables declaration//GEN-END:variables
}
