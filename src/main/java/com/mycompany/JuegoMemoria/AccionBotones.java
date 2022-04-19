package com.mycompany.JuegoMemoria;

import static com.mycompany.Controladores.ControladorOro.establecerOroPrincipal;
import static com.mycompany.Controladores.ControladorOro.getOro;
import static com.mycompany.Controladores.ControladorOro.setOro;
import static com.mycompany.Controladores.ObtenerFechaHora.obtenerFecha;
import static com.mycompany.Controladores.ObtenerFechaHora.obtenerHora;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.cmbMascotasJugador;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.getMascotasJugador;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.getMonedasOro;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.setMonedaOro;
import static com.mycompany.JuegoMemoria.JFrameMemoria.getBotonAnterior;
import static com.mycompany.JuegoMemoria.JFrameMemoria.getContadorClik;
import static com.mycompany.JuegoMemoria.JFrameMemoria.getMascotaAnterior;
import static com.mycompany.JuegoMemoria.JFrameMemoria.getParejasEnemigo;
import static com.mycompany.JuegoMemoria.JFrameMemoria.getParejasJugador;
import static com.mycompany.JuegoMemoria.JFrameMemoria.isTurnoJugador;
import static com.mycompany.JuegoMemoria.JFrameMemoria.lblParesEn;
import static com.mycompany.JuegoMemoria.JFrameMemoria.lblParesPk;
import static com.mycompany.JuegoMemoria.JFrameMemoria.lblTurno;
import static com.mycompany.JuegoMemoria.JFrameMemoria.matriz;
import static com.mycompany.JuegoMemoria.JFrameMemoria.setBotonAnterior;
import static com.mycompany.JuegoMemoria.JFrameMemoria.setContadorClik;
import static com.mycompany.JuegoMemoria.JFrameMemoria.setMascotaAnterior;
import static com.mycompany.JuegoMemoria.JFrameMemoria.setParejasEnemigo;
import static com.mycompany.JuegoMemoria.JFrameMemoria.setParejasJugador;
import static com.mycompany.JuegoMemoria.JFrameMemoria.setTurnoJugador;
import com.mycompany.Reportes.ControlReportes;
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
                if (e.getSource().equals(getArregloBotones()[i][j]) && arregloBotones[i][j] != getBotonAnterior()) {
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
                                setContadorClik(getContadorClik() + 1);
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
                                setParejasJugador(getParejasJugador() + 1);
                                break;
                            } else {
                                setVictoriaEnemigo(getVictoriaEnemigo() + 1);
                                JOptionPane.showMessageDialog(null, "Turno Enemigo. Pareja encontrda, continue con el turno");
                                arregloBotones[i][j].setEnabled(false);
                                setContadorClik(getContadorClik() + 1);
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
                                setParejasEnemigo(getParejasEnemigo() + 1);
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
        int num = matriz.length;
        int nume = matriz[0].length;
        int lim = (num * nume) / 2;
        if (getContadorClik() == lim) {
            if (getParejasJugador() > getParejasEnemigo()) {
                calcularOroGanado();
            } else {
                JOptionPane.showMessageDialog(null, "Batalla perdida.");
            }

        }
        lblParesEn.setText("Pares Pokemon Salvaje: "+ getParejasEnemigo());
        lblParesPk.setText("Pares Pokemon Salvaje: "+ getParejasJugador());
        if(isTurnoJugador() == true){
            lblTurno.setText("Turno: Mi pokemon");
        }else{
            lblTurno.setText("Turno: Pokemon Salvaje");
        }
    }

    public boolean turno() {
        return !isTurnoJugador();
    }

    public void calcularOroGanado() {
        String nombre = (String) cmbMascotasJugador.getSelectedItem();
        for (int i = 0; i < getMascotasJugador().length; i++) {
            if (getMascotasJugador()[i].getNombreMascota().equals(nombre)) {
                int numero = (int) (Math.random() * 15 + 1);
                int oroGando = 10 + (20 * getMascotasJugador()[i].getNivel()) + (numero);
                setMonedaOro(getMonedasOro() + oroGando);
                setOro(getOro() + oroGando);
                establecerOroPrincipal();
                getMascotasJugador()[i].setBatallasGanadas( getMascotasJugador()[i].getBatallasGanadas()+1);
                //se sube de nivel
                if(getMascotasJugador()[i].getBatallasGanadas() == getMascotasJugador()[i].getLimBatallasGanadas()){
                    ControlReportes control = new ControlReportes();
                    getMascotasJugador()[i].setNivel(getMascotasJugador()[i].getNivel()+1);
                    control.agregarRepote(getMascotasJugador()[i].getNombreMascota(), "Subio nivel", obtenerFecha(), obtenerHora(), getMascotasJugador()[i].getNivel());
                    getMascotasJugador()[i].setBatallasGanadas(0);
                    getMascotasJugador()[i].calcularLimiteBatallas();
                }
                JOptionPane.showMessageDialog(null, String.format("Felicidades Batalla ganada, Oro obtenido: %d", oroGando));
            }

        }

    }

}
