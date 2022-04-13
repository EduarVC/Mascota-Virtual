package com.mycompany.Personajes;

import com.mycompany.Alimentos.Cereal;
import com.mycompany.Alimentos.InterfasAlimento;
import com.mycompany.Alimentos.Waffle;
import com.mycompany.Controladores.ControladorOro;
import static com.mycompany.Controladores.ControladorOro.setOro;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.cmbMascotasJugador;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.setMascotasJugador;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.setMonedaOro;
import com.mycompany.mascotas.Mascota;
import com.mycompany.mascotavirtual.MascotasExistentes;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;

public class Jugador {

    public int monedasOro;
    private MascotasExistentes mascotaAdquirida;
    protected Mascota[] mascotasAdquiridas;
    private Mascota[] mascotas;
    private InterfasAlimento alimentos;

    public Jugador() {
        alimentos = new Cereal();
        alimentos = new Waffle();
        mascotaAdquirida = new MascotasExistentes();
        mascotasAdquiridas = new Mascota[1];
    }

    //Se obtiene una mascota Inicial aleatoriamente 
    public Mascota[] getMascotasAdquiridas() {
        return mascotasAdquiridas;
    }

    public void obtenerMascotaPrincipal() {
        int numero;
        numero = (int) (Math.random() * 6 + 1);
        mascotasAdquiridas[0] = mascotaAdquirida.obtenerMascota(numero);
        JOptionPane.showMessageDialog(null, "Obtuviste el pokemon: " + mascotasAdquiridas[0].getNombreMascota());
        setMascotasAdquiridas(mascotasAdquiridas);
        for (int i = 0; i < mascotasAdquiridas.length; i++) {
            System.out.println(mascotasAdquiridas[i]);
        }
    }

    public void comprarMascota(int numeroMascota, Mascota[] mascotasJugador, int monedasOro) {
        this.monedasOro = monedasOro;
        for (int i = 0; i < mascotasJugador.length; i++) {
            System.out.println(mascotasJugador[i]);
        }
        mascotas = new Mascota[mascotasJugador.length + 1];
        for (int i = 0; i < mascotas.length; i++) {
            if (i == mascotas.length - 1) {
                mascotas[i] = mascotaAdquirida.obtenerMascota(numeroMascota);
            } else {
                mascotas[i] = mascotasJugador[i];
            }
        }
        setMascotasAdquiridas(mascotas);

        JOptionPane.showMessageDialog(null, "Obtuviste el pokemon: " + mascotas[mascotas.length - 1].getNombreMascota());
        for (int i = 0; i < getMascotasAdquiridas().length; i++) {
            System.out.println(getMascotasAdquiridas()[i]);

        }
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbMascotasJugador.getModel();
        model.addElement(getMascotasAdquiridas()[getMascotasAdquiridas().length - 1].getNombreMascota());
        monedasOro = restarMonedasOro(50);
        setMascotasJugador(getMascotasAdquiridas());
        setMonedaOro(monedasOro);
        setOro(monedasOro);
        ControladorOro.establecerOroLblTiendaPok();
    }

    public void comprarAlimento(int numeroAlimento, Mascota[] mascotasJugador, int monedasOro) {
        this.monedasOro = monedasOro;
        String nombreMascotaSeleccionada = (String) cmbMascotasJugador.getSelectedItem();
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].getNombreMascota().equals(nombreMascotaSeleccionada)) {
                switch (numeroAlimento) {
                    case 1:
                        mascotasJugador[i].setAlimentada(true);
                        JOptionPane.showMessageDialog(null, "Mascota Alimentada Exitosamente");
                        break;
                    case 2:
                        mascotasJugador[i].setAlimentada(true);
                        alimentos.AumentarComidasPendientes(mascotasJugador[i]);
                        JOptionPane.showMessageDialog(null, "Mascota Alimentada Exitosamente");
                        break;
                    case 3:
                        mascotasJugador[i].setAlimentada(true);
                        alimentos.AumentarComidasPendientes(mascotasJugador[i]);
                        JOptionPane.showMessageDialog(null, "Mascota Alimentada Exitosamente");
                        break;
                    default:
                        break;
                }
                break;
            }
        }
        switch (numeroAlimento) {
            case 1:
                monedasOro = restarMonedasOro(10);
                break;
            case 2:
                monedasOro = restarMonedasOro(30);
                break;
            case 3:
                monedasOro = restarMonedasOro(50);
                break;
            default:
                break;
        }
        setMascotasAdquiridas(mascotasJugador);
        setMascotasJugador(getMascotasAdquiridas());
        setMonedaOro(monedasOro);
        setOro(monedasOro);
        ControladorOro.establecerOroLblTiendaAlim();
    }

    public void ComprarMedicina(int numeroMedicina, Mascota[] mascotasJugador, int monedasOro) {
        this.monedasOro = monedasOro;
        String nombreMascotaSeleccionada = (String) cmbMascotasJugador.getSelectedItem();
        for (int i = 0; i < mascotasJugador.length; i++) {
            if (mascotasJugador[i].getNombreMascota().equals(nombreMascotaSeleccionada)) {
                if (mascotasJugador[i].isEnferma() == true) {
                    switch (numeroMedicina) {
                        case 1:
                            mascotasJugador[i].setEnfermedadesAcumuladas(mascotasJugador[i].getEnfermedadesAcumuladas() - 1);
                            JOptionPane.showMessageDialog(null, "Medicita aplicada exitosamente");
                            break;
                        case 2:
                            if (mascotasJugador[i].getEnfermedadesAcumuladas() >= 2) {
                                mascotasJugador[i].setEnfermedadesAcumuladas(mascotasJugador[i].getEnfermedadesAcumuladas() - 2);
                                JOptionPane.showMessageDialog(null, "Medicita aplicada exitosamente");
                            } else {
                                mascotasJugador[i].setEnfermedadesAcumuladas(mascotasJugador[i].getEnfermedadesAcumuladas() - 1);
                                JOptionPane.showMessageDialog(null, "Medicita aplicada exitosamente");
                            }
                            break;
                        case 3:
                            if (mascotasJugador[i].getEnfermedadesAcumuladas() >= 3) {
                                mascotasJugador[i].setEnfermedadesAcumuladas(mascotasJugador[i].getEnfermedadesAcumuladas() - 3);
                                JOptionPane.showMessageDialog(null, "Medicita aplicada exitosamente");
                            } else if (mascotasJugador[i].getEnfermedadesAcumuladas() == 2) {
                                mascotasJugador[i].setEnfermedadesAcumuladas(mascotasJugador[i].getEnfermedadesAcumuladas() - 2);
                                JOptionPane.showMessageDialog(null, "Medicita aplicada exitosamente");
                            } else {
                                mascotasJugador[i].setEnfermedadesAcumuladas(mascotasJugador[i].getEnfermedadesAcumuladas() - 1);
                                JOptionPane.showMessageDialog(null, "Medicita aplicada exitosamente");
                            }
                        default:
                            throw new AssertionError();
                    }
                    if (mascotasJugador[i].getEnfermedadesAcumuladas() == 0) {
                        mascotasJugador[i].setEnferma(false);
                        JOptionPane.showMessageDialog(null, "Mascota Curada completamente");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La mascota seleccionada no esta enferma");
                }
            }
        }
        switch (numeroMedicina) {
            case 1:
                monedasOro = restarMonedasOro(20);
                break;
            case 2:
                monedasOro = restarMonedasOro(50);
                break;
            case 3:
                monedasOro = restarMonedasOro(80);
                break;
            default:
                break;
        }
        setMascotasAdquiridas(mascotasJugador);
        setMascotasJugador(getMascotasAdquiridas());
        setMonedaOro(monedasOro);
        setOro(monedasOro);
        ControladorOro.establecerOroLblTiendaMed();
    }

    public void setMascotasAdquiridas(Mascota[] mascotasAdquiridas) {
        this.mascotasAdquiridas = mascotasAdquiridas;
    }

    public int restarMonedasOro(int monedasRestadas) {
        return monedasOro -= monedasRestadas;
    }

}
