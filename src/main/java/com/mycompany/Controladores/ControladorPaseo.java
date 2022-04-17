package com.mycompany.Controladores;

import com.mycompany.JFrameMascotaVirtual.EstablecerImagenes;
import static com.mycompany.JFrameMascotaVirtual.Paseo.lblImg1;
import static com.mycompany.JFrameMascotaVirtual.Paseo.lblImg2;
import static com.mycompany.JFrameMascotaVirtual.Paseo.lblImg3;
import static com.mycompany.JFrameMascotaVirtual.Paseo.lblImgEnemigo;
import static com.mycompany.JuegoMemoria.EstablecerMatriz.matriz;
import static com.mycompany.JuegoMemoria.JFrameMemoria.setMascota;
import com.mycompany.Personajes.Enemigo;
import com.mycompany.mascotas.Mascota;
import javax.swing.JOptionPane;

public class ControladorPaseo extends Thread {

    private static boolean salir;
    private boolean batalla;
    private Mascota mascota;
    private static Mascota mascotaObtenida;
    private Mascota mascotaSalvaje;

    public ControladorPaseo(Mascota mascota) {
        setSalir(false);
        this.mascota = mascota;
        mascotaSalvaje = new Mascota();
        setMascota(this.mascota);
    }

    public static Mascota getMascotaObtenida() {
        return mascotaObtenida;
    }

    public static void setMascotaObtenida(Mascota mascotaObtenida) {
        ControladorPaseo.mascotaObtenida = mascotaObtenida;
    }

    public static boolean isSalir() {
        return salir;
    }

    public static void setSalir(boolean salir) {
        ControladorPaseo.salir = salir;
    }

    public boolean isBatalla() {
        return batalla;
    }

    public void setBatalla(boolean batalla) {
        this.batalla = batalla;
    }

    @Override
    public void run() {
        EstablecerImagenes establecer = new EstablecerImagenes();
        String path = "src/main/java/com/mycompany/Imagenes/AshP.jpg";
        int tiempo = 2000;
        while (salir != true) {
            try {
                sleep(tiempo);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, "Algo paso");
            }
            lblImgEnemigo.setIcon(null);
            lblImg3.setIcon(null);
            establecer.establecerImagen(lblImg1, path);
            try {
                sleep(tiempo);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, "Algo paso");
            }
            lblImg1.setIcon(null);
            establecer.establecerImagen(lblImg2, path);
            try {
                sleep(tiempo);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, "Algo paso");
            }
            lblImg2.setIcon(null);
            establecer.establecerImagen(lblImg3, path);
            batalla = decidirBatalla();
            if (batalla == true) {
                Enemigo enemigo = new Enemigo();
                mascotaSalvaje = enemigo.obtenerMascota(mascota);
                establecer.establecerImagen(lblImgEnemigo, mascota.getPathImagen());
                JOptionPane.showMessageDialog(null, "Has encontrado a un pokemon Salvaje");
                matriz(mascotaSalvaje);
                this.stop();
            }
        }
    }

    public boolean decidirBatalla() {
        boolean decicion;
        int numero = (int) (Math.random() * 100 + 1);
        if (numero > 0 && numero < 51) {
            decicion = true;
        } else {
            decicion = false;
        }
        return decicion;
    }
}
