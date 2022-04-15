package com.mycompany.Personajes;

import com.mycompany.Alimentos.Cereal;
import com.mycompany.Alimentos.InterfasAlimento;
import com.mycompany.Alimentos.Waffle;
import com.mycompany.Controladores.ControladorComboBox;
import com.mycompany.Controladores.ControladorOro;
import static com.mycompany.Controladores.ControladorOro.precioRevivir;
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
    private InterfasAlimento alimento;

    public Jugador() {
        alimento = new Cereal();
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
        numero = (int) (Math.random() * 20 + 1);
        mascotasAdquiridas[0] = mascotaAdquirida.obtenerMascota(numero);
        JOptionPane.showMessageDialog(null, "Obtuviste el pokemon: " + mascotasAdquiridas[0].getNombreMascota());
        setMascotasAdquiridas(mascotasAdquiridas);
        getMascotasAdquiridas()[0].start();
        for (int i = 0; i < mascotasAdquiridas.length; i++) {
            System.out.println(mascotasAdquiridas[i]);
        }
    }

    public void comprarMascota(int numeroMascota, Mascota[] mascotasJugador, int monedasOro) {
        this.monedasOro = monedasOro;
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
        String apodo = JOptionPane.showInputDialog("Ingrese un apodo para su nuevo pokemon");
        if (!"".equals(apodo)) {
            mascotas[mascotas.length - 1].setApodoMascota(apodo);
        }
        mascotas[mascotas.length - 1].start();
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
                        if (mascotasJugador[i].getConteoComidasAcumuladas() > 0) {
                            mascotasJugador[i].setAlimentada(true);
                            mascotasJugador[i].setConteoComidasAcumuladas(mascotasJugador[i].getConteoComidasAcumuladas() - 1);
                        }

                        JOptionPane.showMessageDialog(null, "Pokemon Alimentado Exitosamente");
                        mascotasJugador[i].setConteoAlimentos(mascotasJugador[i].getConteoAlimentos() + 1);
                        mascotasJugador[i].setComidasAcumuladas(5);
                        break;
                    case 2:
                        if (mascotasJugador[i].getConteoComidasAcumuladas() > 0) {
                            mascotasJugador[i].setAlimentada(true);
                            mascotasJugador[i].setConteoComidasAcumuladas(mascotasJugador[i].getConteoComidasAcumuladas() - 1);
                        }

                        alimento.AumentarComidasPendientes(mascotasJugador[i]);
                        JOptionPane.showMessageDialog(null, "Pokemon Alimentado Exitosamente");
                        mascotasJugador[i].setConteoAlimentos(mascotasJugador[i].getConteoAlimentos() + 1);
                        break;
                    case 3:
                        if (mascotasJugador[i].getConteoComidasAcumuladas() > 0) {
                            mascotasJugador[i].setAlimentada(true);
                            mascotasJugador[i].setConteoComidasAcumuladas(mascotasJugador[i].getConteoComidasAcumuladas() - 1);
                        }
                        alimentos.AumentarComidasPendientes(mascotasJugador[i]);
                        JOptionPane.showMessageDialog(null, "Pokemon Alimentado Exitosamente");
                        mascotasJugador[i].setConteoAlimentos(mascotasJugador[i].getConteoAlimentos() + 1);
                        break;
                    default:
                        break;
                }
                if (mascotasJugador[i].getConteoAlimentos() == 2) {
                    JOptionPane.showMessageDialog(null, String.format("el pokemon %s necesita limpieza", mascotasJugador[i].getNombreMascota()));
                    mascotasJugador[i].setConteoLimpiezaAcumulada(mascotasJugador[i].getConteoLimpiezaAcumulada() + 1);
                    if (mascotasJugador[i].getConteoLimpiezaAcumulada() >= 3) {
                        mascotasJugador[i].setConteoEnfermedadesAcumuladas(mascotasJugador[i].getConteoEnfermedadesAcumuladas() + 1);
                        mascotasJugador[i].setEnferma(true);
                        JOptionPane.showMessageDialog(null, String.format("el pokemon %s a contraido una nueva enfermedad", mascotasJugador[i].getNombreMascota()));
                        mascotasJugador[i].setConteoLimpiezaAcumulada(0);
                    }
                    mascotasJugador[i].setConteoAlimentos(0);
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
                if (mascotasJugador[i].getConteoEnfermedadesAcumuladas() > 0) {
                    switch (numeroMedicina) {
                        case 1:
                            mascotasJugador[i].setConteoEnfermedadesAcumuladas(mascotasJugador[i].getConteoEnfermedadesAcumuladas() - 1);
                            JOptionPane.showMessageDialog(null, "Medicina aplicada exitosamente");
                            break;
                        case 2:
                            if (mascotasJugador[i].getConteoEnfermedadesAcumuladas() >= 2) {
                                mascotasJugador[i].setConteoEnfermedadesAcumuladas(mascotasJugador[i].getConteoEnfermedadesAcumuladas() - 2);
                                JOptionPane.showMessageDialog(null, "Medicina aplicada exitosamente");
                            } else {
                                mascotasJugador[i].setConteoEnfermedadesAcumuladas(mascotasJugador[i].getConteoEnfermedadesAcumuladas() - 1);
                                JOptionPane.showMessageDialog(null, "Medicina aplicada exitosamente");
                            }
                            break;
                        case 3:
                            if (mascotasJugador[i].getConteoEnfermedadesAcumuladas() >= 3) {
                                mascotasJugador[i].setConteoEnfermedadesAcumuladas(mascotasJugador[i].getConteoEnfermedadesAcumuladas() - 3);
                                JOptionPane.showMessageDialog(null, "Medicina aplicada exitosamente");
                            } else if (mascotasJugador[i].getConteoEnfermedadesAcumuladas() == 2) {
                                mascotasJugador[i].setConteoEnfermedadesAcumuladas(mascotasJugador[i].getConteoEnfermedadesAcumuladas() - 2);
                                JOptionPane.showMessageDialog(null, "Medicina aplicada exitosamente");
                            } else {
                                mascotasJugador[i].setConteoEnfermedadesAcumuladas(mascotasJugador[i].getConteoEnfermedadesAcumuladas() - 1);
                                JOptionPane.showMessageDialog(null, "Medicina aplicada exitosamente");
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                    if (mascotasJugador[i].getConteoEnfermedadesAcumuladas() == 0) {
                        mascotasJugador[i].setEnferma(false);
                        JOptionPane.showMessageDialog(null, "MPokemon Curado completamente");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El pokemon seleccionado no esta enferma");
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

    public void revivirMascota(Mascota mascotaRevivida, Mascota[] mascotasJugador, int monedasOro, Mascota[] mascotasMuertas) {
        ControladorComboBox controlador = new ControladorComboBox();
        this.monedasOro = monedasOro;
        int precioRevivir;
        precioRevivir = precioRevivir(mascotaRevivida);
        for (int i = 0; i < mascotasJugador.length; i++) {
            System.out.println(mascotasJugador[i]);
        }
        mascotas = new Mascota[mascotasJugador.length + 1];
        for (int i = 0; i < mascotas.length; i++) {
            if (i == mascotas.length - 1) {
                mascotas[i] = mascotaAdquirida.obtenerMascota(mascotaRevivida.getNumeroMascota());
            } else {
                mascotas[i] = mascotasJugador[i];
            }
        }

        setMascotasAdquiridas(mascotas);

        JOptionPane.showMessageDialog(null, "Obtuviste el pokemon: " + mascotas[mascotas.length - 1].getNombreMascota());
        mascotas[mascotas.length - 1].start();
        for (int i = 0; i < getMascotasAdquiridas().length; i++) {
            System.out.println(getMascotasAdquiridas()[i]);

        }
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbMascotasJugador.getModel();
        model.addElement(getMascotasAdquiridas()[getMascotasAdquiridas().length - 1].getNombreMascota());
        monedasOro = restarMonedasOro(precioRevivir);
        setMascotasJugador(getMascotasAdquiridas());
        controlador.cambioMascotasMuertas(mascotaRevivida, mascotasMuertas);
        setMonedaOro(monedasOro);
        setOro(monedasOro);
        ControladorOro.establecerOroLblRevivir();
    }

    public void setMascotasAdquiridas(Mascota[] mascotasAdquiridas) {
        this.mascotasAdquiridas = mascotasAdquiridas;
    }

    public int restarMonedasOro(int monedasRestadas) {
        return monedasOro -= monedasRestadas;
    }

}
