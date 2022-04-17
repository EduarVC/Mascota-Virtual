package com.mycompany.JuegoMemoria;

import static com.mycompany.JuegoMemoria.JFrameMemoria.getBotonAnterior;
import static com.mycompany.JuegoMemoria.JFrameMemoria.getMascotaAnterior;
import static com.mycompany.JuegoMemoria.JFrameMemoria.isTurnoJugador;
import static com.mycompany.JuegoMemoria.JFrameMemoria.matriz;
import static com.mycompany.JuegoMemoria.JFrameMemoria.setBotonAnterior;
import static com.mycompany.JuegoMemoria.JFrameMemoria.setMascotaAnterior;
import static com.mycompany.JuegoMemoria.JFrameMemoria.setTurnoJugador;
import com.mycompany.mascotas.Mascota;
import com.mycompany.mascotavirtual.MascotasExistentes;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AccionBotones implements ActionListener {

    private static JButton[][] arregloBotones;

    private static int[][] matrizz;
    private int numero;
    private Mascota mascota;
    MascotasExistentes obtenerImgMas;
    ImageIcon imagen;
    private int parejasEncotradasJugador;
    private int parejasEncotradasEnemigo;

    public AccionBotones() {
        mascota = new Mascota();
        obtenerImgMas = new MascotasExistentes();
        parejasEncotradasEnemigo = 0;
        parejasEncotradasJugador = 0;

    }

    public int getVictoriasJugador() {
        return parejasEncotradasJugador;
    }

    public void setVictoriasJugador(int victoriasJugador) {
        this.parejasEncotradasJugador = victoriasJugador;
    }

    public int getVictoriaEnemigo() {
        return parejasEncotradasEnemigo;
    }

    public void setVictoriaEnemigo(int victoriaEnemigo) {
        this.parejasEncotradasEnemigo = victoriaEnemigo;
    }

    public static JButton[][] getArregloBotones() {
        return arregloBotones;
    }

    public static void setArregloBotones(JButton[][] arregloBotones) {
        AccionBotones.arregloBotones = arregloBotones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static void setMatrizz(int[][] matriz) {
        AccionBotones.matrizz = matriz;
    }

    public static int[][] getMatrizz() {
        return matrizz;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < getArregloBotones().length; i++) {
            for (int j = 0; j < getArregloBotones()[i].length; j++) {
                if (e.getSource().equals(getArregloBotones()[i][j])) {
                    setNumero(getMatrizz()[i][j]);
                    mascota = obtenerImgMas.obtenerMascota(getNumero());
                    ImageIcon im = new ImageIcon(mascota.getPathImagen());
                    Icon imag = new ImageIcon(im.getImage().getScaledInstance(getArregloBotones()[i][j].getWidth(), getArregloBotones()[i][j].getHeight(), Image.SCALE_DEFAULT));
                    arregloBotones[i][j].setIcon(imag);
                    if (getMascotaAnterior() != null) {
                        if (getMascotaAnterior().getNombreMascota().equals(mascota.getNombreMascota())) {
                            if (isTurnoJugador() == true) {
                                setVictoriasJugador(getVictoriasJugador() + 1);
                                JOptionPane.showMessageDialog(null, "Turno Jugador. Pareja encontrda, continue con el turno");
                                
                                arregloBotones[i][j].setEnabled(false);
                                for (int x = 0; x < arregloBotones.length; x++) {
                                    for (int y = 0; y < arregloBotones[x].length; y++) {
                                        if (arregloBotones[x][y] == getBotonAnterior()) {
                                            arregloBotones[x][y].setEnabled(false);
                                            break;
                                        }
                                    }
                                }
                                
                                setMascotaAnterior(null);
                                setBotonAnterior(null);
                            } else {
                                setVictoriaEnemigo(getVictoriaEnemigo() + 1);
                                JOptionPane.showMessageDialog(null, "Turno Enemigo. Pareja encontrda, continue con el turno");
                                
                                arregloBotones[i][j].setEnabled(false);
                                for (int x = 0; x < arregloBotones.length; x++) {
                                    for (int y = 0; y < arregloBotones[x].length; y++) {
                                        if (arregloBotones[x][y] == getBotonAnterior()) {
                                            arregloBotones[x][y].setEnabled(false);
                                            break;
                                        }
                                    }
                                }
                                setMascotaAnterior(null);
                                setBotonAnterior(null);
                            }
                            break;
                        } else {
                            if (isTurnoJugador() == true) {
                                JOptionPane.showMessageDialog(null, "Turno Juagdor terminado");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException ex) {
                                    JOptionPane.showMessageDialog(null, "Algo paso");
                                }
                                ImageIcon ima = new ImageIcon("src/main/java/com/mycompany/Imagenes/pokebll.jpg");
                                Icon image = new ImageIcon(ima.getImage().getScaledInstance(getArregloBotones()[i][j].getWidth(), getArregloBotones()[i][j].getHeight(), Image.SCALE_DEFAULT));
                                arregloBotones[i][j].setIcon(image);
                                for (int x = 0; x < matriz.length; x++) {
                                    for (int y = 0; y < matriz[x].length; y++) {
                                        if (matriz[x][y] == getBotonAnterior()) {
                                            matriz[x][y].setIcon(image);
                                            break;
                                        }
                                    }
                                }
                                setMascotaAnterior(null);
                                setBotonAnterior(null);
                                setTurnoJugador(turno());
                            } else {
                                JOptionPane.showMessageDialog(null, "Turno Enemigo terminado");
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException ex) {
                                    JOptionPane.showMessageDialog(null, "Algo paso");
                                }
                                ImageIcon ima = new ImageIcon("src/main/java/com/mycompany/Imagenes/pokebll.jpg");
                                Icon image = new ImageIcon(ima.getImage().getScaledInstance(getArregloBotones()[i][j].getWidth(), getArregloBotones()[i][j].getHeight(), Image.SCALE_DEFAULT));
                                arregloBotones[i][j].setIcon(image);
                                for (int x = 0; x < matriz.length; x++) {
                                    for (int y = 0; y < matriz[x].length; y++) {
                                        if (matriz[x][y] == getBotonAnterior()) {
                                            matriz[x][y].setIcon(image);
                                            break;
                                        }
                                    }

                                }
                                setMascotaAnterior(null);
                                setBotonAnterior(null);
                                setTurnoJugador(turno());
                            }
                        }
                        break;
                    }
                    if (getMascotaAnterior() == null) {
                        setMascotaAnterior(mascota);
                        setBotonAnterior(getArregloBotones()[i][j]);
                    }
                }

            }
        }
    }

    public boolean turno() {
        return !isTurnoJugador();
    }

}
