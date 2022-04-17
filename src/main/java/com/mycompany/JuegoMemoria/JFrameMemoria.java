package com.mycompany.JuegoMemoria;

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
    static JButton [][] matriz;
    private int columnas;
    private int filas;
    private static JButton botonAnterior;
    private static Mascota mascotaAnterior;
    private static boolean turnoJugador;
    private static int parejasJugador;
    private static int parejasEnemigo;
    private static int contadorClik;
    
    public JFrameMemoria(int columnas, int filas) {
        initComponents();
        this.columnas = columnas;
        this.filas = filas;
        this.setLocationRelativeTo(this);
        setParejasEnemigo(0);
        setParejasJugador(0);
        setContadorClik(0);
        botonAnterior = null;
        mascotaAnterior = null;
        setTurnoJugador(true);
        setMatriz();
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

        jPMemoria = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPMemoria.setBackground(new java.awt.Color(51, 51, 51));
        jPMemoria.setForeground(new java.awt.Color(102, 102, 102));
        jPMemoria.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        LblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(204, 204, 204));
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("POKEMON JUEGO DE MEMORIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setMatriz(){
        Font fuent = new Font("Arial",Font.BOLD,16);
        matriz = new JButton[filas][columnas];
        int x = 20;
        int y = 20;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz [i][j] = new JButton();
                matriz [i][j].setBackground(Color.DARK_GRAY);
                matriz [i][j].setBounds(y, x, 80, 80);
                ImageIcon im = new ImageIcon( "src/main/java/com/mycompany/Imagenes/pokebll.jpg");
                Icon imag = new ImageIcon(im.getImage().getScaledInstance(matriz[i][j].getWidth(), matriz[i][j].getHeight(), Image.SCALE_DEFAULT));
                AccionBotones accion = new AccionBotones();
                matriz[i][j].setIcon(imag);
                try {
                    matriz[i][j].addActionListener(accion);
                } catch (ClassCastException e) {
                    JOptionPane.showMessageDialog(null, "Algo salio mal");
                }
                
                jPMemoria.add(matriz[i][j]);
                y +=80;
            }
            x+=80;
            y=20;
        }
        setArregloBotones(matriz);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel jPMemoria;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
