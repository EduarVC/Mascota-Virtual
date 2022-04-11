package com.mycompany.Personajes;

import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.cmbMascotasJugador;
import com.mycompany.Tienda.Tienda;
import com.mycompany.mascotas.Mascota;
import com.mycompany.mascotavirtual.MascotasExistentes;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;

public class Jugador {

    private int monedasOro;
    private MascotasExistentes mascotaAdquirida;
    protected Mascota[] mascotasAdquiridas;
    private Mascota[] mascotas;

    public Jugador() {

        mascotaAdquirida = new MascotasExistentes();
        mascotasAdquiridas = new Mascota[1];
        setMonedasOro(100);
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

    public void comprarMascota(int numeroMascota, Mascota[] mascotasJugador) {

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
        setMonedasOro(monedasOro - 50);

    }

    public void setMascotasAdquiridas(Mascota[] mascotasAdquiridas) {
        this.mascotasAdquiridas = mascotasAdquiridas;
    }

    public int getMonedasOro() {
        return monedasOro;
    }

    public void setMonedasOro(int monedasOro) {
        this.monedasOro = monedasOro;
    }

}
